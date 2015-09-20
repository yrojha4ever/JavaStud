package mthread;

public class ThreadJoinCalcTanx {
	static double	sin45;
	static double	cos45;

	public static void main( String[] args ) {

		Runnable sinx = new Runnable( ) {
			@Override
			public void run( ) {
				sin45 = Math.sin( Math.PI / 4 );
			}
		};

		Runnable cosx = new Runnable( ) {
			@Override
			public void run( ) {
				cos45 = Math.cos( Math.PI / 4 );
			}
		};

		Thread sin30T = new Thread( sinx );
		sin30T.start( );

		Thread con30T = new Thread( cosx );
		con30T.start( );

		try {
			sin30T.join( );
			con30T.join( );
		} catch ( InterruptedException e ) {
			e.printStackTrace( );
		}

		double tan45 = Math.round( sin45 / cos45 );
		System.out.println( tan45 ); // Nan:0.0 / 0.0;Infinity:5.0 / 0.0

	}
}
