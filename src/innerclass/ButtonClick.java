package innerclass;

public class ButtonClick {

	public void addActionEvent( ActionEvent e ) {
		e.actionPerformed( );
	}

	public static void main( String[] args ) {
		button1Clicked( );
		button2Clicked( );
	}

	public static void button1Clicked( ) {
		// No1:way
		ActionEvent aEvent = new ActionEvent( ) {
			@Override
			public void actionPerformed( ) {
				System.out.println( "HELLO From actionPerformed: 1" );
			}
		};
		ButtonClick button2 = new ButtonClick( );
		button2.addActionEvent( aEvent );

	}

	public static void button2Clicked( ) {
		// NO2:way
		ButtonClick button = new ButtonClick( );
		button.addActionEvent( new ActionEvent( ) {
			@Override
			public void actionPerformed( ) {
				System.out.println( "HELLO From actionPerformed: 2" );
			}
		} );
	}
}
