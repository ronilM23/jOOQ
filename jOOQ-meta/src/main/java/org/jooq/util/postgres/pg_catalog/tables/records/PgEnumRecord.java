/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.pg_catalog.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class PgEnumRecord extends org.jooq.impl.TableRecordImpl<org.jooq.util.postgres.pg_catalog.tables.records.PgEnumRecord> {

	private static final long serialVersionUID = -262925572;

	/**
	 * An uncommented item
	 */
	public void setEnumtypid(java.lang.Long value) {
		setValue(org.jooq.util.postgres.pg_catalog.tables.PgEnum.ENUMTYPID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Long getEnumtypid() {
		return getValue(org.jooq.util.postgres.pg_catalog.tables.PgEnum.ENUMTYPID);
	}

	/**
	 * An uncommented item
	 */
	public void setEnumlabel(java.lang.String value) {
		setValue(org.jooq.util.postgres.pg_catalog.tables.PgEnum.ENUMLABEL, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getEnumlabel() {
		return getValue(org.jooq.util.postgres.pg_catalog.tables.PgEnum.ENUMLABEL);
	}

	/**
	 * Create a detached PgEnumRecord
	 */
	public PgEnumRecord() {
		super(org.jooq.util.postgres.pg_catalog.tables.PgEnum.PG_ENUM);
	}
}
