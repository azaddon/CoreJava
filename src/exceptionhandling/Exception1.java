package exceptionhandling;

public class Exception1 extends RuntimeException {

	public static void main(String[] args) {
		//throw new ArithmeticException("/by Zero");
		throw new Exception1();		
        //System.out.println("hello");
	}

}
