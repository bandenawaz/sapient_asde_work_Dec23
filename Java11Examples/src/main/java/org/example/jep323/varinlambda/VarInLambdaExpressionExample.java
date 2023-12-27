package org.example.jep323.varinlambda;

@FunctionalInterface
interface Calculator{

    int sum(int a, int b);
}
public class VarInLambdaExpressionExample {

    public static void main(String[] args) {

        //var is a keyword in Java11 which is used to declare
        // a local variable.

        //Without using var
        Calculator calculator = (a,b) -> a + b;
        int res = calculator.sum(10,20);
        System.out.println(res);

        //With using var
        Calculator varCalc = (var x, var y) -> x + y;
        int res2 = varCalc.sum(49,69);
        System.out.println(res2);

        /*
        Rules to keep note
        1. (var a, b) -> a + b //skipping or vomiting of var is
            not allowed
        2. (var x, String y) -> x + y //mixing of type is not
            allowed
        3. must use parenthesis () while using the var with
            parameters

         */
//        Calculator clc = (var e, var f) -> e + f;
//        String ans = clc.sum("Ehthesham","Khusrshid");


    }
}
