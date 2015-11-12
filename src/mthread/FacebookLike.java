package mthread;

public class FacebookLike {

	private Integer	likes	= 0;

	/* set current Page likes */
	public FacebookLike( Integer likes ) {
		this.likes = likes;
	}

	/* Synchronized method call solve problem of Multiple-thread(user) */
	public void plusOne( ) {

		// Increase like by 1.
		likes++;

		// Thread.current thread get current thread object just like this keyword.
		System.out.println( Thread.currentThread( ).getName( ) + " Likes: " + likes );

		// Thread.sleep halt running thread for 1/10 second time.
		try {
			Thread.sleep( 100 );
		} catch ( InterruptedException e ) {
			e.printStackTrace( );
		}
	}

}
