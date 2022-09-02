package com.test.homework.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.System.*;

public class MaxOf20 {
    /*
    1. In the method initializeArray():
    1.1. Create an Array - size 20
    1.2. Read numbers from the console and fill in this array
    2. Method max(int[] array) should find max number from elements of an array
     */

    public static void main(String[] args) {
        int[] array = initializeArray();
        int maxNumber = max(array);
        out.println(maxNumber);
    }

    private static int[] initializeArray() {
        // implement me
        Scanner input = new Scanner(in);
        out.println("Enter 20 numbers:");
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++)
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        return array;
    }

    private static int max(int[] array) {
        // implement me
        Arrays.sort(array);
        return array[array.length - 1];
    }


}