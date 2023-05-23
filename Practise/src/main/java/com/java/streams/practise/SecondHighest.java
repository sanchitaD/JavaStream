package com.java.streams.practise;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighest {
    public static void main(String[] args) {
        int[] numbers = {7,9,2,18,21};
        Integer secondHighest = Arrays.stream(numbers).boxed()
                .sorted(Comparator.reverseOrder())      //to get in descending order
                .skip(1)
                .findFirst()
                .get();
        System.out.println("Second highest number is : " + secondHighest);
    }
}
