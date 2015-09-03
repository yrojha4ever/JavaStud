package control;

public class Emp {
	int id;
	String name;
	Address address;

	public Emp(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void display() {
		System.out.println(id + " " + name);
		System.out.println(address.city + " " + address.state + " "
				+ address.country);
	}

	public static void main(String[] args) {
		Address address1 = new Address("Kathmandu", "Bagmati", "Nepal");
		Address address2 = new Address("Pokhara", "Kaski", "Nepal");

		Emp e = new Emp(111, "Sam", address1);
		Emp e2 = new Emp(112, "Devid", address2);

		e.display();
		e2.display();

	}
}
