package operation;

public class Max2num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {1,4,2,5,7,8,13,24};
		int max1=0,max2=0;
		for(int n:num) {
			if(max1<n) {
				max2=max1;
				max1=n;
			}else if(max2<n) {
				max2=n;
			}
		}
System.out.println(max1+" "+max2);

	}

}
