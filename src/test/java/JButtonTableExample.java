package test.java;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 * @version 1.0 11/09/98
 */
public class JButtonTableExample extends JFrame {

	public JButtonTableExample( ) {
		super( "JButtonTable Example" );

		DefaultTableModel dm = new DefaultTableModel( );
		dm.setDataVector( new Object[][] { { "button 1", "foo" }, { "button 2", "bar" } }, new Object[] { "Button", "String" } );

		// JTable table = new JTable( new Object[][] { { "button 1", "foo" }, { "button 2", "bar" } }, new Object[] { "Button", "String" } );
		JTable table = new JTable( dm );
		table.getColumn( "Button" ).setCellRenderer( new ButtonRenderer( ) );
		table.getColumn( "Button" ).setCellEditor( new ButtonEditor( new JCheckBox( ) ) );
		JScrollPane scroll = new JScrollPane( table );
		getContentPane( ).add( scroll );
		setSize( 400, 100 );
		setVisible( true );
	}

	public static void main( String[] args ) {

		JButtonTableExample frame = new JButtonTableExample( );
		frame.addWindowListener( new WindowAdapter( ) {
			public void windowClosing( WindowEvent e ) {
				System.exit( 0 );
			}
		} );
	}
}

/**
 * @version 1.0 11/09/98
 */

class ButtonRenderer extends JButton implements TableCellRenderer {

	public ButtonRenderer( ) {
		setOpaque( true );
	}

	public Component getTableCellRendererComponent( JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column ) {
		if ( isSelected ) {
			setForeground( table.getSelectionForeground( ) );
			setBackground( table.getSelectionBackground( ) );
		} else {
			setForeground( table.getForeground( ) );
			setBackground( UIManager.getColor( "Button.background" ) );
		}
		setText( ( value == null ) ? "" : value.toString( ) );
		return this;
	}
}

/**
 * @version 1.0 11/09/98
 */

class ButtonEditor extends DefaultCellEditor {
	protected JButton	button;

	private String		label;

	private boolean		isPushed;

	public ButtonEditor( JCheckBox checkBox ) {
		super( checkBox );
		button = new JButton( );
		button.setOpaque( true );
		button.addActionListener( new ActionListener( ) {
			public void actionPerformed( ActionEvent e ) {
				fireEditingStopped( );
			}
		} );
	}

	public Component getTableCellEditorComponent( JTable table, Object value, boolean isSelected, int row, int column ) {
		if ( isSelected ) {
			button.setForeground( table.getSelectionForeground( ) );
			button.setBackground( table.getSelectionBackground( ) );
		} else {
			button.setForeground( table.getForeground( ) );
			button.setBackground( table.getBackground( ) );
		}
		label = ( value == null ) ? "" : value.toString( );
		button.setText( label );
		isPushed = true;
		return button;
	}

	public Object getCellEditorValue( ) {
		if ( isPushed ) {
			//
			//
			JOptionPane.showMessageDialog( button, label + ": Ouch!" );
			// System.out.println(label + ": Ouch!");
		}
		isPushed = false;
		return new String( label );
	}

	public boolean stopCellEditing( ) {
		isPushed = false;
		return super.stopCellEditing( );
	}

	protected void fireEditingStopped( ) {
		super.fireEditingStopped( );
	}
}
