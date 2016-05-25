package by.bsu.cp.dao.impl;


import by.bsu.cp.dao.TestDao;
import by.bsu.cp.dao.connection.TestJdbcConnector;
import by.bsu.cp.domain.Test;
import by.bsu.cp.exception.DaoLayerException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TestDaoImpl implements TestDao {
    private static final String SQL_CREATE_TEST = "CREATE TABLE TEST(id int primary key auto_increment, name varchar(255))";
    private static final String SQL_GET_ALL_TESTS = "SELECT * FROM TEST";
    private static final String SQL_GET_TEST_BY_ID_ST = "SELECT id,name FROM TEST WHERE id = 1";
    private static final String SQL_GET_TEST_BY_ID_PST = "SELECT id,name FROM TEST WHERE id = ?";
    private static final String SQL_INSERT_TEST_PST = "INSERT INTO TEST(name) VALUES (?)";
    private static final String SQL_INSERT_TEST_ST = "INSERT INTO TEST(name) VALUES ('first')";
    private static final String SQL_UPDATE_TEST_ST = "UPDATE TEST SET name = 'upd_name' WHERE id = 1";
    private static final String SQL_UPDATE_TEST_PST = "UPDATE TEST SET name = ? WHERE id = ?";
    private static final String SQL_DELETE_TEST_ST = "DELETE FROM TEST WHERE id = 1";
    private static final String SQL_DELETE_TEST_PST = "DELETE FROM TEST WHERE id = ?";
    private static final String SQL_DELETE_ALL_TESTS = "DELETE FROM TEST";
    private static final String ID_PARAM = "id";
    private static final String NAME_PARAM = "name";

    @Override
    public void createTestTable() throws DaoLayerException {
        try (
                Connection connection = TestJdbcConnector.getInstance().getConnection();
                PreparedStatement createPreparedStatement = connection.prepareStatement(SQL_CREATE_TEST);
        ) {
            createPreparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new DaoLayerException(e);
        }

    }

    @Override
    public List<Test> getTests() throws DaoLayerException {

        try (
                Connection connection = TestJdbcConnector.getInstance().getConnection();
                PreparedStatement selectPreparedStatement = connection.prepareStatement(SQL_GET_ALL_TESTS);
                ResultSet resultSet = selectPreparedStatement.executeQuery();
        ) {
            List<Test> tests = new ArrayList<>();
            while (resultSet.next()) {
                tests.add(new Test(resultSet.getInt(ID_PARAM), resultSet.getString(NAME_PARAM)));
            }
            return tests;
        } catch (SQLException e) {
            throw new DaoLayerException(e);
        }
    }

    @Override
    public void addTestWithStatement() throws DaoLayerException {
        try (
                Connection connection = TestJdbcConnector.getInstance().getConnection();
                Statement statement = connection.createStatement();
        ) {
            statement.executeUpdate(SQL_INSERT_TEST_ST);
        } catch (SQLException e) {
            throw new DaoLayerException(e);
        }

    }

    @Override
    public void addTestWithPreparedStatement(Test test) throws DaoLayerException {
        try (
                Connection connection = TestJdbcConnector.getInstance().getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT_TEST_PST)
        ) {
            preparedStatement.setString(1, test.getName());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new DaoLayerException(e);
        }
    }

    @Override
    public Test getTestByIdWithPStatement(int testId) throws DaoLayerException {
        Test test = null;
        try (
                Connection connection = TestJdbcConnector.getInstance().getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(SQL_GET_TEST_BY_ID_PST)
        ) {
            preparedStatement.setInt(1, testId);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    test = new Test(resultSet.getInt(ID_PARAM), resultSet.getString(NAME_PARAM));
                }
            } catch (SQLException e) {
                throw e;
            }
        } catch (SQLException e) {
            throw new DaoLayerException(e);
        }
        return test;
    }

    @Override
    public Test getTestByIdWithStatement() throws DaoLayerException {
        Test test = null;
        try (
                Connection connection = TestJdbcConnector.getInstance().getConnection();
                Statement statement = connection.createStatement()
        ) {
            try (ResultSet resultSet = statement.executeQuery(SQL_GET_TEST_BY_ID_ST)) {
                if (resultSet.next()) {
                    test = new Test(resultSet.getInt(ID_PARAM), resultSet.getString(NAME_PARAM));
                }
            } catch (SQLException e) {
                throw e;
            }
        } catch (SQLException e) {
            throw new DaoLayerException(e);
        }
        return test;
    }

    @Override
    public void updateTestWithStatement() throws DaoLayerException {
        try (
                Connection connection = TestJdbcConnector.getInstance().getConnection();
                Statement statement = connection.createStatement()
        ) {
            statement.executeUpdate(SQL_UPDATE_TEST_ST);
        } catch (SQLException e) {
            throw new DaoLayerException(e);
        }
    }

    @Override
    public void updateTestWithPreparedStatement(Test test) throws DaoLayerException {
        try (
                Connection connection = TestJdbcConnector.getInstance().getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(SQL_UPDATE_TEST_PST)
        ) {
            preparedStatement.setString(1, test.getName());
            preparedStatement.setLong(2, test.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new DaoLayerException(e);
        }

    }

    @Override
    public void deleteTestWithStatement() throws DaoLayerException {
        try (
                Connection connection = TestJdbcConnector.getInstance().getConnection();
                Statement statement = connection.createStatement()
        ) {
            statement.executeUpdate(SQL_DELETE_TEST_ST);
        } catch (SQLException e) {
            throw new DaoLayerException(e);
        }
    }

    @Override
    public void deleteTestWithPreparedStatement(Test test) throws DaoLayerException {
        try (
                Connection connection = TestJdbcConnector.getInstance().getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(SQL_DELETE_TEST_PST)
        ) {
            preparedStatement.setLong(1, test.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new DaoLayerException(e);
        }
    }

    @Override
    public void deleteAllTests() throws DaoLayerException {
        try (
                Connection connection = TestJdbcConnector.getInstance().getConnection();
                Statement statement = connection.createStatement()
        ) {
            statement.executeUpdate(SQL_DELETE_ALL_TESTS);
        } catch (SQLException e) {
            throw new DaoLayerException(e);
        }
    }
}
