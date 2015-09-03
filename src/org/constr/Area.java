package org.constr;

public class Area {

	private int length;
	private int breadth;

	public Area(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public void calculateArea() {
		int area = length * breadth;
		System.out.println("Area is:" + area);
	}
	
	@Override
	public String toString() {
		return length + " " + breadth;
	}
	

	public static void main(String[] args) {
		Area area = new Area(5, 4);
		System.out.println(area);
		
//		System.out.println( area.hashCode() );
//		
//		System.out.println( "iamStud".hashCode()  );
	}

}
