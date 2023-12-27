package org.example;

import java.util.Optional;

public class OptonalClassDemo {

    public static void main(String[] args) {

//        //lets raise an NPE
//        String[] str = new String[10];
//
//        //Lets get the substring
//        String str2 = str[9].substring(2,5);
//
//        //Lets display the substring
//        System.out.println(str2);

        //lets handle the above scenario using optional class
        String[] str = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "jahdjaajahah"};
        Optional<String> isNull = Optional.ofNullable(str[9]);

        //lets check for the NPE
        if(isNull.isPresent()) {
            //Getting the substring
            String str2 = str[9].substring(2,5);

            //Lets display the substring
            System.out.println(str2);
        } else {
            System.out.println("Cannot get the substring from an empty string");
        }
    }
}
