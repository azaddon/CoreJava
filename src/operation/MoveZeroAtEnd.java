package operation;

import java.util.Arrays;

public class MoveZeroAtEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A= {1,4,2,5,7,0,2,0,4,0};
		int count=0;
		for(int i=0;i<A.length;i++) {
			if(A[i]!=0) {
				A[count++]=A[i];
			}
		}
		while (count<A.length) {
			A[count++]=0;
		}
		String s =Arrays.toString(A);
		System.out.println(s);
	}

}
