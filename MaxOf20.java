package com.test.homework.array;

import java.util.Scanner;

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
        System.out.println(maxNumber);
    }

    private static int[] initializeArray() {
        // implement me
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 20 numbers:");
        int[] array = new int[20];
        or (int i = 0; i < 20; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        return new int[0];
    }

    private static int max(int[] array) {
        // implement me
        int maxNum = array[0];

        for (int j : array) {
            if (j > maxNum)
                maxNum = j;
        }

        System.out.println("Maximum number = " + maxNum);
    }
        return 0;
    }
}