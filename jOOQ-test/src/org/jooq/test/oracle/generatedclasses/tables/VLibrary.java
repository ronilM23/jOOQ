/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class VLibrary extends org.jooq.impl.TableImpl<org.jooq.test.oracle.generatedclasses.tables.records.VLibraryRecord> {

	private static final long serialVersionUID = 27878058;

	/**
	 * The singleton instance of V_LIBRARY
	 */
	public static final org.jooq.test.oracle.generatedclasses.tables.VLibrary V_LIBRARY = new org.jooq.test.oracle.generatedclasses.tables.VLibrary();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.oracle.generatedclasses.tables.records.VLibraryRecord> __RECORD_TYPE = org.jooq.test.oracle.generatedclasses.tables.records.VLibraryRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle.generatedclasses.tables.records.VLibraryRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.tables.records.VLibraryRecord, java.lang.String> AUTHOR = new org.jooq.impl.TableFieldImpl<org.jooq.test.oracle.generatedclasses.tables.records.VLibraryRecord, java.lang.String>("AUTHOR", org.jooq.impl.SQLDataType.VARCHAR, V_LIBRARY);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.tables.records.VLibraryRecord, java.lang.String> TITLE = new org.jooq.impl.TableFieldImpl<org.jooq.test.oracle.generatedclasses.tables.records.VLibraryRecord, java.lang.String>("TITLE", org.jooq.impl.SQLDataType.VARCHAR, V_LIBRARY);

	/**
	 * No further instances allowed
	 */
	private VLibrary() {
		super("V_LIBRARY", org.jooq.test.oracle.generatedclasses.Test.TEST);
	}
}
