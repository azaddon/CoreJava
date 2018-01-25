package runtimepolymorphism;

class Living {
	void eat() {
		System.out.println("Animal eat anything....");
	}
}
class Lion extends Living{
	void eat() {
		System.out.println("Lion  eat meat....");
	}
}

class Cow extends Living{
	void eat() {
		System.out.println("Cow eat grass....");
	}
}
class Human extends Living {
	void eat() {
		System.out.println("Human eat both....");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Living a1;
a1 = new Lion();
a1.eat();
a1 = new Cow();
a1.eat();
a1 = new Human();
a1.eat();
	}

}
