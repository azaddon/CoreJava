package pattern;

import java.util.Scanner;

public class triangle {

	public void rightangletriangle() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void reverseOfRightAngleTRiangle() {
		System.out.println("------------------------");
		for (int l = 5; l >= 1; l--) {
			for (int m = 1; m <= l - 1; m++) {
				System.out.print(" ");
			}
			for (int n = 5; n >= l; n--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		triangle t1 = new triangle();
		t1.rightangletriangle();
		t1.reverseOfRightAngleTRiangle();
	}
}
