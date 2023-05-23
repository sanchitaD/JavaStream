package com.java.streams.practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartsWithOne {
    public static void main(String[] args) {
        int numbers[] = {5,9,11,2,8,21,1};
        List<String> numToStr = Arrays.stream(numbers).boxed()
                .map(s->s+"")
                .filter(s->s.startsWith("1"))
                .collect(Collectors.toList());
        System.out.println("The numbers that starts with 1 : " + numToStr);
    }
}
