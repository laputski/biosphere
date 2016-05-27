package by.bsu.cp.dao.connection;

import org.h2.jdbcx.JdbcConnectionPool;

import java.sql.Connection;
import java.sql.SQLException;

public class TestJdbcConnector {
    private static final String DB_CONNECTION = "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1";
    private static final String DB_USER = "";
    private static final String DB_PASSWORD = "";
    private static final int POOL_MAX = 20;
    private static TestJdbcConnector connector;
    private JdbcConnectionPool connectionPool;

    private TestJdbcConnector() {
        /*init();*/
    }

    public static TestJdbcConnector getInstance() {
        if (connector == null) {
            connector = new TestJdbcConnector();
            return connector;
        } else {
            return connector;
        }
    }

    public Connection getConnection() throws SQLException {
        return connectionPool.getConnection();
    }

    public void init() {
        connectionPool = JdbcConnectionPool.create(DB_CONNECTION, DB_USER, DB_PASSWORD);
        connectionPool.setMaxConnections(POOL_MAX);
    }
}