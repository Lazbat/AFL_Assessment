package org.example;

public class Question8 {
    //program that prints out the odd numbers in an array

    public static class Main {

        static void odd(int[] array) {

            int i = 0;
            while (i < array.length) {

                if(array[i] % 2 == 0) {
                    System.out.println(array[i]);
                }
                i++;
            }
        }
        public static void main(String[] args) {

            //intializing array 1
            int[] arr1 = {1, 2, 3, 4, 5, 6};
            odd(arr1); //calling and passing arr1 to the odd() function

            System.out.println("\nPrinting the Even numbers of the second array!\n");

            //initializing array 2
            int[] arr2 = {32, 2, 9, 91, 19, 401, 0};
            odd(arr2);

        }
    }
}
