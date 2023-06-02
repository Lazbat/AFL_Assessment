package org.example;

public class Question7 {
    //program that prints out the odd numbers in an array

    public static class Main {

        static void odd(int[] array) {

            for (int j : array) {

                if (j % 2 != 0) {
                    System.out.println(j);
                }
            }
        }
        public static void main(String[] args) {

            //intializing array 1
            int[] arr1 = {1, 2, 3, 4, 5, 6};
            odd(arr1); //calling and passing arr1 to the odd() function

            System.out.println("\nPrinting odd numbers of the second array!\n");

            //initializing array 2
            int[] arr2 = {32, 2, 9, 91, 19, 401, 0};
            odd(arr2);

        }
    }
}
