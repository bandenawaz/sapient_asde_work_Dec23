package org.example.sealedclass;

public class Main {

    public static void main(String[] args) {

        Human saloni = new Saloni();
        Human purvi = new Purvi();
        Human manish = new Manish();
        Human avantika = new Avantika();

        saloni.printName();
        purvi.printName();
        manish.printName();
        avantika.printName();

    }
}
