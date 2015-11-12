package io;

import java.io.Serializable;

public class User implements Serializable {

	private static final long	serialVersionUID	= -8986612101553037402L;

	private int					id;	// transient

	private transient String	name;

	public User( int id, String name ) {
		this.id = id;
		this.name = name;
	}

	public int getId( ) {
		return id;
	}

	public void setId( int id ) {
		this.id = id;
	}

	public String getName( ) {
		return name;
	}

	public void setName( String name ) {
		this.name = name;
	}

	@Override
	public String toString( ) {
		return id + " " + name;
	}

}
