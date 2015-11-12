package mthread;

public class ThreadJoinCalcTanx {
	private double	sin45;
	private double	cos45;

	public static void main( String[] args ) {

		final ThreadJoinCalcTanx obj = new ThreadJoinCalcTanx( );

		Runnable sin45r = new Runnable( ) {
			@Override
			public void run( ) {
				obj.sin45 = Math.sin( Math.PI / 4 );
			}
		};
		
		Thread sin45t = new Thread( sin45r );
		sin45t.start( );

		Runnable cos45r = new Runnable( ) {
			@Override
			public void run( ) {
				obj.cos45 = Math.cos( Math.PI / 4 );
			}
		};
		
		Thread cos45t = new Thread( cos45r );
		cos45t.start( );

		try {
			sin45t.join( );
			cos45t.join( );
		} catch ( InterruptedException e ) {
			e.printStackTrace( );
		}

		double tan45 = Math.round( obj.sin45 / obj.cos45 );
		System.out.println( "Tan45: " + tan45 ); // Nan:0.0 / 0.0;Infinity:5.0 / 0.0

	}
}
