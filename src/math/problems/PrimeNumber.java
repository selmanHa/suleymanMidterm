package math.problems;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		for (int a = 2; a <= 100000; a++){
			if(a%2 == 0){
				System.out.println(a+" is not a prime");
			}else{
				System.out.println(a+" is a prime number");
			}
		}

	}

}
