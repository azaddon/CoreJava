package operation;

import java.io.NotActiveException;
import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = { 3, 5, 2, 6, 8, 9, 1, 32, 24, 35, 54, 46, 67, 75, 87 };
		int i, j, temp;
		for (i = 0; i < A.length - 1; i++) {
			for (j = i + 1; j < A.length; j++) {
				if (A[i] > A[j]) {
					temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}
			}
		}
		/*
		 * for(i=0;i<A.length;i++) { System.out.print(A[i]);}
		 */
		String s = Arrays.toString(A);
		System.out.println(s);

		int num = 32;
		int low = 0;
		int high = A.length;
		int mid = (low + high) / 2;
		while (low <= high) {

			if (A[mid] < num) {
				low = mid + 1;
			}

			else if (A[mid] == num) {
				System.out.println("number found at " + mid);
				break;
			} else {
				high = mid - 1;
			}
			mid = (low + high) / 2;
		}
		if (high < low) {
			System.out.println("ERROR FOUND:ITEM NOT PRESENT");
		}

	}

}
