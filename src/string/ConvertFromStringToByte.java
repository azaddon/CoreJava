package string;

import java.util.Arrays;

public class ConvertFromStringToByte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1 ="My name is khan";
byte[] b1= s1.getBytes();
System.out.println(b1);
System.out.println("String to byte"+Arrays.toString(b1));

byte[] b2 = { 77, 121, 32, 110, 97, 109, 101, 32, 105, 115, 32, 107, 104, 97, 110};

String str =new String(b2);
System.out.println(str);
	}

}
