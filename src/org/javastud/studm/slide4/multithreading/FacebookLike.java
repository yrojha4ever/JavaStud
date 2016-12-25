package org.javastud.studm.slide4.multithreading;

public class FacebookLike {
	private int likes = 0;
	
	public FacebookLike(int likes){
		this.likes = likes;
	}
	
	public synchronized void plusOne(){
		likes++;
		//---------
		System.out.println(Thread.currentThread().getName() + "  Likes: "+ likes);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
