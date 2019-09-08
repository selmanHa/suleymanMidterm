package math.problems;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 *
		 */
		int x;
		int n =101;
		while(n>=91){
			n--;
			System.out.print(n+", ");
		}

		int n2 = 90;
		while (n2>=71){
			n2 -= 2;
			System.out.print(n2+", ");
		}

		int n3 = 70;
		while (n3>=41){
			n3 -= 3;
			System.out.print(n3+", ");
		}

		int n4 = 40;
		while (n4>=1){
			n4 -=4;
			System.out.print(n4+", ");
		}


	}
}
