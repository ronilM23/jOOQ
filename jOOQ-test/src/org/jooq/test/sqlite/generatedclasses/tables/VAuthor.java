/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class VAuthor extends org.jooq.impl.TableImpl<org.jooq.test.sqlite.generatedclasses.tables.records.VAuthorRecord> {

	private static final long serialVersionUID = -812890245;

	/**
	 * The singleton instance of v_author
	 */
	public static final org.jooq.test.sqlite.generatedclasses.tables.VAuthor V_AUTHOR = new org.jooq.test.sqlite.generatedclasses.tables.VAuthor();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.sqlite.generatedclasses.tables.records.VAuthorRecord> __RECORD_TYPE = org.jooq.test.sqlite.generatedclasses.tables.records.VAuthorRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sqlite.generatedclasses.tables.records.VAuthorRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.VAuthorRecord, java.lang.Integer> ID = new org.jooq.impl.TableFieldImpl<org.jooq.test.sqlite.generatedclasses.tables.records.VAuthorRecord, java.lang.Integer>("ID", org.jooq.impl.SQLDataType.INTEGER, V_AUTHOR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.VAuthorRecord, java.lang.String> FIRST_NAME = new org.jooq.impl.TableFieldImpl<org.jooq.test.sqlite.generatedclasses.tables.records.VAuthorRecord, java.lang.String>("FIRST_NAME", org.jooq.impl.SQLDataType.VARCHAR, V_AUTHOR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.VAuthorRecord, java.lang.String> LAST_NAME = new org.jooq.impl.TableFieldImpl<org.jooq.test.sqlite.generatedclasses.tables.records.VAuthorRecord, java.lang.String>("LAST_NAME", org.jooq.impl.SQLDataType.VARCHAR, V_AUTHOR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.VAuthorRecord, java.sql.Date> DATE_OF_BIRTH = new org.jooq.impl.TableFieldImpl<org.jooq.test.sqlite.generatedclasses.tables.records.VAuthorRecord, java.sql.Date>("DATE_OF_BIRTH", org.jooq.impl.SQLDataType.DATE, V_AUTHOR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.VAuthorRecord, java.lang.Integer> YEAR_OF_BIRTH = new org.jooq.impl.TableFieldImpl<org.jooq.test.sqlite.generatedclasses.tables.records.VAuthorRecord, java.lang.Integer>("YEAR_OF_BIRTH", org.jooq.impl.SQLDataType.INTEGER, V_AUTHOR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.VAuthorRecord, java.lang.String> ADDRESS = new org.jooq.impl.TableFieldImpl<org.jooq.test.sqlite.generatedclasses.tables.records.VAuthorRecord, java.lang.String>("ADDRESS", org.jooq.impl.SQLDataType.VARCHAR, V_AUTHOR);

	/**
	 * No further instances allowed
	 */
	private VAuthor() {
		super("v_author");
	}
}
