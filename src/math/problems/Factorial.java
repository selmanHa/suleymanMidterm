package math.problems;

import java.util.Scanner;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        Scanner sc = new Scanner(System.in);

        int factorial=1;

        System.out.println("*****Please enter your number to see its factorial*****");
        int number = sc.nextInt(); //the number to calculate
        for(int j=1;j<=number;j++){

            factorial=factorial*j; //number * (number -1) * (number-1) etc....
        }
        System.out.println("The factorial of your number, "+number+" is: "+factorial);
    }
}
