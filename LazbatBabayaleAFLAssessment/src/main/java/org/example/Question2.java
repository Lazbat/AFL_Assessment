package org.example;

    public class Question2 {

        static void powerCalc(int base, int power) {
            int result = 1; //where the final result would be stored

            for (int i = 1; i <= power; i++) {
                result *= base;
            }
            System.out.println("Result = " + result);
        }


        public static void main(String[] args) {

            int base = 2;
            int power = 4;

            powerCalc(base, power); //calling and passing arguments to the power function
        }
    }
