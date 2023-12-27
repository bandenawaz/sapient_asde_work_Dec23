package org.example.streamsdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAppExample {

    public static void main(String[] args) {

        //lets write the code for finding certain strings without strem

        List<String> names = new ArrayList<>();
        names.add("Ayush");
        names.add("Aditya");
        names.add("Akshat");
        names.add("Anupam");
        names.add("Purvi");

        //1:Without Stream API  (Sequential Execution)
//        int count = 0;
//        for (String s : names) {
//
//            if (s.length() >= 6) {
//                count++;
//
//            }
//        }

        //2:With Stream API
//        long count = names.stream().filter(str -> str.length() >= 6).count();
//        System.out.println("Total number of names with more than 6 chars is " + count);

        //Iterating and Displaying selected integers using Stream with limit(6)
//        Stream.iterate(1, count -> count + 1)
//                .filter(num -> num%5==0)
//                .limit(8)
//                .forEach(System.out::println);

        //Lets concatenate two streams one being the stream of names and other being the stream of fruits
        List<String> names2 = Arrays.asList("Shashank", "Suraj","Saloni");
        List<String> fruits = Arrays.asList("Apples", "Banana","Orange");

        Stream<String> resStream = Stream.concat(names2.stream(), fruits.stream());

        resStream.forEach(str -> System.out.print(str+" "));
        //resStream.forEach(System.out::println);
        
        
    }
}
