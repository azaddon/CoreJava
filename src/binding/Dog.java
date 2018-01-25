package binding;
/*
  int data=30; //Here data variable is a type of int.
class Dog{  
	 public static void main(String args[]){  
	  Dog d1;//Here d1 is a type of Dog  
	 }  
	}  */

/*class Animal{}  

class Dog extends Animal{  
 public static void main(String args[]){  
  Dog d1=new Dog();  
 }  
}

Here d1 is an instance of Dog class, but it is also an instance of Animal.
------------------------------  
*/
//static Binding
/*public class Dog {
	 private void eat(){System.out.println("dog is eating...");}  
	  
	 public static void main(String args[]){  
	  Dog d1=new Dog();  
	  d1.eat();  
	 }  

}*/

class Animal {
	void eat() {
		System.out.println("animal is eating...");
	}
}

class Dog extends Animal {
	void eat() {
		System.out.println("dog is eating...");
	}

	public static void main(String args[]) {
		Animal a = new Dog();
		a.eat();
	}
}
// object type cannot be determined by the compiler, because the instance of Dog
// is also an instance of Animal.
// So compiler doesn't know its type, only its base type.