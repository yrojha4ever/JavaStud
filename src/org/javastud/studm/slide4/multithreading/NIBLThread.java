package org.javastud.studm.slide4.multithreading;

public class NIBLThread extends Thread {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + ": I am Nabil Bank.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + ": After sleep.");
	}

	public static void main(String[] args) {
		NIBLThread t1 = new NIBLThread();
		t1.setName("NIBL-T1");
		t1.setPriority(1);
		t1.start();
		
		NIBLThread t2 = new NIBLThread();
		t2.setName("NIBL-T2");
		t2.start();
		
		
		//Annonymous thread
		Thread nicAsiaTh = new Thread(){
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + ": I am Nic Asia Bank.");
			}
		};
		nicAsiaTh.setName("NIC-T1");
		nicAsiaTh.start();
		

		System.out.println(Thread.currentThread().getName() + ": Hello From main method...");
	}
}
