package oop.polymorphism.multilevel;

public class BabyDog extends Dog {

	void eat() {
		System.out.println("Class BabyDog: drinking milk");
	}

	public static void main(String[] args) {
		Animal a1 = new Animal();
		Animal a2 = new Dog();
		Animal a3 = new BabyDog();

		a1.eat();
		a2.eat();
		a3.eat();
	}
}
