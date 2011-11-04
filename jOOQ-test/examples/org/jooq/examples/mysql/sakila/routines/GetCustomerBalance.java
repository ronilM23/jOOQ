/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.routines;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class GetCustomerBalance extends org.jooq.impl.AbstractRoutine<java.math.BigDecimal> {

	private static final long serialVersionUID = -1795174624;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> RETURN_VALUE = new org.jooq.impl.ParameterImpl<java.math.BigDecimal>("RETURN_VALUE", org.jooq.impl.SQLDataType.DECIMAL);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> P_CUSTOMER_ID = new org.jooq.impl.ParameterImpl<java.lang.Integer>("p_customer_id", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.sql.Timestamp> P_EFFECTIVE_DATE = new org.jooq.impl.ParameterImpl<java.sql.Timestamp>("p_effective_date", org.jooq.impl.SQLDataType.TIMESTAMP);

	/**
	 * Create a new routine call instance
	 */
	public GetCustomerBalance() {
		super(org.jooq.SQLDialect.MYSQL, "get_customer_balance", org.jooq.examples.mysql.sakila.Sakila.SAKILA, org.jooq.impl.SQLDataType.DECIMAL);

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_CUSTOMER_ID);
		addInParameter(P_EFFECTIVE_DATE);
	}

	/**
	 * Set the <code>p_customer_id</code> parameter to the routine
	 */
	public void setPCustomerId(java.lang.Integer value) {
		setValue(P_CUSTOMER_ID, value);
	}

	/**
	 * Set the <code>p_customer_id</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setPCustomerId(org.jooq.Field<java.lang.Integer> field) {
		setField(P_CUSTOMER_ID, field);
	}

	/**
	 * Set the <code>p_effective_date</code> parameter to the routine
	 */
	public void setPEffectiveDate(java.sql.Timestamp value) {
		setValue(P_EFFECTIVE_DATE, value);
	}

	/**
	 * Set the <code>p_effective_date</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setPEffectiveDate(org.jooq.Field<java.sql.Timestamp> field) {
		setField(P_EFFECTIVE_DATE, field);
	}
}
