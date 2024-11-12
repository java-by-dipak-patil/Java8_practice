package com.strams.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class StudentService {

    static List<Student> list = Arrays.asList(
            new Student(1, "Rohit", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),
            new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67),
            new Student(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),
            new Student(4, "Satish Ray", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
            new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12),
            new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
            new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
            new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
            new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
            new Student(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98));



    public static void main(String[] args) {


        ///1- Find list of students whose first name starts with alphabet A
        List<Student> collect = list.stream().filter(s -> s.getFirstName().startsWith("A")).collect(Collectors.toList());
        System.out.println(collect.toString());


        //group the student by department names

        Map<String, List<Student>> collect1 = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName));
        System.out.println(collect1);

        //Find the total count of student using stream

        long count = list.stream().count();
        System.out.println(count);

        //max age of student

        OptionalInt max = list.stream().mapToInt(s -> s.getAge()).max();
        System.out.println(max.getAsInt());


        //list of departent names

        List<String> collected = list.stream().map(dt -> dt.getDepartmantName()).distinct().collect(Collectors.toList());
        System.out.println(collected);

        // count of student in each department
        Map<String, Long> collect2 = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting()));
        System.out.println(collect2);


        Map<String, Double> collect3 = list.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));
        System.out.println(collect3);


        List<Integer> newList=Arrays.asList(10,20,30,40,50);
        Integer reduce = newList.stream().reduce(0, Integer::sum);
        System.out.println(reduce);

    }


}
