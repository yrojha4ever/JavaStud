package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Window.Type;

import javax.swing.JRadioButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;

public class SwingWindowsBuilderTest extends JFrame {

	private JPanel			contentPane;
	private JLabel			nameLabel;
	private JTextField		nameText;
	private JButton			btnOk;
	private JLabel			statusLabel;
	private JRadioButton	rdbtnMale;
	private JRadioButton	rdbtnFemale;
	private JPanel			panel;
	private JCheckBox chckbxAge;
	private JComboBox comboBox;
	private JPasswordField passwordField;
	private JSeparator separator;

	/**
	 * Launch the application.
	 */
	public static void main( String[] args ) {
		SwingUtilities.invokeLater( new Runnable( ) {
			public void run( ) {
				try {
					SwingWindowsBuilderTest frame = new SwingWindowsBuilderTest( );
					frame.setVisible( true );
				} catch ( Exception e ) {
					e.printStackTrace( );
				}
			}
		} );
		SwingWindowsBuilderTest frame = new SwingWindowsBuilderTest( );
		frame.setVisible( true );
	}

	/**
	 * Create the frame.
	 */
	public SwingWindowsBuilderTest( ) {
		setTitle( "JavaStud" );
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setBounds( 100, 100, 480, 340 );
		contentPane = new JPanel( );
		contentPane.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
		setContentPane( contentPane );
		contentPane.setLayout( null );
		contentPane.add( getNameLabel( ) );
		contentPane.add( getNameText( ) );
		contentPane.add( getBtnOk( ) );
		contentPane.add( getStatusLabel( ) );
		contentPane.add( getPanel( ) );
		contentPane.add(getChckbxAge());
		contentPane.add(getComboBox());
		contentPane.add(getPasswordField());
		contentPane.add(getSeparator());
		
		
	}

	private JLabel getNameLabel( ) {
		if ( nameLabel == null ) {
			nameLabel = new JLabel( "Write Your Name" );
			nameLabel.setForeground( Color.BLUE );
			nameLabel.setFont( new Font( "Tahoma", Font.BOLD, 12 ) );
			nameLabel.setBounds( 31, 62, 112, 34 );
		}
		return nameLabel;
	}

	private JTextField getNameText( ) {
		if ( nameText == null ) {
			nameText = new JTextField( );
			nameText.setBounds( 153, 70, 150, 20 );
			nameText.setColumns( 10 );
			nameText.addFocusListener( new FocusAdapter( ) {

				@Override
				public void focusLost( FocusEvent e ) {
					statusLabel.setText( "Focus Lost: " + nameText.getText( ) );
				}

				@Override
				public void focusGained( FocusEvent e ) {
					statusLabel.setText( "Focus Gained: " + nameText.getText( ) );
				}

			} );
		}
		return nameText;
	}

	private JButton getBtnOk( ) {
		if ( btnOk == null ) {
			btnOk = new JButton( "OK" );
			btnOk.setFont( new Font( "Tahoma", Font.BOLD, 11 ) );
			btnOk.setBounds( 309, 69, 89, 23 );
			btnOk.addActionListener( new ActionListener( ) {

				@Override
				public void actionPerformed( ActionEvent e ) {
					String msg = " Your Name is: " + nameText.getText( );
					JOptionPane.showMessageDialog( contentPane, msg );

				}
			} );
		}
		return btnOk;
	}

	private JLabel getStatusLabel( ) {
		if ( statusLabel == null ) {
			statusLabel = new JLabel( "Status:" );
			statusLabel.setBounds( 31, 252, 308, 23 );
		}
		return statusLabel;
	}

	private JRadioButton getRdbtnMale( ) {
		if ( rdbtnMale == null ) {
			rdbtnMale = new JRadioButton( "Male" );
			rdbtnMale.setBounds( 6, 20, 55, 23 );
		}
		return rdbtnMale;
	}

	private JRadioButton getRdbtnFemale( ) {
		if ( rdbtnFemale == null ) {
			rdbtnFemale = new JRadioButton( "Female" );
			rdbtnFemale.setBounds( 65, 20, 82, 23 );
		}
		return rdbtnFemale;
	}

	private JPanel getPanel( ) {
		if ( panel == null ) {
			panel = new JPanel( );
			panel.setBorder( new TitledBorder( null, "Sex", TitledBorder.LEADING, TitledBorder.TOP, null, null ) );
			panel.setBounds( 41, 107, 164, 50 );
			panel.setLayout( null );

			ButtonGroup sexGrp = new ButtonGroup( );
			sexGrp.add( getRdbtnMale( ) );
			sexGrp.add( getRdbtnFemale( ) );

			panel.add( getRdbtnMale( ) );
			panel.add( getRdbtnFemale( ) );
		}
		return panel;
	}
	private JCheckBox getChckbxAge() {
		if (chckbxAge == null) {
			chckbxAge = new JCheckBox("Age");
			chckbxAge.setBounds(41, 189, 64, 23);
		}
		return chckbxAge;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Age Group", "5-10", "10-20", "20-30", "30-60"}));
			comboBox.setBounds(138, 190, 150, 34);
		}
		return comboBox;
	}
	private JPasswordField getPasswordField() {
		if (passwordField == null) {
			passwordField = new JPasswordField();
			passwordField.setEchoChar('*');
			passwordField.setBounds(239, 107, 150, 34);
		}
		return passwordField;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(0, 102, 465, 4);
		}
		return separator;
	}
}
