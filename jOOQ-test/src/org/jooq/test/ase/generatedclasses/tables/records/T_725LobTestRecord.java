/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ase.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class T_725LobTestRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.ase.generatedclasses.tables.records.T_725LobTestRecord> {

	private static final long serialVersionUID = 1919452991;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.ase.generatedclasses.tables.T_725LobTest.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.ase.generatedclasses.tables.T_725LobTest.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setLob(byte[] value) {
		setValue(org.jooq.test.ase.generatedclasses.tables.T_725LobTest.LOB, value);
	}

	/**
	 * An uncommented item
	 */
	public byte[] getLob() {
		return getValue(org.jooq.test.ase.generatedclasses.tables.T_725LobTest.LOB);
	}

	/**
	 * Create a detached T_725LobTestRecord
	 */
	public T_725LobTestRecord() {
		super(org.jooq.test.ase.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST);
	}
}
