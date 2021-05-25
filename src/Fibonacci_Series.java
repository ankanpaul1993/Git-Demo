import java.util.Scanner;

public class Fibonacci_Series {

	public void fibonacciSequence() {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();

		int n1;
		int n2 = 0;
		int n3 = 1;
		for (int i = 1; i < n; i++) {

			System.out.println(n3);

			n1 = n2;
			n2 = n3;
			n3 = n1 + n2;
			
			System.out.println("Tesing GIT");

		}

	}

}
