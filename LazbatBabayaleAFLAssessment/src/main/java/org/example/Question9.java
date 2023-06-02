package org.example;

public class Question9 {
    public static class Main {

        static void upper_case(String word) {
		/*
		printing out the word in upper case using toUpperCase() function */
            System.out.println(word.toUpperCase());
        }

        public static void main(String[] args) {

            // @name: stores the string
            String name = "johNson peter";

            //testing the functions correctness
            upper_case(name);
        }
    }
}
