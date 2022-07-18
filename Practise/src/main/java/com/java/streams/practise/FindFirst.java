package com.java.streams.practise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class FindFirst {
    public static void main(String args[]){
        List<Integer> numbers = Arrays.asList(3,2,8,9);
        numbers.stream().findFirst().ifPresent(System.out::println);
    }
}
