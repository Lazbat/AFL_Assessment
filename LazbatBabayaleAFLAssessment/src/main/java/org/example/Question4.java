package org.example;

public class Question4 {
    //a program that calculates simple interest
    public static class Main {

	/*
	declaring a parameterized function to to calculate the simple interest
	*/
        static void simple_interest() {

            // @simple_interest = (PRT)/100
            // @P = principal or amount
            // @R = rate or percentage
            // @T = time or duration of interest
            double interest = (30000.0 * 0.1 * (float) 3) / 100;

            System.out.println("Simple Interest = " + interest);
        }

        public static void main(String[] args) {

            //calling and testing the function
            simple_interest();
        }
    }
}