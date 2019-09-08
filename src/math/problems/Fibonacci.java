package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */

        int prevNumber = 0;
        int nextNumber = 1;
        int tempNumber;
        int count = 40;
        System.out.print(prevNumber+" "+nextNumber);

        for (int j = 0; j < count; j++){

            tempNumber = prevNumber+nextNumber;
            System.out.print(" "+tempNumber);
            prevNumber = nextNumber;
            nextNumber = tempNumber;
        }
    }
}
