package test.java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import javax.swing.text.TableView.TableRow;

public class Tab {

	private JFrame	frame;
	private JTable	table;

	/**
	 * Launch the application.
	 */
	public static void main( String[] args ) {
		EventQueue.invokeLater( new Runnable( ) {
			public void run( ) {
				try {
					Tab window = new Tab( );
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
	public Tab( ) {
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
		frame.getContentPane( ).add( getTable( ) );
	}

	private JTable getTable( ) {
		if ( table == null ) {

			String[] columnNames = { "First Name", "Last Name", "Sport", "# of Years", "Vegetarian" };
			Object[][] data = { { "Kathy", "Smith", "Snowboarding", new Integer( 5 ), new Boolean( false ) }, { "John", "Doe", "Rowing", new Integer( 3 ), new Boolean( true ) }, { "Sue", "Black", "Knitting", new Integer( 2 ), new Boolean( false ) }, { "Jane", "White", "Speed reading", new Integer( 20 ), new Boolean( true ) }, { "Joe", "Brown", "Pool", new Integer( 10 ), new Boolean( false ) } };

			table = new JTable( data, columnNames );
			table.setBounds( 27, 32, 397, 203 );

			// TableColumn tcol = new TableColumn( );
			// tcol.setHeaderValue( "Id" );
			// tcol.setHeaderValue( "Name" );
			// tcol.setHeaderValue( "Address" );

			// TableRow rowI = new TableRow( elem );

		}
		return table;
	}
}
