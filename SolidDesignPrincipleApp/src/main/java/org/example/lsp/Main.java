package org.example.lsp;

public class Main {

    static void getAreaTest(Rectangle r){

        int width = r.getWidth();
        r.setHeight(10);
        System.out.println("Expected area of " + (width*10)
         + ", got " + r.getArea());
    }
    public static void main(String[] args) {

        Rectangle rc = new Rectangle(2,3);
        getAreaTest(rc);

        Rectangle sq = new Squares();
        sq.setWidth(5);
        getAreaTest(sq);

    }
}
