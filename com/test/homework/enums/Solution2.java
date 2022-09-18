package com.test.homework.enums;

import java.util.HashMap;



public class Solution2 {
    /*
    Implement enum Week, that each element has the name of the week (String) and the number of weekday (int)
    Print these values to the console in the formant - Monday - day of the week: 1
     */
    public static void main(String[] args) {
        Week[] days = Week.values();
        for (Week day : days) {
            System.out.println(day +" - " +(day.ordinal()+1));
        }


    }
    public enum Week {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
    }


}

