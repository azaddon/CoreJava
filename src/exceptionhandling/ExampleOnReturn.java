package exceptionhandling;

public class ExampleOnReturn {

	public int doMethod() {
		try {
			throw new ArithmeticException();
			//below code will not be reachable
			//int sum =10/0;
		}
		catch(ArithmeticException ae) {
			System.out.println("exception caught");
			return 4;
		}
		catch(Exception e) {
			System.out.println("this is of no use");
		}
		finally {
			return 10;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleOnReturn eor = new ExampleOnReturn();
		int rval = eor.doMethod();
		System.out.println("THe return value will be" + rval);
	}

}
