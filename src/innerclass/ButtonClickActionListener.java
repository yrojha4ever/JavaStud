package innerclass;

public class ButtonClickActionListener {
	public void addActionListener( ActionListener e ) {
		e.actionPerformed( );
	}

	public static void main( String[] args ) {
		button1Clicked( );
		button2Clicked( );
	}

	public static void button1Clicked( ) {
		// No1:way
		ActionListener aEvent = new ActionListener( ) {
			@Override
			public void actionPerformed( ) {
				System.out.println( "HELLO From actionPerformed: 1" );
			}
		};
		ButtonClickActionListener button2 = new ButtonClickActionListener( );
		button2.addActionListener( aEvent );

	}

	public static void button2Clicked( ) {
		// NO2:way
		ButtonClickActionListener button = new ButtonClickActionListener( );
		button.addActionListener( new ActionListener( ) {
			@Override
			public void actionPerformed( ) {
				System.out.println( "HELLO From actionPerformed: 2" );
			}
		} );
	}
}
