package string;

import java.util.Scanner;

public class StringInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);

int i =s.nextInt();
double d = s.nextDouble();
s.nextLine();
String st =s.nextLine();

System.out.println(i+" "+d+" "+st);
	}

}
