/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class PEnhanceAddress3 extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -74803178;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle.generatedclasses.udt.records.UAddressTypeRecord> ADDRESS = new org.jooq.impl.ParameterImpl<org.jooq.test.oracle.generatedclasses.udt.records.UAddressTypeRecord>("ADDRESS", org.jooq.test.oracle.generatedclasses.udt.UAddressType.U_ADDRESS_TYPE.getDataType());

	/**
	 * Create a new routine call instance
	 */
	public PEnhanceAddress3() {
		super(org.jooq.SQLDialect.ORACLE, "P_ENHANCE_ADDRESS3", org.jooq.test.oracle.generatedclasses.Test.TEST);

		addInOutParameter(ADDRESS);
	}

	/**
	 * Set the <code>ADDRESS</code> parameter to the routine
	 */
	public void setAddress(org.jooq.test.oracle.generatedclasses.udt.records.UAddressTypeRecord value) {
		setValue(ADDRESS, value);
	}

	public org.jooq.test.oracle.generatedclasses.udt.records.UAddressTypeRecord getAddress() {
		return getValue(ADDRESS);
	}
}
