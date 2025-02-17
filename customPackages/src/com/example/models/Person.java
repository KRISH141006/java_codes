package com.example.models;

public class Person {
    private String aadhar;//in same class
    protected double assest;// it can be used outside the package but the class shoulbe inherited one ,same package 
                            // it is same like public
    public String name;//all times acccessible
    String mobileNo;

    public String display() {
        return this.aadhar + "\n" + this.assest + "\n" + this.name + "\n" + this.mobileNo;
    }//create a class which will represent singleton pattern
    //only one object is allowed in that class at a time that is known
}
