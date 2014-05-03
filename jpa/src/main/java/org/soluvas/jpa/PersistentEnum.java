package org.soluvas.jpa;

import java.lang.reflect.InvocationTargetException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.postgresql.util.PGobject;

/**
 * Map <a href="http://www.postgresql.org/">Postgres</a> <a href="http://wiki.postgresql.org/wiki/Enum">Enum</a>
 * onto <a href="http://download.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Enum</a> using <a href="http://www.hibernate.org/">Hibernate</a>.
 * 
 * @author Rudi Wijaya <rudi@bippo.co.id>
 * @see http://anismiles.wordpress.com/2010/08/04/postgres-enum-with-hibernate/
 */
public class PersistentEnum extends org.jadira.usertype.corejava.PersistentEnum {
	
	@Override
	public Object doNullSafeGet(ResultSet rs, String[] names,
			SessionImplementor session, Object owner)
			throws HibernateException, SQLException, IllegalArgumentException,
			IllegalAccessException, InvocationTargetException {
		
		Object identifier = rs.getObject(names[0]);
		
		if (rs.wasNull()) {
			return null;
		}

        // Notice how Object is mapped to PGobject. This makes this implementation Postgres specific
        if (identifier instanceof PGobject) {
            PGobject pg = (PGobject) identifier;
            return Enum.valueOf((Class) getMappedClass(), pg.getValue());
        } else {
        	throw new IllegalArgumentException("PersistentEnum type expects PGobject, got " + identifier.getClass().getName() + " for value '" + identifier + "'");
        }
	}
	
	@Override
	public void doNullSafeSet(PreparedStatement preparedStatement,
			Object value, int index, SessionImplementor session)
			throws SQLException, IllegalArgumentException,
			IllegalAccessException, InvocationTargetException {
    	if (value == null) {
			preparedStatement.setNull(index, Types.VARCHAR);
            // UPDATE: To support NULL insertion, change to: st.setNull(index, 1111);
		} else {
            // Notice 1111 which java.sql.Type for Postgres Enum
			preparedStatement.setObject(index, ((Enum) value).name(), 1111);
		}
	}

}