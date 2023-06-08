package org.example;

public class Question6 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String input = "Hello";
        String input2 = "concatenate";
        String result = removeDuplicates(input);
        String result2 = removeDuplicates(input2);
        System.out.println("The value of A is " + result);
        System.out.println("The value of B is " + result2);

    }
    public static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        boolean[] seen = new boolean[256]; // Assuming ASCII characters

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!seen[c]) {
                sb.append(c);
                seen[c] = true;
            }
        }

        return sb.toString();
    }
}

