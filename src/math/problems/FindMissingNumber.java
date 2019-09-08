package math.problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
         int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};

         int lastNumer = 10;
         int sumOfProductInHalf = (lastNumer*(lastNumer+1)/2); //10 * 11 +1 divide by 2 = 55
         int sumOfNumbersInArray = Arrays.stream(array).sum(); //46

         int numberMissed = sumOfProductInHalf - sumOfNumbersInArray; //55 - 46 = 9
        System.out.println("The missing number in the array is "+numberMissed);


    }
}
