package javainstanceof;

public class Dog2 {
//If we apply instance of operator with a variable that have null value, it returns false
	public static void main(String args[]) {
		Dog2 d = null;
		System.out.println(d instanceof Dog2);// false
	}

}
