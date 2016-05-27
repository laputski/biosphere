package com.company;

import java.io.*;
import java.util.*;



public class PerformanceComparator {

    List <String> resultList;
    long startTime;
    long resultTime;
    public PerformanceComparator(){
        resultList=new ArrayList<>();
        startTime=0;
        resultTime=0;
    }

    private void getStartTime(){
        startTime=System.currentTimeMillis();
    }
    private void setResultTime(){
        resultTime=System.currentTimeMillis()-startTime;
    }
public void arrayListTester(int testVolume){
    StringBuilder resultString;
    List<String> testArrayList = new ArrayList<>(testVolume);
    //заполнение
    getStartTime();
    for (int i=0;i<testVolume;i++)
        testArrayList.add(DataGenerator.getRandomString());
    setResultTime();
    resultString=new StringBuilder("Заполнение ArrayList на " + testVolume + " элементов - " + resultTime);
    //вставка
    getStartTime();
    testArrayList.add((int)Math.random()*1000,DataGenerator.getRandomString());
    setResultTime();
    resultString.append(", вставка в случайное место " + resultTime);
    //удаление
    getStartTime();
    testArrayList.remove((int)Math.random()*1000);
    setResultTime();
    resultString.append(", удаление из случайного места " + resultTime);
    //поиск элемента
    getStartTime();
    testArrayList.get((int)Math.random()*100);
    setResultTime();
    resultString.append(", поиск случайного элемента " + resultTime);
    System.out.println(resultString);
}

    public void linkedListTester(int testVolume){
        StringBuilder resultString;
        List<String> testLinkedList = new LinkedList<>();
        //заполнение
        getStartTime();
        for (int i=0;i<testVolume;i++)
            testLinkedList.add(DataGenerator.getRandomString());
        setResultTime();
        resultString=new StringBuilder("Заполнение LinkedList на " + testVolume + " элементов - " + resultTime);
        //вставка
        getStartTime();
        testLinkedList.add((int)Math.random()*1000,DataGenerator.getRandomString());
        setResultTime();
        resultString.append(", вставка в случайное место " + resultTime);
        //удаление
        getStartTime();
        testLinkedList.remove((int)Math.random()*1000);
        setResultTime();
        resultString.append(", удаление из случайного места " + resultTime);
        //поиск элемента
        getStartTime();
        testLinkedList.get((int)Math.random()*100);
        setResultTime();
        resultString.append(", поиск случайного элемента " + resultTime);
        System.out.println(resultString);
    }

    public void hashMapTester(int testVolume){
        StringBuilder resultString;
        Map<Integer,String> testHashMap = new HashMap<>(testVolume);
        //заполнение
        getStartTime();
        for (int i=0;i<testVolume;i++)
            testHashMap.put(i,DataGenerator.getRandomString());
        setResultTime();
        resultString=new StringBuilder("Заполнение HashMap на " + testVolume + " элементов - " + resultTime);
        //вставка
        getStartTime();
        testHashMap.put((int)Math.random()*1000,DataGenerator.getRandomString());
        setResultTime();
        resultString.append(", вставка в случайное место " + resultTime);
        //удаление
        getStartTime();
        testHashMap.remove((int)Math.random()*1000);
        setResultTime();
        resultString.append(", удаление из случайного места " + resultTime);
        //поиск элемента
        getStartTime();
        testHashMap.get((int)Math.random()*100);
        setResultTime();
        resultString.append(", поиск случайного элемента " + resultTime);
        System.out.println(resultString);
    }

    public void linkedHashMapTester(int testVolume){
        StringBuilder resultString;
        Map<Integer,String> linkedHashMap = new LinkedHashMap<>(testVolume);
        //заполнение
        getStartTime();
        for (int i=0;i<testVolume;i++)
            linkedHashMap.put(i,DataGenerator.getRandomString());
        setResultTime();
        resultString=new StringBuilder("Заполнение LinkedHashMap на " + testVolume + " элементов - " + resultTime);
        //вставка
        getStartTime();
        linkedHashMap.put((int)Math.random()*1000,DataGenerator.getRandomString());
        setResultTime();
        resultString.append(", вставка в случайное место " + resultTime);
        //удаление
        getStartTime();
        linkedHashMap.remove((int)Math.random()*1000);
        setResultTime();
        resultString.append(", удаление из случайного места " + resultTime);
        //поиск элемента
        getStartTime();
        linkedHashMap.get((int)Math.random()*100);
        setResultTime();
        resultString.append(", поиск случайного элемента " + resultTime);
        System.out.println(resultString);
    }

    public void treeMapTester(int testVolume){
        StringBuilder resultString;
        Map<Integer,String> testTreeMap = new TreeMap<>();
        //заполнение
        getStartTime();
        for (int i=0;i<testVolume;i++)
            testTreeMap.put(i,DataGenerator.getRandomString());
        setResultTime();
        resultString=new StringBuilder("Заполнение TreeMap на " + testVolume + " элементов - " + resultTime);
        //вставка
        getStartTime();
        testTreeMap.put((int)Math.random()*1000,DataGenerator.getRandomString());
        setResultTime();
        resultString.append(", вставка в случайное место " + resultTime);
        //удаление
        getStartTime();
        testTreeMap.remove((int)Math.random()*1000);
        setResultTime();
        resultString.append(", удаление из случайного места " + resultTime);
        //поиск элемента
        getStartTime();
        testTreeMap.get((int)Math.random()*100);
        setResultTime();
        resultString.append(", поиск случайного элемента " + resultTime);
        System.out.println(resultString);
    }

    public void hashSetTester(int testVolume){
        StringBuilder resultString;
        Set<String> testTreeMap = new HashSet<>(testVolume);
        //заполнение
        getStartTime();
        for (int i=0;i<testVolume;i++)
            testTreeMap.add(DataGenerator.getRandomString());
        setResultTime();
        resultString=new StringBuilder("Заполнение HashSet на " + testVolume + " элементов - " + resultTime);
        //вставка
        getStartTime();
        testTreeMap.add(DataGenerator.getRandomString());
        setResultTime();
        resultString.append(", вставка " + resultTime);
        //удаление
        getStartTime();
        testTreeMap.remove((int)Math.random()*1000);
        setResultTime();
        resultString.append(", удаление из случайного места " + resultTime);
        //поиск элемента
        getStartTime();
        testTreeMap.contains(DataGenerator.getRandomString());
        setResultTime();
        resultString.append(", поиск случайного элемента " + resultTime);
        System.out.println(resultString);
    }

    public void linkedHashSetTester(int testVolume){
        StringBuilder resultString;
        Set<String> testLinkedHashSet = new LinkedHashSet<>(testVolume);
        //заполнение
        getStartTime();
        for (int i=0;i<testVolume;i++)
            testLinkedHashSet.add(DataGenerator.getRandomString());
        setResultTime();
        resultString=new StringBuilder("Заполнение LinkedHashSet на " + testVolume + " элементов - " + resultTime);
        //вставка
        getStartTime();
        testLinkedHashSet.add(DataGenerator.getRandomString());
        setResultTime();
        resultString.append(", вставка " + resultTime);
        //удаление
        getStartTime();
        testLinkedHashSet.remove((int)Math.random()*1000);
        setResultTime();
        resultString.append(", удаление из случайного места " + resultTime);
        //поиск элемента
        getStartTime();
        testLinkedHashSet.contains(DataGenerator.getRandomString());
        setResultTime();
        resultString.append(", поиск случайного элемента " + resultTime);
        System.out.println(resultString);
    }

    public void treeSetTester(int testVolume){
        StringBuilder resultString;
        Set<String> testTreeSet = new TreeSet<>();
        //заполнение
        getStartTime();
        for (int i=0;i<testVolume;i++)
            testTreeSet.add(DataGenerator.getRandomString());
        setResultTime();
        resultString=new StringBuilder("Заполнение TreeSet на " + testVolume + " элементов - " + resultTime);
        //вставка
        getStartTime();
        testTreeSet.add(DataGenerator.getRandomString());
        setResultTime();
        resultString.append(", вставка " + resultTime);
        //удаление
        getStartTime();
        testTreeSet.remove(DataGenerator.getRandomString());
        setResultTime();
        resultString.append(", удаление из случайного места " + resultTime);
        //поиск элемента
        getStartTime();
        testTreeSet.contains(DataGenerator.getRandomString());
        setResultTime();
        resultString.append(", поиск случайного элемента " + resultTime);
        System.out.println(resultString);
    }
    public static void main(String[] args) throws IOException {

    PerformanceComparator pr=new PerformanceComparator();
        pr.arrayListTester((int) Math.pow(10,3));
        pr.arrayListTester((int) Math.pow(10,6));
        pr.arrayListTester(5*(int) Math.pow(10,6));

        pr.linkedListTester((int) Math.pow(10,3));
        pr.linkedListTester((int) Math.pow(10,6));
        pr.linkedListTester(5*(int) Math.pow(10,6));

        pr.hashMapTester((int) Math.pow(10,3));
        pr.hashMapTester((int) Math.pow(10,6));
        pr.hashMapTester(5*(int) Math.pow(10,6));

        pr.linkedHashMapTester((int) Math.pow(10,3));
        pr.linkedHashMapTester((int) Math.pow(10,6));
        pr.linkedHashMapTester(5*(int) Math.pow(10,6));

        pr.treeMapTester((int) Math.pow(10,3));
        pr.treeMapTester((int) Math.pow(10,6));
        pr.treeMapTester(5*(int) Math.pow(10,6));

        pr.hashSetTester((int) Math.pow(10,3));
        pr.hashSetTester((int) Math.pow(10,6));
        pr.hashSetTester(5*(int) Math.pow(10,6));

        pr.linkedHashSetTester((int) Math.pow(10,3));
        pr.linkedHashSetTester((int) Math.pow(10,6));
        pr.linkedHashSetTester(5*(int) Math.pow(10,6));

        pr.treeSetTester((int) Math.pow(10,3));
        pr.treeSetTester((int) Math.pow(10,6));
        pr.treeSetTester(5*(int) Math.pow(10,6));

    }
}
