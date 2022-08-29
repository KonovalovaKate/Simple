package com.test.homework.while_loop;

public class MultiplicationTable {
    /*
    Print to console multiplication table 10*10
    using while loop
    numbers are divided with space " "
    Example output:
    1  2  3  4  5  6  7  8  9 10
    2  4  6  8 10 12 14 16 18 20
    3  6  9 12 15 18 21 24 27 30
     */
    public static void main(String[] args) {
        for (
                int i = 1;
                i < 10; i++) {
            for (int k = 1; k < 11; k++) {
                System.out.print(k * i + "  ");
            }
            System.out.println("");
        }
    }
}
