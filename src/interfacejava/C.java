package interfacejava;

interface  A{ //class A  
void msg();//{System.out.println("Hello");}  
}  
interface B{ //class B  
void msg1();//{System.out.println("Welcome");}  
}  
class C implements A,B{// class C extends ,suppose if it were  
	public void msg(){System.out.println("Hello");}  
	public void msg1(){System.out.println("Welcome");}
	
public static void main(String args[]){  
   C obj=new C();  
   obj.msg1();
   obj.msg();//Now which msg() method would be invoked?  
}  
}  