/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class TBookToBookStoreRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.TBookToBookStoreRecord> {

	private static final long serialVersionUID = 1628914116;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [PUBLIC.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME]
	 * REFERENCES T_BOOK_STORE [PUBLIC.T_BOOK_STORE.NAME]
	 * </pre></code>
	 */
	public void setBookStoreName(java.lang.String value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TBookToBookStore.BOOK_STORE_NAME, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [PUBLIC.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME]
	 * REFERENCES T_BOOK_STORE [PUBLIC.T_BOOK_STORE.NAME]
	 * </pre></code>
	 */
	public java.lang.String getBookStoreName() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TBookToBookStore.BOOK_STORE_NAME);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [PUBLIC.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME]
	 * REFERENCES T_BOOK_STORE [PUBLIC.T_BOOK_STORE.NAME]
	 * </pre></code>
	 */
	public org.jooq.test.hsqldb.generatedclasses.tables.records.TBookStoreRecord fetchTBookStore() {
		return create()
			.selectFrom(org.jooq.test.hsqldb.generatedclasses.tables.TBookStore.T_BOOK_STORE)
			.where(org.jooq.test.hsqldb.generatedclasses.tables.TBookStore.NAME.equal(getValue(org.jooq.test.hsqldb.generatedclasses.tables.TBookToBookStore.BOOK_STORE_NAME)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [PUBLIC.T_BOOK_TO_BOOK_STORE.BOOK_ID]
	 * REFERENCES T_BOOK [PUBLIC.T_BOOK.ID]
	 * </pre></code>
	 */
	public void setBookId(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TBookToBookStore.BOOK_ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [PUBLIC.T_BOOK_TO_BOOK_STORE.BOOK_ID]
	 * REFERENCES T_BOOK [PUBLIC.T_BOOK.ID]
	 * </pre></code>
	 */
	public java.lang.Integer getBookId() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TBookToBookStore.BOOK_ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [PUBLIC.T_BOOK_TO_BOOK_STORE.BOOK_ID]
	 * REFERENCES T_BOOK [PUBLIC.T_BOOK.ID]
	 * </pre></code>
	 */
	public org.jooq.test.hsqldb.generatedclasses.tables.records.TBookRecord fetchTBook() {
		return create()
			.selectFrom(org.jooq.test.hsqldb.generatedclasses.tables.TBook.T_BOOK)
			.where(org.jooq.test.hsqldb.generatedclasses.tables.TBook.ID.equal(getValue(org.jooq.test.hsqldb.generatedclasses.tables.TBookToBookStore.BOOK_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 */
	public void setStock(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TBookToBookStore.STOCK, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getStock() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TBookToBookStore.STOCK);
	}

	/**
	 * Create a detached TBookToBookStoreRecord
	 */
	public TBookToBookStoreRecord() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE);
	}
}
