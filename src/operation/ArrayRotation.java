package operation;

import java.util.Arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = {1,2,3,4,5,6,7};
		int i,d=2,temp;
		for(int j=0;j<d;j++) {
			temp=A[0];
			for(i=0;i<A.length-1;i++) {
				A[i]=A[i+1];
			}
			A[i]=temp;
		}
		String string =Arrays.toString(A);
		System.out.println(string);
		}

}
