/**
 */
package org.soluvas.commons.impl;

import java.io.Serializable;

import org.joda.time.DateTime;
import org.soluvas.commons.CustomerRoleStatus;
import org.soluvas.commons.Identifiable;
import org.soluvas.commons.mongo.DateTimeConverter;

import com.google.code.morphia.annotations.Converters;
import com.google.code.morphia.annotations.Id;


@SuppressWarnings("serial") 
@Converters({DateTimeConverter.class})
public class CustomerRole2 implements Serializable, Identifiable {
	
	public final static String COMMON_ID = "common";
	public final static String MEMBER_ID = "member"; 
	public final static String AGENT_ID = "agent";
	public final static String DROPS_ID = "drops";
	
	protected static final String ID_EDEFAULT = null;
	@Id protected String id = ID_EDEFAULT;
	protected static final String NAME_EDEFAULT = null;
	protected String name = NAME_EDEFAULT;
	protected static final DateTime CREATION_TIME_EDEFAULT = null;
	protected DateTime creationTime = CREATION_TIME_EDEFAULT;
	protected static final DateTime MODIFICATION_TIME_EDEFAULT = null;
	protected DateTime modificationTime = MODIFICATION_TIME_EDEFAULT;
	protected static final String DESCRIPTION_EDEFAULT = null;
	protected String description = DESCRIPTION_EDEFAULT;
	protected static final long SCHEMA_VERSION_EDEFAULT = 3L;
	protected long schemaVersion = SCHEMA_VERSION_EDEFAULT;
	protected static final CustomerRoleStatus STATUS_EDEFAULT = CustomerRoleStatus.ACTIVE;
	protected CustomerRoleStatus status = STATUS_EDEFAULT;
	protected static final boolean READ_ONLY_EDEFAULT = false;
	protected boolean readOnly = READ_ONLY_EDEFAULT;
	protected static final boolean QUICK_SHOP_ENABLED_EDEFAULT = false;
	protected boolean quickShopEnabled = QUICK_SHOP_ENABLED_EDEFAULT;
	protected static final boolean SALES_ORDER_REPORT_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSalesOrderReportEnabled() <em>Sales Order Report Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSalesOrderReportEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean salesOrderReportEnabled = SALES_ORDER_REPORT_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #isHistorySalesOrderEnabled() <em>History Sales Order Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHistorySalesOrderEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HISTORY_SALES_ORDER_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHistorySalesOrderEnabled() <em>History Sales Order Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHistorySalesOrderEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean historySalesOrderEnabled = HISTORY_SALES_ORDER_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #isAgentSalesReportEnabled() <em>Agent Sales Report Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAgentSalesReportEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AGENT_SALES_REPORT_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAgentSalesReportEnabled() <em>Agent Sales Report Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAgentSalesReportEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean agentSalesReportEnabled = AGENT_SALES_REPORT_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #isTransactionHistoryEnabled() <em>Transaction History Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransactionHistoryEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSACTION_HISTORY_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransactionHistoryEnabled() <em>Transaction History Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransactionHistoryEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean transactionHistoryEnabled = TRANSACTION_HISTORY_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #isBookingEnabled() <em>Booking Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBookingEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOOKING_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBookingEnabled() <em>Booking Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBookingEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean bookingEnabled = BOOKING_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #isPaymentGatewayEnabled() <em>Payment Gateway Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPaymentGatewayEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PAYMENT_GATEWAY_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPaymentGatewayEnabled() <em>Payment Gateway Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPaymentGatewayEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean paymentGatewayEnabled = PAYMENT_GATEWAY_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getBookingExpiryTimeInMinutes() <em>Booking Expiry Time In Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingExpiryTimeInMinutes()
	 * @generated
	 * @ordered
	 */
	protected static final int BOOKING_EXPIRY_TIME_IN_MINUTES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBookingExpiryTimeInMinutes() <em>Booking Expiry Time In Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingExpiryTimeInMinutes()
	 * @generated
	 * @ordered
	 */
	protected int bookingExpiryTimeInMinutes = BOOKING_EXPIRY_TIME_IN_MINUTES_EDEFAULT;

	/**
	 * The default value of the '{@link #isDropshipEnabled() <em>Dropship Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDropshipEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DROPSHIP_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDropshipEnabled() <em>Dropship Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDropshipEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean dropshipEnabled = DROPSHIP_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #isReviewReminderEnabled() <em>Review Reminder Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReviewReminderEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REVIEW_REMINDER_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReviewReminderEnabled() <em>Review Reminder Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReviewReminderEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean reviewReminderEnabled = REVIEW_REMINDER_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #isZendeskIntegration() <em>Zendesk Integration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZendeskIntegration()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ZENDESK_INTEGRATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isZendeskIntegration() <em>Zendesk Integration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZendeskIntegration()
	 * @generated
	 * @ordered
	 */
	protected boolean zendeskIntegration = ZENDESK_INTEGRATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getZendeskOrganizationId() <em>Zendesk Organization Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZendeskOrganizationId()
	 * @generated
	 * @ordered
	 */
	protected static final Long ZENDESK_ORGANIZATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZendeskOrganizationId() <em>Zendesk Organization Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZendeskOrganizationId()
	 * @generated
	 * @ordered
	 */
	protected Long zendeskOrganizationId = ZENDESK_ORGANIZATION_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerRole2() {
		super();
	}


	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		id = newId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getCreationTime() {
		return creationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationTime(DateTime newCreationTime) {
		creationTime = newCreationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getModificationTime() {
		return modificationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModificationTime(DateTime newModificationTime) {
		modificationTime = newModificationTime;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	public static long serialVersionUID = SCHEMA_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSchemaVersion() {
		return schemaVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerRoleStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(CustomerRoleStatus newStatus) {
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	 
	public boolean isReadOnly() {
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	 
	public void setReadOnly(boolean newReadOnly) {
		readOnly = newReadOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	 
	public boolean isQuickShopEnabled() {
		return quickShopEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	 
	public void setQuickShopEnabled(boolean newQuickShopEnabled) {
		quickShopEnabled = newQuickShopEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	 
	public boolean isSalesOrderReportEnabled() {
		return salesOrderReportEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	 
	public void setSalesOrderReportEnabled(boolean newSalesOrderReportEnabled) {
		salesOrderReportEnabled = newSalesOrderReportEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	 
	public boolean isHistorySalesOrderEnabled() {
		return historySalesOrderEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	 
	public void setHistorySalesOrderEnabled(boolean newHistorySalesOrderEnabled) {
		historySalesOrderEnabled = newHistorySalesOrderEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	 
	public boolean isAgentSalesReportEnabled() {
		return agentSalesReportEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	 
	public void setAgentSalesReportEnabled(boolean newAgentSalesReportEnabled) {
		agentSalesReportEnabled = newAgentSalesReportEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	 
	public boolean isTransactionHistoryEnabled() {
		return transactionHistoryEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	 
	public void setTransactionHistoryEnabled(boolean newTransactionHistoryEnabled) {
		transactionHistoryEnabled = newTransactionHistoryEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	 
	public boolean isBookingEnabled() {
		return bookingEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	 
	public void setBookingEnabled(boolean newBookingEnabled) {
		bookingEnabled = newBookingEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	 
	public boolean isPaymentGatewayEnabled() {
		return paymentGatewayEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	 
	public void setPaymentGatewayEnabled(boolean newPaymentGatewayEnabled) {
		paymentGatewayEnabled = newPaymentGatewayEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	 
	public int getBookingExpiryTimeInMinutes() {
		return bookingExpiryTimeInMinutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	 
	public void setBookingExpiryTimeInMinutes(int newBookingExpiryTimeInMinutes) {
		bookingExpiryTimeInMinutes = newBookingExpiryTimeInMinutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	 
	public boolean isDropshipEnabled() {
		return dropshipEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	 
	public void setDropshipEnabled(boolean newDropshipEnabled) {
		dropshipEnabled = newDropshipEnabled;
	}

	 
	public boolean isReviewReminderEnabled() {
		return reviewReminderEnabled;
	}

	 
	public void setReviewReminderEnabled(boolean newReviewReminderEnabled) {
		reviewReminderEnabled = newReviewReminderEnabled;
	}

	 
	public boolean isZendeskIntegration() {
		return zendeskIntegration;
	}

	 
	public void setZendeskIntegration(boolean newZendeskIntegration) {
		zendeskIntegration = newZendeskIntegration;
	}

	 
	public Long getZendeskOrganizationId() {
		return zendeskOrganizationId;
	}

	 
	public void setZendeskOrganizationId(Long newZendeskOrganizationId) {
		zendeskOrganizationId = newZendeskOrganizationId;
	}

	@Override
	public String toString() {

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", creationTime: ");
		result.append(creationTime);
		result.append(", modificationTime: ");
		result.append(modificationTime);
		result.append(", description: ");
		result.append(description);
		result.append(", schemaVersion: ");
		result.append(schemaVersion);
		result.append(", status: ");
		result.append(status);
		result.append(", readOnly: ");
		result.append(readOnly);
		result.append(", quickShopEnabled: ");
		result.append(quickShopEnabled);
		result.append(", salesOrderReportEnabled: ");
		result.append(salesOrderReportEnabled);
		result.append(", historySalesOrderEnabled: ");
		result.append(historySalesOrderEnabled);
		result.append(", agentSalesReportEnabled: ");
		result.append(agentSalesReportEnabled);
		result.append(", transactionHistoryEnabled: ");
		result.append(transactionHistoryEnabled);
		result.append(", bookingEnabled: ");
		result.append(bookingEnabled);
		result.append(", paymentGatewayEnabled: ");
		result.append(paymentGatewayEnabled);
		result.append(", bookingExpiryTimeInMinutes: ");
		result.append(bookingExpiryTimeInMinutes);
		result.append(", dropshipEnabled: ");
		result.append(dropshipEnabled);
		result.append(", reviewReminderEnabled: ");
		result.append(reviewReminderEnabled);
		result.append(", zendeskIntegration: ");
		result.append(zendeskIntegration);
		result.append(", zendeskOrganizationId: ");
		result.append(zendeskOrganizationId);
		result.append(')');
		return result.toString();
	}

} //CustomerRole
