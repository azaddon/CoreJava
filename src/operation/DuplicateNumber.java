package operation;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNumber {
	
	public int findDuplicateInteger(List<Integer> numbers) {
		
		int highestnumber =numbers.size()-1;
		int total=getsum(numbers);
		int duplicate=total-(highestnumber*(highestnumber+1)/2);
		return duplicate;
	}
	
	
	public int getsum(List<Integer> numbers) {
		int sum =0;
		for(int num:numbers) {
		sum+=num;}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<Integer>();
		for(int i=1;i<=33;i++) {
			numbers.add(i);
		}
		numbers.add(25);
		DuplicateNumber dn = new DuplicateNumber();
		System.out.println("Duplicate Number:::::"+dn.findDuplicateInteger(numbers));

		
	}

}
