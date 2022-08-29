package com.test.homework.if_else;

import java.util.Scanner;

public class MaxOfFour {
    /*
    Enter and reed four numbers from the console
    Implement method which prints max of four variable
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter four numbers:");
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        int four = scanner.nextInt();
        printMaxOfFour(one, two, three, four);
        scanner.close();
    }

    private static int printMaxOfFour(int a, int b, int c, int d) {
        //Implement me

        if (a>b & a>c & a>d){
                System.out.println(a);}

            if (b > a & b > c & b > d)

            { System.out.println(b);}

            if (d>a & d>b & d>c)
            {System.out.println(d);}

             if (c>a & c>b & c>b)
             {System.out.println(c);}

    return (a);}
}