package sorting;

public class SelectionSort {

	public static void selectionSort(int[] numbersToBeSorted) {
		// TODO Auto-generated method stub
int temp; String numbers1,numbers2;
		
		for(int i=0;i<numbersToBeSorted.length-1;i++) {
			int index=i;
			for(int j=i+1;j<numbersToBeSorted.length;j++) {
				if(numbersToBeSorted[j]<numbersToBeSorted[index]) {
					index=j;
				}
			}
			temp=numbersToBeSorted[index];
			numbersToBeSorted[index]=numbersToBeSorted[i];
			numbersToBeSorted[i]=temp;
		}
		
	}
	public static void main(String[] args) {
		int[] numbersToBeSorted= {4,1,6,3,9,1,34,45,12,16,-9,56,54,32};
		
		for(int i:numbersToBeSorted) {
		System.out.print(i+" ");
	}
		System.out.println();
		selectionSort(numbersToBeSorted);
		for(int i:numbersToBeSorted ) {
			System.out.print(i+" ");
		}
	}
}
	/*public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  
       
    public static void main(String a[]){  
        int[] arr1 = {9,14,3,2,43,11,58,22};  
        System.out.println("Before Selection Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        selectionSort(arr1);//sorting array using selection sort  
         
        System.out.println("After Selection Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
    }  
*/
