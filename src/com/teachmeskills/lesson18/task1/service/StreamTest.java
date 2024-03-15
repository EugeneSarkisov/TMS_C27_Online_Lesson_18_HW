package com.teachmeskills.lesson18.task1.service;

import java.util.List;

/**
 * This class contain main methods to manipulate with list
 * with StreamAPI
 */
public class StreamTest {
    public static void removeDuplicate(List<Integer> list){
        System.out.println(list);
        List<Integer> listWithoutDuplicate = list.stream()
                .distinct()
                .toList();
        System.out.println(listWithoutDuplicate);
    }
    public static void printEven(List<Integer> list){
        System.out.println(list);
        List<Integer> listWithEven = list.stream()
                .filter(n -> n > 6 && n < 17)
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println(listWithEven);
    }
    public static void listMultiplication(List<Integer> list){
        System.out.println(list);
        List<Integer> multiList = list.stream()
                .map(n -> n * 2)
                .toList();
        System.out.println(multiList);
    }
    public static void sortFourElements(List<Integer> list){
        System.out.println(list);
        List<Integer> firstFourList = list.stream()
                .sorted()
                .limit(4)
                .toList();
        System.out.println(firstFourList);
    }
    public static void countElements(List<Integer> list){
        System.out.println(list);
        long elInStream = list.stream()
                .count();
        System.out.println(elInStream);
    }
    public static void getAverage(List<Integer> list){
        System.out.println(list);
        int sum = 0;
        long sumStream = list.stream()
                        .mapToInt(n -> n)
                                .sum();
        long elInStream = list.stream()
                .count();
        long average = sumStream / elInStream;
        System.out.println(average);
    }
}
