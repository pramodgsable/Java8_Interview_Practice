package com.pramod.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamJoining {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        String joinedStream = listOfStrings.stream().collect(Collectors.joining(",","[","]"));
        System.out.println(joinedStream);
    }
}
