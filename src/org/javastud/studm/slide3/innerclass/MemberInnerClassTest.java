package org.javastud.studm.slide3.innerclass;

public class MemberInnerClassTest {
	public static void main(String[] args) {
		MemberClassO outer = new MemberClassO();
		MemberClassO.MemberClassI inner = outer.new MemberClassI();
		inner.display();
	}
}
