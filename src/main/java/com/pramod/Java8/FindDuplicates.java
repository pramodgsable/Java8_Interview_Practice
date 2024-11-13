package com.pramod.Java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        Set<String> uniqueList = new HashSet<>();
        List<String> duplicates = listOfStrings.stream().filter(s -> !uniqueList.add(s)).collect(Collectors.toList());
        System.out.println(duplicates.toString());
    }
}
