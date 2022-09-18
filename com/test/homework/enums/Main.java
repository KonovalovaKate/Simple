package com.test.homework.enums;

public class Main {
    public static void main(String[] args) {
        Alphabet a = Alphabet.A;
        System.out.println(a);
       for (Alphabet alphabet : Alphabet.values()) {
          System.out.println(alphabet);

        }
        Alphabet[] values = Alphabet.values();

        for (int i=0; i< values.length; i++ ){
            Alphabet value = values[i];

            System.out.println(values[i] +"-"+value.getLetterPosition());
        }
    }

}
