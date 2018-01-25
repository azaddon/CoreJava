package javainstanceof;

class Animals {
}

class Dog3 extends Animals {
	static void method(Animals a) {

		//if (a instanceof Dog3) {

			Dog3 d = (Dog3) a;// downcasting

			System.out.println("ok downcasting performed");
		}
	//}

	public static void main(String[] args) {
		Animals a = new Dog3();
		Dog3.method(a);
	}

}