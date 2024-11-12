package com.interview;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OccuranceOfEachCharacter {
    public static void main(String[] args) {

        String s="ilovejavatechie";
        Stream<String> s1 = Stream.of(s.split(""));

       /* Map<String, Long> collect = s1.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(collect);*/

        System.out.println("find all duplicate element");
        List<String> collected = s1.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(m -> m.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(collected);

        System.out.println("find all unique element");
        Stream<String> s2 = Stream.of(s.split(""));
        List<String> unique = s2.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(m -> m.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(unique);

        System.out.println("first non repeat element::");

    }
}
