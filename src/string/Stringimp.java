package string;

public class Stringimp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str ="there is the elephant  in the zoo  ";
System.out.println(str.length());
 for(int i=0;i<str.length();i++) {
	  
		  if(str.charAt(i)=='t' && str.charAt(i+3)==' ') {
			  System.out.println("changed");
			  
		  }else {
			  System.out.println("not hanged");
		  }
		 
	 
	 
 }
	String newstr=	str.replaceAll("the ","that ");
System.out.println(newstr);
	}

}
