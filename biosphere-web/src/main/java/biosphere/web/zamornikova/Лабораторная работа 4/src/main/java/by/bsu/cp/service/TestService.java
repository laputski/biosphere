package by.bsu.cp.service;


import by.bsu.cp.domain.Test;
import by.bsu.cp.exception.ServiceLayerException;

import java.util.List;

public interface TestService {

    void createTestTable() throws ServiceLayerException;

    List<Test> getTests() throws ServiceLayerException;

    Test getTestByIdWithStatement() throws ServiceLayerException;

    Test getTestByIdWithPStatement(int testId) throws ServiceLayerException;

    void addTestWithStatement() throws ServiceLayerException;

    void addTestWithPreparedStatement(Test test) throws ServiceLayerException;

    void updateTestWithStatement() throws ServiceLayerException;

    void updateTestWithPreparedStatement(Test test) throws ServiceLayerException;

    void deleteTestWithStatement() throws ServiceLayerException;

    void deleteTestWithPreparedStatement(Test test) throws ServiceLayerException;

    void deleteAllTests() throws ServiceLayerException;
}
