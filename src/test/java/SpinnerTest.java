package test.java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;

public class SpinnerTest {

	private JFrame		frame;
	private JPanel		panel;
	private JSpinner	spinner;

	/**
	 * Launch the application.
	 */
	public static void main( String[] args ) {
		EventQueue.invokeLater( new Runnable( ) {
			public void run( ) {
				try {
					SpinnerTest window = new SpinnerTest( );
					window.frame.setVisible( true );
				} catch ( Exception e ) {
					e.printStackTrace( );
				}
			}
		} );
	}

	/**
	 * Create the application.
	 */
	public SpinnerTest( ) {
		initialize( );
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize( ) {
		frame = new JFrame( );
		frame.setBounds( 100, 100, 450, 300 );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.getContentPane( ).setLayout( null );
		frame.getContentPane( ).add( getPanel( ) );
	}

	private JPanel getPanel( ) {
		if ( panel == null ) {
			panel = new JPanel( );
			panel.setBounds( 10, 11, 414, 240 );
			panel.setLayout( null );
			panel.add( getSpinner( ) );
		}
		return panel;
	}

	private JSpinner getSpinner( ) {
		if ( spinner == null ) {
			spinner = new JSpinner( );
			spinner.setBounds( 45, 28, 193, 77 );
		}
		return spinner;
	}
}
