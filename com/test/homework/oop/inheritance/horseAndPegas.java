package com.test.homework.oop.inheritance;

class horse {
    protected String animal = "Horse";
    public void honk() {
        System.out.println("Igo-go!");
    }
}

class pegas extends horse {
    private String horseName = "Luna";
    public static void main(String[] args) {
        pegas myFastCar = new pegas();
        myFastCar.honk();
        System.out.println(myFastCar.animal + " " + myFastCar.horseName);
    }
}

