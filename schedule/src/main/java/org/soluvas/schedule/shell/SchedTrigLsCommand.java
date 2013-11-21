package org.soluvas.schedule.shell;

import static org.fusesource.jansi.Ansi.ansi;

import java.util.Set;

import javax.annotation.Nullable;

import org.apache.felix.gogo.commands.Command;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.Trigger.TriggerState;
import org.quartz.TriggerKey;
import org.quartz.impl.matchers.GroupMatcher;
import org.soluvas.commons.AppManifest;
import org.soluvas.commons.shell.ExtCommandSupport;
import org.soluvas.commons.tenant.TenantRef;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * List {@link Trigger}s for current {@link TenantRef}'s {@link Scheduler}.
 * @author ceefour
 */
@Service @Scope("prototype")
@Command(scope="sched", name="trigls", description="List Triggers for current tenant's Scheduler.")
public class SchedTrigLsCommand extends ExtCommandSupport {

	@Override @Nullable
	protected Integer doExecute() throws Exception {
		final AppManifest appManifest = getBean(AppManifest.class);
		final DateTimeZone timeZone = appManifest.getDefaultTimeZone();
		final Scheduler scheduler = getBean(Scheduler.class);
		final Set<TriggerKey> triggerKeys = scheduler.getTriggerKeys(GroupMatcher.anyTriggerGroup());
		System.out.println(ansi().render("@|negative_on %3s|%-25s|%-15s|%-8s|%-25s|%-16s|%-16s|%-16s|%-16s|@",
				"№", "Name", "Group", "State", "Job", "Start", "End", "Prev Fire", "Next Fire"));
		final DateTimeFormatter formatter = new DateTimeFormatterBuilder().appendYear(4, 4).appendLiteral('-').appendMonthOfYear(2).appendLiteral('-').appendDayOfMonth(2)
			.appendLiteral(' ').appendHourOfDay(2).appendLiteral(':').appendMinuteOfHour(2)
			.toFormatter().withZone(timeZone);
		int i = 0;
		for (final TriggerKey it : triggerKeys) {
			final Trigger trigger = scheduler.getTrigger(it);
			final TriggerState state = scheduler.getTriggerState(it);
			System.out.println(ansi().render("@|bold,black %3d||@%-25s@|bold,black ||@%-15s@|bold,black ||@%-8s@|bold,black ||@%-25s@|bold,black ||@%-16s@|bold,black ||@%-16s@|bold,black ||@%-16s@|bold,black ||@%-16s",
				++i, it.getName(), it.getGroup(), state, trigger.getJobKey().getName(),
				trigger.getStartTime() != null ? formatter.print(new DateTime(trigger.getStartTime())) : null,
				trigger.getEndTime() != null ? formatter.print(new DateTime(trigger.getEndTime())) : null,
				trigger.getPreviousFireTime() != null ? formatter.print(new DateTime(trigger.getPreviousFireTime())) : null,
				trigger.getNextFireTime() != null ? formatter.print(new DateTime(trigger.getNextFireTime())) : null
			));
		}
		System.out.println(ansi().render("@|bold,yellow %d|@ Triggers (times are in @|bold %s|@)", 
				triggerKeys.size(), timeZone));
		return triggerKeys.size();
	}

}