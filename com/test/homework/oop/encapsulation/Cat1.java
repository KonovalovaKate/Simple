package com.test.homework.oop.encapsulation;

public class Cat1 {

    //Close access to all internal variables of the class

    private String name; // private = restricted access
    private int age; // private = restricted access
    private int weight; // private = restricted access
    private String color; // private = restricted access

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setName(String newName) {
        this.name = newName; // name or newName?
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }
}