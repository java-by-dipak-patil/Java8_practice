package com.strams.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {
        int[] arr= {10,29,2,45,33,22,1};
        Arrays.stream(arr).filter(a->a%2==0).forEach(System.out::println);

        ArrayList<Integer> al=new ArrayList<>();
        al.add(101);
        al.add(102);
        al.add(8);
        al.add(10);
        al.add(89);

        System.out.println("toArray method:::");
        Integer[] array = al.stream().toArray(Integer[]::new);
       for (int x:array)
       {
           System.out.println(x);
       }

        System.out.println("Every element is double of its won");
        List<Integer> collect = al.stream().map(e -> e * 2).collect(Collectors.toList());
        collect.stream().forEach(System.out::println);

        System.out.println("Natural sorting order::::");
        List<Integer> collect1 = al.stream().sorted().collect(Collectors.toList());
        System.out.println(collect1);

        System.out.println("Customized sorting order::::");
        List<Integer> collect2 = al.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
        System.out.println(collect2);

        System.out.println("Customized sorting order find min::::");
        int min= al.stream().min((i1,i2)->i1.compareTo(i2)).get();
        System.out.println(min);

        System.out.println("Customized sorting order find max::::");
        int max= al.stream().max((i1,i2)->i1.compareTo(i2)).get();
        System.out.println(max);

        System.out.println("using for each loop:::");
ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("AA");
        arrayList.add("BB");
        arrayList.add("CCC");
        arrayList.add("DDDD");
        arrayList.stream().forEach(System.out::println);

        //arrayList.stream().map(s -> s.concat(s)).forEach(System.out::println);
        System.out.println("Stream.of() methid example");
        Stream<Integer> integerStream=Stream.of(9,99,999,9999,99999);
        integerStream.forEach(System.out::println);

        System.out.println("Stream.of for array");
        Double[] d={10.1,10.2,10.3,10.5};
        Stream<Double> doubleStream=Stream.of(d);
        doubleStream.forEach(System.out::println);


    }
}
