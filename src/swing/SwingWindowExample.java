package swing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingWindowExample {
	public static void main( String[] args ) {

		JFrame f = new JFrame( );// creating instance of JFrame

		JButton button = new JButton( "Click" );// creating instance of JButton
		button.setBounds( 130, 100, 100, 40 );// Set position and width/heigth.

		f.add( button );// adding button in JFrame
		f.setSize( 400, 450 );// 400 width and 450 height
		f.setLayout( null );// using no layout managers

		f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); // Enable Close Button in window

		f.setVisible( true );// making the frame visible

	}
}
