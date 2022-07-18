package com.java.streams.practise;

import java.util.Arrays;
import java.util.List;

public class StartingWithOne {

    public static void main(String args[]){
        List<Integer> numbers = Arrays.asList(12,65,14,9,17,108,10,31);
        numbers.stream()
                .map(s->s+"")//convert from Integer to String
                .filter(s->s.startsWith("1"))
                .forEach(System.out::println);
    }
}
