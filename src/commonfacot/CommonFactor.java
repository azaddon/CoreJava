package commonfacot;

import java.util.Scanner;

public class CommonFactor {

	public static void main(String[] args) {
		// TODO Auto-generated3 method stub
		int count = 0;
		Scanner reader = new Scanner(System.in); // Reading from System.in
		System.out.println("Enter a number: ");
		int n1 = reader.nextInt(); // Scans the next token of the input as an int.
		// once finished
		int n2 = reader.nextInt();

		if (n1 > n2) {
			for (int i = 1; i <= n1; i++) {
				if ((n1 % i == 0) && (n2 % i == 0)) {
					count++;
				}
			}
		}
		if (n2 > n1) {
			for (int j = 1; j <= n2; j++) {
				if ((n1 % j == 0) && (n2 % j == 0)) {
					count++;
				}
			}
		}
if(n1==n2) {
	for(int k=1;k<=n1;k++) {
		if(n1%k==0) {
			count++;
		}
	}
}System.out.println(count);
	}
}
