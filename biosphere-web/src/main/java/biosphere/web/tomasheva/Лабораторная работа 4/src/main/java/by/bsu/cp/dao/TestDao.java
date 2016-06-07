package by.bsu.cp.dao;

import by.bsu.cp.domain.Test;
import by.bsu.cp.exception.DaoLayerException;

import java.util.List;

public interface TestDao {

    void createTestTable() throws DaoLayerException;

    List<Test> getTests() throws DaoLayerException;

    Test getTestByIdWithStatement() throws DaoLayerException;

    Test getTestByIdWithPStatement(int testId) throws DaoLayerException;

    void addTestWithStatement() throws DaoLayerException;

    void addTestWithPreparedStatement(Test test) throws DaoLayerException;

    void updateTestWithStatement() throws DaoLayerException;

    void updateTestWithPreparedStatement(Test test) throws DaoLayerException;

    void deleteTestWithStatement() throws DaoLayerException;

    void deleteTestWithPreparedStatement(Test test) throws DaoLayerException;

    void deleteAllTests() throws DaoLayerException;
}
