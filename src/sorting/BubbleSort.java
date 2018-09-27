package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp,i,j;
		int[] arr = {3,1,5,2,6,4,15,32,23,14};
	String arr1=Arrays.toString(arr);
	System.out.println(arr1);
	/*	for(i=0;i<arr.length-1;i++) {
			for(j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}String arr2 =Arrays.toString(arr);
			System.out.print(arr2);*/
		/*int[] arr= {14,33,27,35,10};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
				
			}
		}*/
		for( i=0;i<arr.length;i++) {
			for(j=0;j<arr.length-1;j++) {
				int k=j+1;
				if(arr[j]>arr[k]) {
					 temp=arr[k];
					arr[k]=arr[j];
					arr[j]=temp;
				}
			}
		}
		String s=Arrays.toString(arr);
		System.out.println(s);
		}
	}


