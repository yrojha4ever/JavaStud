package org.constructor;

public class VolumeTest {
	public static void main(String[] args) {
		Volume v = new Volume();
		v.showVolume();

		Volume v2 = new Volume(5, 10, 15);
		v2.showVolume();
		v2.showArea();

	}
}
