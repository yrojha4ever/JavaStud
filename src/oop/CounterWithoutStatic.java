package oop;

public class CounterWithoutStatic {
	int count = 0;// will get memory when instance is created

	CounterWithoutStatic() {
		count++;
	}

	private void showCount() {
		System.out.println(count);
	}

	public static void main(String args[]) {

		new CounterWithoutStatic().showCount();
		new CounterWithoutStatic().showCount();
		new CounterWithoutStatic().showCount();

	}

}
