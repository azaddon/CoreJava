package pattern;

public class RightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;int space=5;int count =1;int sum=1;
		for (i = 4; i >=1 ; i--) {
			for (j = 1; j <= i-1; j++) {
				System.out.print(" ");}
			for(int k=4;k>=i;k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	for(int l=0;l<5;l++) {
		for(int m=5;m>l;m--) {
			System.out.print(" ");
		}
		sum=1;
		for(int n=0;n<=l;n++) {
			System.out.print(sum+" ");
			sum=sum*(l-n)/(n+1);
		}
		System.out.println();
	}
	
	
	}

}
