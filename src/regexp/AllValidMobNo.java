package regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AllValidMobNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
	System.out.println("Enter mob no");
	String mob =sc.next();
		System.out.println(mob);
Pattern p =Pattern.compile("[7-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]");
Matcher m=p.matcher(args[0]);
if(m.find()&&m.group().equals(args[0])) {
	System.out.println("valid mob");
}else {
	System.out.println("invalid mob");
}
	}

}
