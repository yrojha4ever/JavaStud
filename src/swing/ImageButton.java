package swing;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ImageButton {
	public ImageButton( ) {
		JFrame f = new JFrame( );

		JButton b = new JButton( new ImageIcon( "resource/pressit.jpg" ) );
		b.setBounds( 130, 100, 200, 80 );

		f.add( b );

		f.setSize( 450, 400 );
		f.setLayout( null );
		f.setVisible( true );

		f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

	}

	public static void main( String[] args ) {
		new ImageButton( );
	}
}
