/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class P391 extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 734544931;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> I1 = new org.jooq.impl.ParameterImpl<java.lang.Integer>("I1", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> IO1 = new org.jooq.impl.ParameterImpl<java.lang.Integer>("IO1", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> O1 = new org.jooq.impl.ParameterImpl<java.lang.Integer>("O1", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> O2 = new org.jooq.impl.ParameterImpl<java.lang.Integer>("O2", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> IO2 = new org.jooq.impl.ParameterImpl<java.lang.Integer>("IO2", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> I2 = new org.jooq.impl.ParameterImpl<java.lang.Integer>("I2", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public P391() {
		super(org.jooq.SQLDialect.HSQLDB, "P391", org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC);

		addInParameter(I1);
		addInOutParameter(IO1);
		addOutParameter(O1);
		addOutParameter(O2);
		addInOutParameter(IO2);
		addInParameter(I2);
	}

	/**
	 * Set the <code>I1</code> parameter to the routine
	 */
	public void setI1(java.lang.Integer value) {
		setValue(I1, value);
	}

	/**
	 * Set the <code>IO1</code> parameter to the routine
	 */
	public void setIo1(java.lang.Integer value) {
		setValue(IO1, value);
	}

	/**
	 * Set the <code>IO2</code> parameter to the routine
	 */
	public void setIo2(java.lang.Integer value) {
		setValue(IO2, value);
	}

	/**
	 * Set the <code>I2</code> parameter to the routine
	 */
	public void setI2(java.lang.Integer value) {
		setValue(I2, value);
	}

	public java.lang.Integer getIo1() {
		return getValue(IO1);
	}

	public java.lang.Integer getO1() {
		return getValue(O1);
	}

	public java.lang.Integer getO2() {
		return getValue(O2);
	}

	public java.lang.Integer getIo2() {
		return getValue(IO2);
	}
}
