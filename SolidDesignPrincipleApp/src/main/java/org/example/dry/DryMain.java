package org.example.dry;


/* DRY -> Don't Repeat Yourself */
public class DryMain {

    public static void main(String[] args) {


        System.out.println("The volume of the rectangualr prisms #1 is " + calculateVolume(3,3,3) );
        System.out.println("The volume of the rectangualr prisms #2 is " + calculateVolume(6,5,4) );
    }

    public static int calculateVolume(int l, int h, int w){

       return  l * w * h;
        //System.out.println("The volume of the rectangualr prisms #2 is " + v);
    }
}
