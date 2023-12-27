package org.example.jep181.colloectiontoarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionsToArrayExample {

    public static void main(String[] args) {

        List<String> nameList =
                Arrays.asList("Sahil", "Prince", "Vivek");

        //Old way
        String[] names = nameList.toArray(new String[nameList.size()]);
        System.out.println(names.length);

        //Java 11 way
        names = nameList.toArray(String[]::new);
        System.out.println(names.length);
    }
}
