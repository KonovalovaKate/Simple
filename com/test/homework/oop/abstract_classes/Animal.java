package com.test.homework.oop.abstract_classes;
// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalName();
    // Regular method
    public void name() {
        System.out.println("Animal:");
    }

    public static void main(String[] args) {
        Cow myCow = new Cow(); // Create a Cow object
        myCow.name();
        myCow.animalName();

    }
}

// Subclass (inherit from Animal)
class Cow extends Animal {
    public void animalName() {
        // The body of animalName() is provided here
        System.out.println("Zoya");
    }
}



