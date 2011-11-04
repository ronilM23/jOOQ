/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class PGetTwoCursors extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -1449505402;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.Result<org.jooq.Record>> BOOKS = new org.jooq.impl.ParameterImpl<org.jooq.Result<org.jooq.Record>>("books", org.jooq.impl.SQLDataType.RESULT);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.Result<org.jooq.Record>> AUTHORS = new org.jooq.impl.ParameterImpl<org.jooq.Result<org.jooq.Record>>("authors", org.jooq.impl.SQLDataType.RESULT);

	/**
	 * Create a new routine call instance
	 */
	public PGetTwoCursors() {
		super(org.jooq.SQLDialect.POSTGRES, "p_get_two_cursors", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);

		addOutParameter(BOOKS);
		addOutParameter(AUTHORS);
	}

	public org.jooq.Result<org.jooq.Record> getBooks() {
		return getValue(BOOKS);
	}

	public org.jooq.Result<org.jooq.Record> getAuthors() {
		return getValue(AUTHORS);
	}
}
