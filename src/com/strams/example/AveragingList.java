package com.strams.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AveragingList {


    public static void main(String[] args) {


        List<Integer> list=List.of(10,20,20,33,40,50);

        OptionalDouble average = list.stream().mapToInt(Integer::intValue).average();
        System.out.println(average.getAsDouble());

        // Write a Java program to convert a list of strings to uppercase or lowercase using streams.

        List<String> list1=List.of("Dipak patil","Dinesh","ramesh");

        List<String> collected = list1.stream().map(a -> a.toUpperCase()).collect(Collectors.toList());
        System.out.println(collected);

       // . Write a Java program to convert a list of strings to uppercase or lowercase using streams.
        int sum = list.stream()
                .filter(n->n%2==0)
                .mapToInt(Integer::intValue).sum();
        System.out.println("Sum of even::"+sum);


        int sumOfOdd = list.stream()
                .filter(n->n%2!=0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of even::"+sumOfOdd);

        
        // Write a Java program to remove all duplicate elements from a list using streams.

        List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);

       // Write a Java program to count the number of strings in a list that start with a specific letter using streams.
        long count = list1.stream().filter(s -> s.startsWith("D")).count();
        System.out.println(count);

       // Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.

        List<String> sorted = list1.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted);

        List<String> collected1 = list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(collected1);

        // Write a Java program to find the maximum and minimum values in a list of integers using streams.

        int max = list.stream().mapToInt(Integer::intValue).max().getAsInt();
        System.out.println(max);

       // Write a Java program to find the second smallest and largest elements in a list of integers using streams.
        Optional<Integer> skipped = list.stream().sorted().skip(1).findFirst();
        System.out.println("Second small "+skipped.get());

      int SecondHighest=  list.stream()
              .sorted(Comparator.reverseOrder())
              .skip(1)
              .findFirst()
              .get();
        System.out.println("Second Highest:::"+SecondHighest);


        List<String> num=List.of("10","30","40");

        List<Integer> collect1 = num.stream().map(Integer::valueOf).collect(Collectors.toList());
        System.out.println(collect1);
    }
}
