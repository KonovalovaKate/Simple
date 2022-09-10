package com.test.homework.oop.inheritance;
public class Animal{
    protected String animal = "Animal";



    public void honk() {
        System.out.println("Animals:");
    }

    public static void main(String[] args) {
        cow myFastAnimal = new cow();
        pig myFastAnimal2 = new pig();
        sheep myFastAnimal3 = new sheep();
        bull myFastAnimal4 = new bull();
        pig myFastAnimal5 = new pig();
        goat myFastAnimal6 = new goat();
        myFastAnimal.honk();
        System.out.println(myFastAnimal.animal + " " + myFastAnimal.cow);
        System.out.println(myFastAnimal2.animal + " " + myFastAnimal2.pig);
        System.out.println(myFastAnimal3.animal + " " + myFastAnimal3.sheep);
        System.out.println(myFastAnimal4.animal + " " + myFastAnimal4.bull);
        System.out.println(myFastAnimal5.animal + " " + myFastAnimal5.pig);
        System.out.println(myFastAnimal6.animal + " " + myFastAnimal6.goat);

    }
}

class cow extends Animal {
    String cow = "Cow";


}
class pig extends Animal {
    String pig = "Pig";


}
class sheep extends Animal {
    String sheep = "Sheep";

}
class bull extends Animal {
    String bull = "Bull";


}
class goat extends Animal {
    String goat = "Goat";


}