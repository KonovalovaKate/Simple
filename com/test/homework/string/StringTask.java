package com.test.homework.string;

public class StringTask {
    public static void main(String[] args) {
        String s = "Hey how are you";
        //print the length of the string
        //print the last char of the string (use the previous method to calculate the index - do not use hardcoded indexes)

        //print the index of 'a'

        //substirng the string by the second space " " - result should be "Hey how"

        //check if the string start with 'h', with 'H', end with '\'

        //check if the string contains "are you" contains "are you "

        //replace "how" to "who"

        //split the string via space " " and print each word from the new line

        //create the method that takes String and char parameters and return the quantity of letters that exist in that string

        //create the greeting method that takes name and age and print the string - "Hey, my name is Andrii, and I'm 41 years old"
        // (Use String.format function)
        int q = s.length();
        System.out.println(q);
        String l = String.valueOf(s.toCharArray()[s.length() - 1]);
        System.out.println(l);
        int i = s.indexOf("a");
        System.out.println(i);
        System.out.println(s.substring(0, 7));
        String f = String.valueOf(s.charAt(0));
        String s1 = "h";
        String s2 = "H";
        String s3 = "/";
        String g = String.valueOf(s.charAt(0));
        System.out.println(g.equals(s1) + " not starting with h");
        System.out.println(g.equals(s2) + " starting with H");
        System.out.println(g.equals(s3) + " not starting with /");
        String sub = "are you";
        System.out.println(s.regionMatches(0, sub, 0, 0));
        String s6= s.replace("how", "who");
        System.out.println(s6);

    }

    // public static int getCharQuantityInTheString(String s, char c) {
    //return 0;
    // }

    //public static void greeting(String name, int age) {

}
