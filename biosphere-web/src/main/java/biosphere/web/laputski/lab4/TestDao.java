package biosphere.web.laputski.lab4;

import java.sql.SQLException;
import java.util.List;

public interface TestDao {

    void createTestTable() throws SQLException;

    List<Test> getTests() throws SQLException;

}
