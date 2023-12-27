package org.example.jep331.stringapi;

import java.util.ArrayList;
import java.util.List;

public class StringApiExample {
    public static void main(String[] args) {

        /*
        Methods introduced in Java 11:
        1. String.repeat(int)
        2. String.isBlank()
        3. String.strip()
        4. String.lines(
         */

        //Lets create a new String
        String sampleString = "   Java  11  \u2003";

        //lets repeat the given string
        System.out.println(sampleString.repeat(5));
        System.out.println(sampleString.strip());
        System.out.println(sampleString.length());
        int x = sampleString.strip().length();
        System.out.println(x);

        //lets check whether the string is blank
        System.out.println("".isBlank());
        System.out.println(sampleString.isBlank());

        //lets remove the whitespace using trim() and strip
        System.out.println(sampleString.strip());
        System.out.println(sampleString.trim());

        //lets remove the leading white space
        System.out.println("    John     ".stripLeading());

        //remove the trailing whitespace

        String sample = "This \nis\na\nmultiline\ntext.";
        List<String> lines = new ArrayList<>();

        sample.lines().forEach(line -> lines.add(line));
        lines.forEach(line -> System.out.println(line));
    }
}
