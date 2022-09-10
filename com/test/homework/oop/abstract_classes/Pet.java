package com.test.homework.oop.abstract_classes;
// Abstract class
abstract class Pet {
    // Abstract method (does not have a body)
    public abstract void animalName();
    // Regular method
    public void record() {
        System.out.println("Animals:");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat(); // Create a Cat object
        myCat.record();
        myCat.animalName();
        Dog myDog = new Dog(); // Create a Dog object
        myDog.animalName();

    }
}

// Subclass (inherit from Pet)
class Cat extends Pet {
    public void animalName() {
        // The body of animalName() is provided here
        System.out.println("Catty");
    }
}

class Dog extends Pet {
    public void animalName() {
        // The body of animalName() is provided here
        System.out.println("Doggy");
    }
}