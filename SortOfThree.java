package com.test.homework.if_else;

import java.util.Scanner;

public class SortOfThree {
    /*
    Enter and reed three numbers from the console
    Implement method which prints them from highest to lowest
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        printFromHighestToLowest(one, two, three);
        scanner.close();
    }

    private static void printFromHighestToLowest(int a, int b, int c) {
        //Implement me
        if (a > b & b > c) {
            System.out.println(a +" " +b +" "+c);
        }
        if (b > a & a > c) {
            System.out.println(b +" " +a +" "+c);
        }
        if (c > a & a > b) {
            System.out.println(c +" " +a +" "+b);
        }
    }
}