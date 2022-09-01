package com.test.homework.array;

import java.util.Scanner;

public class ReverseArray {
    /*
    1. Create an Array, of 10 String elements
    2. Input from the console 8 Strings and save them to the array
    3. Print to the console (10 elements) in reverse order. Each element from new line
     */
    public static void main(String[] args) {
        //implement me
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 8 strings");
        String[] array = new String[10];
        System.out.print ("Inserted array elements:");
        for (int i = 0; i <8; i++) {
            array[i] = input.nextLine(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        for (int h = 7; h >= 0; h--) {

            System.out.print (" " + array[h]); // Выводим на экран, полученный массив
        }
    }
}