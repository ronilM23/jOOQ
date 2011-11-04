/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class FArrays1 extends org.jooq.impl.AbstractRoutine<org.jooq.test.oracle.generatedclasses.udt.records.UNumberArrayRecord> {

	private static final long serialVersionUID = 1144831001;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle.generatedclasses.udt.records.UNumberArrayRecord> RETURN_VALUE = new org.jooq.impl.ParameterImpl<org.jooq.test.oracle.generatedclasses.udt.records.UNumberArrayRecord>("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER.asArrayDataType(org.jooq.test.oracle.generatedclasses.udt.records.UNumberArrayRecord.class));

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle.generatedclasses.udt.records.UNumberArrayRecord> IN_ARRAY = new org.jooq.impl.ParameterImpl<org.jooq.test.oracle.generatedclasses.udt.records.UNumberArrayRecord>("IN_ARRAY", org.jooq.impl.SQLDataType.INTEGER.asArrayDataType(org.jooq.test.oracle.generatedclasses.udt.records.UNumberArrayRecord.class));

	/**
	 * Create a new routine call instance
	 */
	public FArrays1() {
		super(org.jooq.SQLDialect.ORACLE, "F_ARRAYS1", org.jooq.test.oracle.generatedclasses.Test.TEST, org.jooq.impl.SQLDataType.INTEGER.asArrayDataType(org.jooq.test.oracle.generatedclasses.udt.records.UNumberArrayRecord.class));

		setReturnParameter(RETURN_VALUE);
		addInParameter(IN_ARRAY);
	}

	/**
	 * Set the <code>IN_ARRAY</code> parameter to the routine
	 */
	public void setInArray(org.jooq.test.oracle.generatedclasses.udt.records.UNumberArrayRecord value) {
		setValue(IN_ARRAY, value);
	}

	/**
	 * Set the <code>IN_ARRAY</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setInArray(org.jooq.Field<org.jooq.test.oracle.generatedclasses.udt.records.UNumberArrayRecord> field) {
		setField(IN_ARRAY, field);
	}
}
