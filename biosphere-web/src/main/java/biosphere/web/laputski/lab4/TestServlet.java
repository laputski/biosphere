package biosphere.web.laputski.lab4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/test/laputski")
public class TestServlet extends HttpServlet {

    TestService service;

    @Override
    public void init() throws ServletException {
        service = new TestServiceImpl();
        try {
            service.createTestTable();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            List<Test> tests = service.getTests();
            PrintWriter writer = resp.getWriter();
            tests.forEach(test -> writer.println(test.getId() + " -> " + test.getName()));
            writer.flush();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
