package com.pramod.Java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "Java Concept Of The Day";
        Map<Character, Long> map = str.toLowerCase().chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.entrySet().forEach(x -> System.out.println(x.getKey() +":"+x.getValue()));
    }
}
