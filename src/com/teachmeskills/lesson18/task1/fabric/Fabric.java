package com.teachmeskills.lesson18.task1.fabric;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * This class generate list of integers and returns it.
 */

public class Fabric {
    public static List<Integer> createIntList(){
        List<Integer> intList = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 15; i++){
            intList.add(random.nextInt(5, 25));
        }
        return intList;
    }
}
