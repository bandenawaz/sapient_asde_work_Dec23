package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


//Lets define a functional interface to handle calclulation
@FunctionalInterface
interface AddIntegers<Integer>{
    abstract int calculate(Integer a, Integer b);
}

@FunctionalInterface
interface ConvertStrToIntInterface<A, B>{
    A convStrToInt(B strValue);
}
public class SortingStringArrayWithoutLambdaFunction {


    public static void main(String[] args) {
        String[] names = {"ab","ef","cd","qr","ij"};


        //lets create a innerclass to handle the
        //sortings
        //Before Java 8
//        class SortingString implements Comparator<String>{
//
//            @Override
//            public int compare(String a, String b ) {
//                return a.compareTo(b);
//            }
//        }
//
//        System.out.println("Sorting String Before Java 8 using local class"
//        + ">Local Class : Without Lambda Function");
//        Arrays.sort(names,new SortingString());
//
//        //Lets iterate and display
//        for(String s: names){
//            System.out.println(s+",");
//
//        }
        //Using Lambda Function
        System.out.println("Sorting String After Java 8 using Lambda Function");
        Arrays.sort(names, (String a, String b) -> a.compareTo(b));

        for (String name : names){
            System.out.println(name);
        }

         AddIntegers<Integer> sum = (a,b) -> a + b;

        Integer res = sum.calculate(8,9);
        System.out.println(res);

        //For subtract
        AddIntegers<Integer> sub = (a,b) -> a - b;

        Integer sub_res = sub.calculate(18,9);
        System.out.println(sub.calculate(18,9));

         //String to Int Conversion
        ConvertStrToIntInterface<Integer, String> intVal = (strVal) ->
                Integer.valueOf(strVal);
        Integer result = intVal.convStrToInt("12");
        System.out.println("Integer value is "+result);

    }
}
