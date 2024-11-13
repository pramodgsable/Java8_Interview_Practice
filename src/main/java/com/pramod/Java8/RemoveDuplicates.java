package com.pramod.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        List<String> listOfUniqueStrings = listOfStrings.stream().distinct().collect(Collectors.toList());
        System.out.println(listOfUniqueStrings.toString());
    }
}
