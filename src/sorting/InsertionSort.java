package sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int i,j,key;
		// TODO Auto-generated method stub
		int[] Arr= {5,6,8,2,3,9,1,4,7};
		/*for( j=3;j<Arr.length;j++) {
			 key=Arr[j];
			 i=j-1;
			while( i>=0 && Arr[i]>key) {
				Arr[i+1]=Arr[i];
				i--;
			
			}	
			Arr[i+1]=key;
		}
		String Arr1=Arrays.toString(Arr);
		System.out.println(Arr1);*/
		for(i=1;i<Arr.length;i++) {
			for(j=i;j>0;j--) {
				if(Arr[j]<Arr[j-1]) {
					key=Arr[j];
					Arr[j]=Arr[j-1];
					Arr[j-1]=key;
				}
			}
		}
			String s=Arrays.toString(Arr);
			System.out.println(s);
	}

}
