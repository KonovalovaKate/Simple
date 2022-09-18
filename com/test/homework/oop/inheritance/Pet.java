package com.test.homework.oop.inheritance;
public class Pet {
    protected String animal = "Animal";
    public void honk() {
        System.out.println("Animals:");
    }

    public static void main(String[] args) {
        cat myFastAnimal = new cat();
        dog myFastAnimal2 = new dog();
        myFastAnimal.honk();
        System.out.println(myFastAnimal.animal + " " + myFastAnimal.petName);
        System.out.println(myFastAnimal2.animal + " " + myFastAnimal2.petName2);

    }
}

class cat extends Pet {
    String petName = "Cat";


    }
class dog extends Pet {
    String petName2 = "Dog";


}


