/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mariadb.generatedclasses.enums;

/**
 * This class is generated by jOOQ.
 *
 * The book's stock status
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum TBookStatus implements org.jooq.EnumType {

	SOLD_OUT("SOLD OUT"),

	ORDERED("ORDERED"),

	ON_STOCK("ON STOCK"),

	;

	private final java.lang.String literal;

	private TBookStatus(java.lang.String literal) {
		this.literal = literal;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Schema getSchema() {
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String getName() {
		return "t_book_STATUS";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String getLiteral() {
		return literal;
	}
}
