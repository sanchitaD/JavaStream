package com.java.streams.practise;

/*
Java program to count the occurrence
of each character in the given string using Java 8
 */

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringOccurrence {
    public static void main(String[] args) {
        String input = "ilovejava";
        Map<String, Long> map = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);

    }
}
