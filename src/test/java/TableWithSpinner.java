package test.java;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.JScrollPane;

public class TableWithSpinner {

	private JFrame				frame;
	private JTable				table;
	private DefaultTableModel	model;
	private JPanel				panel;
	private JScrollPane			scrollPane;
	private JSpinner			spinner;

	/**
	 * Launch the application.
	 */
	public static void main( String[] args ) {
		EventQueue.invokeLater( new Runnable( ) {
			public void run( ) {
				try {
					TableWithSpinner window = new TableWithSpinner( );
					window.frame.setVisible( true );
					// window.getTableModel( ).setColumnCount( 0 );
				} catch ( Exception e ) {
					e.printStackTrace( );
				}
			}
		} );
	}

	/**
	 * Create the application.
	 */
	public TableWithSpinner( ) {
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

	private JTable getTable( ) {
		if ( table == null ) {
			table = new JTable( getTableModel( ) );
		}
		return table;
	}

	private DefaultTableModel getTableModel( ) {
		if ( model == null ) {
			model = new DefaultTableModel( );
			model.setDataVector( new Object[][] { { "", "", "" } }, new Object[] { "ID", "NAME", "ADDRESS" } );
		}
		return model;
	}

	private JPanel getPanel( ) {
		if ( panel == null ) {
			panel = new JPanel( );
			panel.setBounds( 10, 11, 414, 240 );
			panel.setLayout( null );
			panel.add( getScrollPane( ) );
		}
		return panel;
	}

	private JScrollPane getScrollPane( ) {
		if ( scrollPane == null ) {
			scrollPane = new JScrollPane( );
			scrollPane.setBounds( 10, 11, 394, 218 );
			scrollPane.setViewportView( getTable( ) );
		}
		return scrollPane;
	}

	private JSpinner getSpinner( ) {
		if ( spinner == null ) {
			spinner = new JSpinner( );
			spinner.setBounds( 45, 28, 193, 77 );
		}
		return spinner;
	}

	class JSpinnerRenderer extends JSpinner implements TableCellRenderer {
		JSpinnerRenderer( ) {
			setOpaque( true );
		}

		@Override
		public Component getTableCellRendererComponent( JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column ) {
			return this;
		}

	}
}
