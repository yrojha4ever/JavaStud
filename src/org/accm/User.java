package org.accm;

public class User {
	private int id;
	private String name;
	private String email;

	public User(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return id + " "+ name + " " + email;
	}
}
