package com.test.homework.for_loop;

import java.util.Scanner;

public class PrintRectangle {
    /*
    Read 2 numbers from console (m & n)
    using for loop
    print to console a rectangle size m * n from 8 numbers
    Example:
    m=2, n=4
    8888
    8888
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();

        // implement here
        int x;
        x=m*n;

            System.out.println(x+""+x+""+x+""+x);
            System.out.println(x+""+x+""+x+""+x);

    }
}
