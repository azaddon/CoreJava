package pattern;

import java.util.Scanner;

public class triangle {

	public void factorial() {
		int i, N = 5, fact = 1;
		for (i = 1; i <= N; i++) {
			fact = fact * i;

		}
		System.out.println(fact);
	}

	public void fibonacci() {
		int a = 0, b = 1, c, i;
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		if (N <= 1) {
			return;
		}
		for (i = 2; i <= N; i++) {

			c = a + b;
			a = b;
			b = c;

		}
		System.out.println(b);
	}

	public void palindrome() {
		String original, reverse = "";
		Scanner s1 = new Scanner(System.in);
		System.out.println("we need to check palindrome");
		original = s1.nextLine();
		int length = original.length();
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		if (original.equalsIgnoreCase(reverse)) {
			System.out.println("it is palindrome");
		} else {
			System.out.println("it is not palindrome");
		}
	}

	public static void main(String[] args) {
		triangle t1 = new triangle();
		t1.factorial();
		t1.fibonacci();
		t1.palindrome();
	}
}
