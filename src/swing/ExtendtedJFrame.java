package swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ExtendtedJFrame extends JFrame {
	private static final long	serialVersionUID	= 563395041350405111L;
	
	private JButton				button				= null;
	private JLabel				label				= null;

	public ExtendtedJFrame( ) {
		initializeComp( );
		this.setTitle( "JFrame Extended: JavaStud" );
		this.setSize( 400, 450 );
		this.setLayout( null );// using no layout managers
	}

	public void initializeComp( ) {
		JPanel contentPane = new JPanel( );
		contentPane.setLayout( null );
		contentPane.setSize( 400, 450 );

		contentPane.add( getLabel( ) ); //label
		contentPane.add( getButton( ) ); //button

		this.getContentPane( ).add( contentPane );
	}

	private JButton getButton( ) {
		if ( button == null ) {
			button = new JButton( "Click" );
			button.setBounds( 165, 100, 100, 40 );
		}
		return button;
	}

	private JLabel getLabel( ) {
		if ( label == null ) {
			label = new JLabel( "First Java Swing Program!" );
			label.setLocation( 10, 100 );
			label.setSize( 150, 25 );
		}
		return label;
	}

	public static void main( String[] args ) {

		ExtendtedJFrame mainFrame = new ExtendtedJFrame( );

		mainFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); // Enable Close Button in window

		mainFrame.setVisible( true );// making the frame visible
	}
}
