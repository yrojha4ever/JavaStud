package swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SwingContentPaneExample {
	public static void main( String[] args ) {

		JFrame f = new JFrame( );// creating instance of JFrame
		f.setTitle( "First Swing Program: JavaStud" );

		JPanel contentPane = new JPanel( );
		contentPane.setLayout( null );
		contentPane.setSize( 400, 450 );

		JLabel label = new JLabel( "First Java Swing Program!" );
		label.setLocation( 10, 100 );
		label.setSize( 150, 25 );

		JButton button = new JButton( "Click" );// creating instance of JButton
		button.setBounds( 165, 100, 100, 40 );// Set position and width/heigth.

		contentPane.add( label );
		contentPane.add( button );

		f.getContentPane( ).add( contentPane );

		f.setSize( 400, 450 );// 400 width and 450 height
		f.setLayout( null );// using no layout managers

		f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); // Enable Close Button in window

		f.setVisible( true );// making the frame visible

	}
}
