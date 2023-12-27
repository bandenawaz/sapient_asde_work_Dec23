package org.example.jep406.patternmatching;

public class PatternMatchingExample {

    static  String formatterJava17(Object obj) {

        return  switch (obj){

            case Integer i -> String.format("int %d", i);
            case Long l -> String.format("long %d", l);
            case Double d -> String.format("double %f", d);
            default -> obj.toString();

        };
    }

    public static void main(String[] args) {
//        System.out.println(formatterJava17("Java 17"));
//        System.out.println(formatterJava17(17));

        //Without using Java17 lambda expression
        String fruit = "orange";
        switch (fruit){

//            case "apple":
//                System.out.println("This is an apple");
//                break;
//
//            case "banana":
//                System.out.println("This is an banana");
//                break;
//
//            case "orange":
//                System.out.println("This is an orange");
//                break;
//
//            default :
//                System.out.println("There is no fruit of this name in the " +
//                        "list");
//                break;

            //With Java17 lambda expression
            case "one" -> System.out.println("This is an apple");
            case "orange" -> System.out.println("This is an orange");
            case "banana" -> System.out.println("This is an banana");

            default -> System.out.println("There is no fruit of this name in the list");
        }

    }
}
