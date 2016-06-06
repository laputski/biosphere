package by.bsu.cp.service.impl;


import by.bsu.cp.dao.TestDao;
import by.bsu.cp.dao.impl.TestDaoImpl;
import by.bsu.cp.domain.Test;
import by.bsu.cp.exception.DaoLayerException;
import by.bsu.cp.exception.ServiceLayerException;
import by.bsu.cp.service.TestService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;


public class TestServiceImpl implements TestService {
    private final static Logger LOGGER = LogManager.getLogger(TestServiceImpl.class);
    private TestDao dao = new TestDaoImpl();

    @Override
    public void createTestTable() throws ServiceLayerException {
        try {
            dao.createTestTable();
            LOGGER.info("Table Test was created");
        } catch (DaoLayerException e) {
            LOGGER.debug(e);
            throw new ServiceLayerException("Can't create table", e);
        }
    }

    @Override
    public List<Test> getTests() throws ServiceLayerException {
        try {
            LOGGER.info("Get all tests");
            return dao.getTests();
        } catch (DaoLayerException e) {
            LOGGER.debug(e);
            throw new ServiceLayerException("Can't det all tests", e);
        }
    }

    @Override
    public Test getTestByIdWithStatement() throws ServiceLayerException {
        try {
            LOGGER.info("Get test by id with statement");
            return dao.getTestByIdWithStatement();
        } catch (DaoLayerException e) {
            LOGGER.debug(e);
            throw new ServiceLayerException("Can't get test by id in statement", e);
        }
    }

    @Override
    public Test getTestByIdWithPStatement(int testId) throws ServiceLayerException {
        try {
            LOGGER.info("Get test by id with prepared statement");
            return dao.getTestByIdWithPStatement(testId);
        } catch (DaoLayerException e) {
            LOGGER.debug(e);
            throw new ServiceLayerException("Can't get test by id = " + testId + " in prepared statement", e);
        }
    }

    @Override
    public void addTestWithStatement() throws ServiceLayerException {
        try {
            dao.addTestWithStatement();
            LOGGER.info("Test was added with statement");
        } catch (DaoLayerException e) {
            LOGGER.debug(e);
            throw new ServiceLayerException("Can't add test in statement", e);
        }
    }

    @Override
    public void addTestWithPreparedStatement(Test test) throws ServiceLayerException {
        try {
            dao.addTestWithPreparedStatement(test);
            LOGGER.info("Test was added with prepared statement, name : " + test.getName());
        } catch (DaoLayerException e) {
            LOGGER.debug(e);
            throw new ServiceLayerException("Can't add test in prepared statement", e);
        }
    }

    @Override
    public void updateTestWithStatement() throws ServiceLayerException {
        try {
            dao.updateTestWithStatement();
            LOGGER.info("Test was updated with statement");
        } catch (DaoLayerException e) {
            LOGGER.debug(e);
            throw new ServiceLayerException("Can't update test in statement", e);
        }

    }

    @Override
    public void updateTestWithPreparedStatement(Test test) throws ServiceLayerException {
        try {
            dao.updateTestWithPreparedStatement(test);
            LOGGER.info("Test was updated with statement, id : " + test.getId());
        } catch (DaoLayerException e) {
            LOGGER.debug(e);
            throw new ServiceLayerException("Can't update test in prepared statement", e);
        }
    }

    @Override
    public void deleteTestWithStatement() throws ServiceLayerException {
        try {
            dao.deleteTestWithStatement();
            LOGGER.info("Test was deleted with statement");
        } catch (DaoLayerException e) {
            LOGGER.debug(e);
            throw new ServiceLayerException("Can't delete test in statement", e);
        }

    }

    @Override
    public void deleteTestWithPreparedStatement(Test test) throws ServiceLayerException {
        try {
            dao.deleteTestWithPreparedStatement(test);
            LOGGER.info("Test was deleted with prepared statement, id : " + test.getId());
        } catch (DaoLayerException e) {
            LOGGER.debug(e);
            throw new ServiceLayerException("Can't delete test in prepared statement", e);
        }
    }

    @Override
    public void deleteAllTests() throws ServiceLayerException {
        try {
            dao.deleteAllTests();
            LOGGER.info("All records from table Test was deleted");
        } catch (DaoLayerException e) {
            LOGGER.debug(e);
            throw new ServiceLayerException("Can't delete all tests", e);
        }
    }

}
