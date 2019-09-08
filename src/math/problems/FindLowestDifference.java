package math.problems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};


        int num1 = array1.length;
        int num2 = array2.length;

        System.out.println("The lowest difference between numbers in both arrays is "+ findLowestDifference(array1,
                array2,num1,num2));


    }

    static int findLowestDifference(int array1[], int array2[], int num1, int num2){

        Arrays.sort(array1);
        Arrays.sort(array2);

        int temp1=0;
        int temp2 = 0;

        int finalSolution = Integer.MAX_VALUE; //assigning the max value

        while( temp1<num1 && temp2<num2){
            if (Math.abs(array1[temp1])-array2[temp2] < finalSolution){
                finalSolution = Math.abs(array1[temp1]-array2[temp2]);
            }
            if (array1[temp1]<array2[temp2]){
                temp1++;
            }else {
                temp2++;
            }
        }
        return finalSolution;
    }

}
