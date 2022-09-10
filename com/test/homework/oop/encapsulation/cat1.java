package com.test.homework.oop.encapsulation;

class Cat1 {

    //Close access to all internal variables of the class

    String name;
    int age;
    int weight;
    String color;

    private int getAge() {
        return age;
    }

    private String getColor() {
        return color;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }
}