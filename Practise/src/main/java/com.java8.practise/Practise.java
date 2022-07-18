package com.java8.practise;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Practise {
    public static void main(String args[]) {


//    List<Employee> list = Stream.of(
//                    new Employee("emp1", "Fin", "1589764845", "san@d.com"),
//                    new Employee("emp2", "IT", "1587454845", "pra@d.com"))
//            .collect(Collectors.toList());
//
//    List<String> contactDetail = list.stream().map(Employee::getContactNo).collect(Collectors.toList());
//    System.out.println(contactDetail);
//
//    String name = "SanchitaPrateekVehaan";
//       Map<String, Long> countList = Arrays.stream(name.split("")).collect(groupingBy(Function.identity(),counting()));
//        System.out.println(countList);
//
     //print only the even numbers.
     List<Integer> number = Arrays.asList(1,4,2,8,7,6);
     number.stream().filter(n->n%2 == 0).forEach(System.out::print);


}
}
