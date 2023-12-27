package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<String> list = Arrays.asList("banana","apple","cherry");
        list.stream()
                .sorted((s1,s2) -> s1.compareTo(s2))
                .forEach(System.out::println) ;

        Optional num= Stream.of(9, 5, 8, 7, 4, 9, 2, 11, 10, 3)
                .filter(n -> n > 10)
                .filter(n -> n % 5 == 0)
                .findFirst();
        System.out.println(num);

    }
}