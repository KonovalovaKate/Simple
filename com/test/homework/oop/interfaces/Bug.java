package com.test.homework.oop.interfaces;

interface Bug {
    public void FllySound(); // interface method (does not have a body)
    public void Action2(); // interface method (does not have a body)
}

class Flly implements Bug {
    public void FllySound() {
        System.out.println("The fly says: SSSSSSS");
    }
    public void Action2() {
        System.out.println("and is flying");
    }
}

class Main2 {
    public static void main(String[] args) {
        Flly myFlly = new Flly();
        myFlly.FllySound();
        myFlly.Action2();
    }
}