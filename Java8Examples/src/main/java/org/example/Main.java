package org.example;

@FunctionalInterface
interface MyInterface{
    public abstract void myMethod();
//    public abstract void myMethod2();
    //void myMethod2();
}
public class Main {
    public static void main(String[] args) {

        MyInterface myInterface = new MyInterface(){

            @Override
            public  void myMethod() {
                System.out.println("I am from Functional Interface");
            }
        }   ;

        //Lets call the method
        myInterface.myMethod();
    }
}