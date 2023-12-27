package org.example.sealedclass;

sealed class Human permits Saloni,Purvi,Manish,Avantika{

    public void printName(){
        System.out.println("Default");
    }
}

non-sealed class Saloni extends Human{
    public void printName(){
        System.out.println("Saloni");
    }
}

non-sealed class Purvi extends Human{
    public void printName(){
        System.out.println("Purvi");
    }
}

non-sealed class Manish extends Human{
    public void printName(){
        System.out.println("Manish");
    }
}

final class Avantika extends Human{
    public void printName(){
        System.out.println("Avantika");
    }
}
