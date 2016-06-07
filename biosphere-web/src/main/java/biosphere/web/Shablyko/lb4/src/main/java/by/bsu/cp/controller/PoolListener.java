package biosphere.web.filippovich.lb4.src.main.java.by.bsu.cp.controller;


import by.bsu.cp.dao.connection.TestJdbcConnector;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by Dmitry on 5/27/2016.
 */
@WebListener
public class PoolListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        TestJdbcConnector connector = TestJdbcConnector.getInstance();
        connector.init();
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
