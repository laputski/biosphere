package biosphere.web.laputski.lab4;

import java.sql.SQLException;
import java.util.List;

public class TestServiceImpl implements TestService {

    private TestDao dao = new TestDaoImpl();

    @Override
    public void createTestTable() throws SQLException {
        dao.createTestTable();
    }

    @Override
    public List<Test> getTests() throws SQLException {
        return dao.getTests();
    }

}
