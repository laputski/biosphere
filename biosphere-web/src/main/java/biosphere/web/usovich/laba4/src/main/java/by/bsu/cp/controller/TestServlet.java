package by.bsu.cp.controller;


import by.bsu.cp.domain.Test;
import by.bsu.cp.exception.ServiceLayerException;
import by.bsu.cp.service.TestService;
import by.bsu.cp.service.impl.TestServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(value = "/test/usovich")
public class TestServlet extends HttpServlet {
    private final static Logger LOGGER = LogManager.getLogger(TestServlet.class);
    private final static String PARAM_ID = "id";
    private final static String PARAM_NAME = "name";
    private final static String PARAM_DELETE_ALL = "all";
    private TestService service;

    @Override
    public void init() throws ServletException {
        service = new TestServiceImpl();
        try {
            service.createTestTable();
        } catch (ServiceLayerException e) {
            LOGGER.error(e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String paramId = req.getParameter(PARAM_ID);
            PrintWriter writer = resp.getWriter();
            if (paramId != null) {
                Test test = service.getTestByIdWithPStatement(Integer.valueOf(paramId));
                writer.println(test.getId() + " -> " + test.getName());
            } else {
                List<Test> tests = service.getTests();
                tests.forEach(test -> writer.println(test.getId() + " -> " + test.getName()));
            }
            writer.flush();
        } catch (ServiceLayerException e) {
            LOGGER.error(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String paramName = req.getParameter(PARAM_NAME);
            if (paramName != null) {
                Test test = new Test();
                test.setName(paramName);
                service.addTestWithPreparedStatement(test);
            } else {
                service.addTestWithStatement();
            }
        } catch (ServiceLayerException e) {
            LOGGER.error(e);
        }
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String paramId = req.getParameter(PARAM_ID);
            String paramDeleteAll = req.getParameter(PARAM_DELETE_ALL);
            String valueDeleteAll = "true";
            if (paramId != null) {
                Test test = new Test();
                test.setId(Integer.valueOf(paramId));
                service.deleteTestWithPreparedStatement(test);
            } else if (paramDeleteAll.equals(valueDeleteAll)) {
                service.deleteAllTests();
            } else {
                service.deleteTestWithStatement();
            }
        } catch (ServiceLayerException e) {
            LOGGER.error(e);
        }
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String paramName = req.getParameter(PARAM_NAME);
            String paramId = req.getParameter(PARAM_ID);
            if (paramName != null && paramId != null) {
                Test test = new Test(Integer.valueOf(paramId), paramName);
                service.updateTestWithPreparedStatement(test);
            } else {
                service.updateTestWithStatement();
            }
        } catch (ServiceLayerException e) {
            LOGGER.error(e);
        }
    }
}
