package com.teachmeskills.lesson18.task2.run;

import com.teachmeskills.lesson18.task2.fabric.Fabric;
import com.teachmeskills.lesson18.task2.service.StreamStringTest;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<String> strTestList = Fabric.createStrList();
        StreamStringTest.nameOnA(strTestList);
        StreamStringTest.returnFirstElement(strTestList);
    }
}
