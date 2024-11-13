package com.pramod.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddSeparation {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        Map<Boolean,List<Integer>> map = listOfIntegers.stream().collect(Collectors.partitioningBy(i -> i %2 ==0));
        for(Map.Entry<Boolean, List<Integer>> e : map.entrySet()){
            if(e.getKey()){
                System.out.println("Even Numbers");
            } else {
                System.out.println("Odd Numbers");
            }
            System.out.println(e.getValue().toString());
        }
    }
}