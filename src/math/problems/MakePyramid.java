package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */

        for(int a=0; a<6; a++) { //a is less than the numbers of rows

            for(int b=0; b<6 -a; b++) { //b is less than the numbers of rows

                System.out.print(" "); //print space in between
            }
            for(int c=0; c<=a; c++) { //since c isn't greater than a, increment c by 1

                System.out.print("* "); //printing the * in pyramid shape
            }
            System.out.println();
        }


    }
}
