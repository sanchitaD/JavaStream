package com.java.streams.practise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicates {

    public static void main(String args[]){
        List<Integer> numbers = Arrays.asList(1,4,27,99,27,72);
        Set<Integer> setNum = new HashSet();
        numbers.stream()
                .filter(n->!setNum.add(n))
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        List<String> alphas = Arrays.asList("A", "B", "A", "C");
        Set<String> dupeOnly = new HashSet();
        alphas.stream()
                .filter(s-> !dupeOnly.add(s))
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        List<String> vow = Arrays.asList("a","e","i","e");
        Set<String> dupe = new HashSet();
        vow.stream()
                .filter(s-> !dupe.add(s))
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        Set<String> dupes = new HashSet();
        vow.stream()
                .filter(s->!dupes.add(s))
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }
}
