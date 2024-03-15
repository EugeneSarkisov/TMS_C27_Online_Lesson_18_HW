package com.teachmeskills.lesson18.task2.service;

import java.util.List;

/**
 * This class contain main methods to manipulate with list
 * with StreamAPI
 */

public class StreamStringTest {
    public static void nameOnA(List<String> list){
        System.out.println(list);
        List<String> aNames = list.stream()
                .filter(n -> n.toLowerCase().startsWith("a"))
                .toList();
        System.out.println(aNames);
    }
    public static void returnFirstElement(List<String> list){
        System.out.println(list);
        List<String> firstSortedName = list.stream()
                .sorted()
                        .findFirst()
                                .stream().toList();
        System.out.println(firstSortedName);
    }
}
