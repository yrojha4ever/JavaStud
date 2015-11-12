package mthread;

public class SynchronizeFbLike {

	public static void main( String[] args ) {

		/* Facebook Page: Everest, Current Likes: 500 */
		final FacebookLike everestFbPagePiclike = new FacebookLike( 500 );

		Thread user1 = new Thread( ) {
			public void run( ) {
				everestFbPagePiclike.plusOne( );
			}
		};
		Thread user2 = new Thread( ) {
			public void run( ) {
				everestFbPagePiclike.plusOne( );
			}
		};
		Thread user3 = new Thread( ) {
			public void run( ) {
				everestFbPagePiclike.plusOne( );
			}
		};
		Thread user4 = new Thread( ) {
			public void run( ) {
				everestFbPagePiclike.plusOne( );
			}
		};

		/* User1,2,3,4 hit like button in Everest Facebook Page */
		user1.start( );
		user2.start( );
		user3.start( );
		user4.start( );

	}
}
