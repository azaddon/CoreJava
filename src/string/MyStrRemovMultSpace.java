package string;

import java.util.StringTokenizer;

public class MyStrRemovMultSpace {
	
	    public static void main(String args[]){
	        String str = "String    With Multiple      Spaces";
	        StringTokenizer st = new StringTokenizer(str, " ");
	        StringBuffer sb = new StringBuffer();
	        while(st.hasMoreElements()){
	        	//System.out.println(st.nextElement());
	            sb.append(st.nextElement()).append(" ");
	        }
	        System.out.println(sb.toString().trim());
	    }
	}


