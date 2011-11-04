/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class PublicFactory extends org.jooq.util.h2.H2Factory {

	private static final long serialVersionUID = 743511659;

	/**
	 * Create a factory with a connection
	 *
	 * @param connection The connection to use with objects created from this factory
	 */
	public PublicFactory(java.sql.Connection connection) {
		super(connection);
	}

	/**
	 * Create a factory with a connection and a schema mapping
	 *
	 * @param connection The connection to use with objects created from this factory
	 * @param mapping The schema mapping to use with objects created from this factory
	 */
	public PublicFactory(java.sql.Connection connection, org.jooq.SchemaMapping mapping) {
		super(connection, mapping);
	}
}
