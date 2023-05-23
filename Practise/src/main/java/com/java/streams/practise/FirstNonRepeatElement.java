/*
In this code we are trying to find the first literal in the string that is non repeated.
When used linked HashMap we get the first non repeated element as result.
Since HashMap doesn't keeps the insertion order but Linked HashMap does.
 */
package com.java.streams.practise;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatElement {
    public static void main(String[] args) {
        String input = "ilovejava";
        String key = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(x->x.getValue()==1)
                .findFirst().get().getKey();
        System.out.println("Non repeat first element is : " + key);
    }
}
