package com.test.homework.oop.inheritance;

public class horseAndPegas {
    public static void main(String[] args) {
        class horse {
            protected String animal = "loshadka";        // horse attribute

            public void honk() {                    // horse method
                System.out.println("igogo!");
            }
        }
        class pegas extends horse {
            private String pegasName = "Luna";    // Car attribute

            public static void main(String[] args) {

                // Create a myPegas object
                pegas myPegas = new pegas();

                // Call the honk() method (from the horse class) on the myPegas object
                myPegas.honk();

                // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
                System.out.println(myPegas.animal + " " + myPegas.pegasName);
            }
        }
    }
}
