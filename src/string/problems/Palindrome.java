package string.problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        String word = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your word to check if it is palindrome: ");
        word = sc.nextLine();

        checkPalindrome(word);


    }

    public static void checkPalindrome(String word){
        String readToBack = "";
        int wordLength = word.length();

        for (int i = wordLength-1; i>=0; i--)
            readToBack = readToBack + word.charAt(i);

            if (word.equals(readToBack))
                System.out.println("The word you entered is palindrome.");
            else
                System.out.println("The word you entered is not palindrome.");


    }
}
