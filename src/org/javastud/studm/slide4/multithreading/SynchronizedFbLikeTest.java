package org.javastud.studm.slide4.multithreading;

public class SynchronizedFbLikeTest {
	public static void main(String[] args) {

		final FacebookLike everestFbPage = new FacebookLike(500);

		Thread ramTh = new Thread() {
			@Override
			public void run() {
				everestFbPage.plusOne();
			}
		};
		ramTh.setName("Ram-T1");

		Thread shyamTh = new Thread() {
			@Override
			public void run() {
				everestFbPage.plusOne();
			}
		};
		shyamTh.setName("Shyam-T2");

		Thread devidTh = new Thread() {
			@Override
			public void run() {
				everestFbPage.plusOne();
			}
		};
		devidTh.setName("Devid-T3");

		Thread johnTh = new Thread() {
			@Override
			public void run() {
				everestFbPage.plusOne();
			}
		};
		johnTh.setName("John-T4");

		ramTh.start();
		shyamTh.start();
		devidTh.start();
		johnTh.start();
		
		
		
		
		
		

	}
}
