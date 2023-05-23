package com.java.streams.practise;

import java.util.Arrays;

public class LongestString {
    public static void main(String[] args) {

        String[] strArray = {"sanchita","techie","springboot","microservice"};
        String longestString = Arrays.stream(strArray)
                .reduce((word1,word2) -> word1.length()>word2.length()?word1:word2)
                .get();
        System.out.println("The longest string in the array is : " + longestString);
    }
}
