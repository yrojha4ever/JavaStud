package test.java;

import java.awt.EventQueue;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

public class TableTest {

	public static void main( String[] args ) {
		new TableTest( );
	}

	public TableTest( ) {
		startUI( );
	}

	public void startUI( ) {
		EventQueue.invokeLater( new Runnable( ) {
			@Override
			public void run( ) {
				try {
					UIManager.setLookAndFeel( UIManager.getSystemLookAndFeelClassName( ) );
				} catch ( ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex ) {
					ex.printStackTrace( );
				}

				MyTableModel model = new MyTableModel( );
				model.addRow( new Object[] { 0, "Brian", false } );
				model.addRow( new Object[] { 1, "Ned", false } );
				model.addRow( new Object[] { 2, "John", false } );
				model.addRow( new Object[] { 3, "Drogo", false } );
				JTable table = new JTable( model );

				JFrame frame = new JFrame( "Testing" );
				frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
				frame.add( new JScrollPane( table ) );
				frame.pack( );
				frame.setLocationRelativeTo( null );
				frame.setVisible( true );
			}
		} );
	}

	public class MyTableModel extends DefaultTableModel {

		public MyTableModel( ) {
			super( new String[] { "ID", "Name", "Present" }, 0 );
		}

		@Override
		public Class< ? > getColumnClass( int columnIndex ) {
			Class clazz = String.class;
			switch ( columnIndex ) {
			case 0:
				clazz = Integer.class;
				break;
			case 2:
				clazz = Boolean.class;
				break;
			}
			return clazz;
		}

		@Override
		public boolean isCellEditable( int row, int column ) {
			return column == 2;
		}

		@Override
		public void setValueAt( Object aValue, int row, int column ) {
			if ( aValue instanceof Boolean && column == 2 ) {
				System.out.println( aValue );
				Vector rowData = ( Vector ) getDataVector( ).get( row );
				rowData.set( 2, ( boolean ) aValue );
				fireTableCellUpdated( row, column );
			}
		}

	}

}