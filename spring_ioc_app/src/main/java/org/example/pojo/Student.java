package org.example.pojo;

import java.util.ArrayList;
import java.util.Arrays;


public class Student {

    private Address address;
    private int age;
    private ArrayList<String> mobileNos;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<String> getMobileNos() {
        return mobileNos;
    }

    public void setMobileNos(ArrayList<String> mobileNos) {
        this.mobileNos = mobileNos;
    }
}
