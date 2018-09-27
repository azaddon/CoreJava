package operation;

public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A= {3,5,7,3,8,2,1};
		int n=A.length-2, item=10, k=3;
		int j=n;
		System.out.println("original Array:");
		for(int l=0;l<=n;l++) {
			System.out.print(A[l]);
		}
		System.out.println();
		n=n+1;
		while(j>=k) {
			A[j+1]=A[j];
			j=j-1;
		}
		A[k]=item;
		System.out.println("After Insertion:");
		for(int m=0;m<=n;m++) {
			System.out.print(A[m]);
		}
	}

}
