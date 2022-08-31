package com.test.homework.array;

import java.util.Scanner;

public class DivideArray {
    /*
    1. Create an int Array, size 20
    2. Read numbers from the console and fill in this Array
    3. Create 2 int Arrays, size 10 each
    4. Copy big array into 2 small. First half to the first Array, Second half to the second Array
    5. Print second small array to the console
     */

    public static void main(String[] args) {
        // implement me
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 20 numbers:");
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        int[] small_array1 = new int[10];
        int[] small_array2 = new int[10];
        for (int k = 0; k < 10; k++)
            array[k] = small_array1; // Заполняем массив элементами
    }
     System.out.print ("Inserted array elements:");
    for (int h = 0; i < 10; h++) {
        int[]small_array1;
        System.out.print (" " + small_array1[h]); // Выводим на экран, полученный массив
    }
    System.out.println();
}