package org.javastud.studm.slide4.multithreading;

public class RunnableThread implements Runnable {

	@Override
	public void run() {
		System.out.println("I am from runnable thread..");
	}
	
	public static void main(String[] args) {
		RunnableThread r = new RunnableThread();
		Thread t1 = new Thread(r);
		t1.setDaemon(true);
		t1.start();
		
		RunnableThread r2 = new RunnableThread();
		Thread t2 = new Thread(r2);
		t2.setPriority(Thread.MAX_PRIORITY);
		t2.start();
		
		// Annonymous Runnable Thread.
		Runnable nabilR = new Runnable(){
			@Override
			public void run() {
				System.out.println("I am annonymous Nabil bank.");
			}
		};
		Thread nabilT = new Thread(nabilR);
		nabilT.start();
		
		System.out.println("Main thread...end");
		
	}
	
}
