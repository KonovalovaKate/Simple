package com.test.homework.for_loop;

public class PrintRightTriangle {

    /*
    using for loop print right triangle from 8
    with size 10*10
    Example:
    8
    88
    888
    8888
    .....
     */
    public static void main(String[] args) {
        System.out.println("8");
        int n = 9;
        String eight = "8";
        for (int i = 0; i < n; i++) {
            eight += "8";
            System.out.println(eight);
        }
    }
}