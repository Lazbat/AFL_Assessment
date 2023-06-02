package org.example;

public class Question10 {
    public static class Main {

        // Function to return the original string
        // after converting it back from camelCase
        static void getString(String s)
        {
            // Print the first character in upper case
            System.out.print(Character.toUpperCase(s.charAt(0)));

            // printing the rest characters
            int i = 1;
            while (i < s.length())
            {
                /*if the current Character is in upper case print the character in lowercase */
                if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                    System.out.print(" "+ Character.toLowerCase(s.charAt(i)));

                    // Else print the current character
                else
                    System.out.print(s.charAt(i));

                i++;
            }
        }

        public static void main (String[] args)
        {
            String s = "ILoveProgramming";
            getString(s);
        }
    }
}
