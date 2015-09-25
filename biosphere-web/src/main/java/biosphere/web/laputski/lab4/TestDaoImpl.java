package biosphere.web.laputski.lab4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TestDaoImpl implements TestDao {

    private static final String CREATE_TEST = "CREATE TABLE TEST(id int primary key, name varchar(255))";
    private static final String GET_ALL_TESTS = "SELECT * FROM TEST";

    @Override
    public void createTestTable() throws SQLException {
        Connection connection = TestJdbcConnector.getConnection();
        try {
            connection.setAutoCommit(false);
            PreparedStatement createPreparedStatement = connection.prepareStatement(CREATE_TEST);
            createPreparedStatement.executeUpdate();
            createPreparedStatement.close();
            connection.commit();
        } finally {
            connection.close();
        }
    }

    @Override
    public List<Test> getTests() throws SQLException {
        Connection connection = TestJdbcConnector.getConnection();
        try {
            connection.setAutoCommit(false);
            PreparedStatement selectPreparedStatement = connection.prepareStatement(GET_ALL_TESTS);
            ResultSet resultSet = selectPreparedStatement.executeQuery();
            List<Test> tests = new ArrayList<>();
            while (resultSet.next()) {
                tests.add(new Test(resultSet.getInt("id"), resultSet.getString("name")));
            }
            selectPreparedStatement.close();
            connection.commit();
            return tests;
        } finally {
            connection.close();
        }
    }

}
