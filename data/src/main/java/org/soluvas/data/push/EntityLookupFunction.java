package org.soluvas.data.push;

import java.io.Serializable;
import java.util.NoSuchElementException;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.soluvas.data.EntityLookup;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;

/**
 * Adapts an {@link EntityLookup} into Guava {@link Function}.
 * Note: null IDs are returned as null.
 * @author ceefour
 */
public class EntityLookupFunction<ID extends Serializable, T> implements Function<ID, T> {
	
	private final EntityLookup<T, ID> entityLookup;
	private final boolean allowNull;
	
	/**
	 * Defaults to allowNull = false, i.e. will throw Cannot find entity with ID "...".
	 * @param entityLookup
	 */
	public EntityLookupFunction(@Nonnull final EntityLookup<T, ID> entityLookup) {
		this(entityLookup, false);
	}

	public EntityLookupFunction(@Nonnull final EntityLookup<T, ID> entityLookup, final boolean allowNull) {
		super();
		this.entityLookup = Preconditions.checkNotNull(entityLookup,
				"entityLookup cannot be null");
		this.allowNull = allowNull;
	}

	@Override
	public T apply(@Nullable final ID id) {
		final T entity = id != null ? entityLookup.findOne(id) : null;
		if (!allowNull && id != null && entity == null)
			throw new NoSuchElementException("Cannot find entity '" + id + "' using " + entityLookup);
		return entity;
	};

}
