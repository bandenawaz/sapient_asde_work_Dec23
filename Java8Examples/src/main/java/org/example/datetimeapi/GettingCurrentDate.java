package org.example.datetimeapi;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GettingCurrentDate {

    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date dateObj = new Date();
        System.out.println(df.format(dateObj));


    }
}
