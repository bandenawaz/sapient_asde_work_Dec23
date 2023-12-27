package org.example.recordex;

record PersonRecord(int id, String name){}
public class Main{

    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person(2, "John");

        p1.setId(1);
        p1.setName("Abraham");

        System.out.println(p1.getName());

        PersonRecord p3 = new PersonRecord(3, "Peter Parker");
        //p3.id() = 5;

        System.out.println(p3.toString());
        //lets just print the name of p3
        System.out.println(p3.name());
    }
}
