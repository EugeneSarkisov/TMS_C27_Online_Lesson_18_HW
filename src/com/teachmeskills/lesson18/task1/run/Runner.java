package com.teachmeskills.lesson18.task1.run;

import com.teachmeskills.lesson18.task1.service.StreamTest;
import com.teachmeskills.lesson18.task1.fabric.Fabric;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Integer> testList = Fabric.createIntList();
        StreamTest.removeDuplicate(testList);
        StreamTest.printEven(testList);
        StreamTest.listMultiplication(testList);
        StreamTest.sortFourElements(testList);
        StreamTest.countElements(testList);
        StreamTest.getAverage(testList);
    }
}
