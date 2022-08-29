package com.test.homework.while_loop;

import java.util.Scanner;

public class PrintStringNTimes {
    /*
    Enter from the console a string and a number
    Print string n times
    using loop while
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string and number");
        String s = scanner.nextLine();
        int n = scanner.nextInt();
        scanner.close();
        int i = 1;
        while (i <= n) {
            System.out.println(s);
            i++;
        }

    }
}
