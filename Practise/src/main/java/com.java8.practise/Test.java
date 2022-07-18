package com.java8.practise;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Collectors.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Test {

    public static void main(String args[]){

//        Function<Integer, String> function = (t) -> "output:" +t;
//        System.out.println(function.apply(88));

//        TestInterface tes = (i) -> System.out.println("test method executor");
//        tes.test(10);

//        MyFunction func = (i) -> i*10;
//        System.out.println(func.test(10));

//        MyFunction function = (s1,s2) -> s1+"Hi"+s2;
//        System.out.println(function.test("abc","def"));

//          List<Integer> list =Arrays.asList(2,5,9,6,4,7,8,100,20);
//        list.stream().filter(t->t>4).sorted().forEach(System.out::println);


//          list.stream().filter(t -> t>4).sorted().forEach(System.out::println);

        List<Employee> list = Stream.of(
                new Employee("emp1","Fin","1589764845","san@d.com"),
                new Employee("emp2","IT","1587454845","pra@d.com"))
        .collect(Collectors.toList());

        List deptName = list.stream().map(Employee::getDeptname).collect((Collectors.toList()));
        System.out.println(deptName);

//        List<Employees> employees = Stream.of(
//                  new Employees("emp1","Samantha","IT",60000),
//                new Employees("emp2","Brown","Finance",85000),
//                new Employees("emp3","Thomas","HR",39000),
//                new Employees("emp4","Cook","IT",75000))
//                .collect(Collectors.toList());
//        Map<String,List<Employees>> empMap = employees.stream().collect(Collectors.groupingBy(Employees::getDept));
        //Approach 1
//         Comparator<Employees> compareBySalary = Comparator.comparing(Employees::getSalary);
//         Map<String, List<Employees>> empMap = employees.stream().collect(groupingBy(Employees::getDept));
//         System.out.println(empMap);

         //approach 2
//         Map<String, Employees> list1 = employees.stream()
//                 .collect(groupingBy(Employees::getDept,
//                         collectingAndThen(maxBy(Comparator.comparingInt(Employees::getSalary)), Optional::get)));
//        System.out.println(list1);
//
//
//        Map<String, List<Employees>> map1 = employees.stream().collect(groupingBy(Employees::getDept));
//        System.out.println(map1);
//
//        Integer[] arr = new Integer[] {1,4,2,5,6,5,4,7};
//        List<Integer> list2 = Arrays.asList(arr);
//        Set<Integer> noDupe = list2.stream().collect(Collectors.toSet());
//        noDupe.forEach(i-> System.out.println(" "+i));
    }
}
