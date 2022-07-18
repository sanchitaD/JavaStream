package com.java.streams.practise;

import java.util.Arrays;
import java.util.List;

public class PrintEven {

    public static void main(String args[]){
        List<Integer> number = Arrays.asList(1,4,2,8,7,6);
        number.stream().filter(n->n%2 == 0).forEach(System.out::println);
    }
}
