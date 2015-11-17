package swing;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EventHandlingAdapter extends JFrame {
	private static final long	serialVersionUID	= 6381888569965913982L;

	private JPanel				contentPane;
	private JLabel				nameLbl;
	private JTextField			nameTxt;
	private JButton				okBtn;
	private JLabel				statusTxt;

	/**
	 * Launch the application.
	 */
	public static void main( String[] args ) {
		EventQueue.invokeLater( new Runnable( ) { // EventQueue or SwingUtilities
			public void run( ) {
				try {
					EventHandlingAdapter frame = new EventHandlingAdapter( );
					frame.setVisible( true );
				} catch ( Exception e ) {
					e.printStackTrace( );
				}
			}
		} );
	}

	/**
	 * Create the frame.
	 */
	public EventHandlingAdapter( ) {
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setBounds( 100, 100, 450, 300 );
		contentPane = new JPanel( );
		setContentPane( contentPane );
		contentPane.setLayout( null );
		contentPane.add( getNameLbl( ) );
		contentPane.add( getNameTxt( ) );
		contentPane.add( getOkBtn( ) );
		contentPane.add( getStatusTxt( ) );
	}

	private JLabel getNameLbl( ) {
		if ( nameLbl == null ) {
			nameLbl = new JLabel( "Write Your Name:" );
			nameLbl.setForeground( Color.BLUE );
			nameLbl.setBounds( 32, 81, 105, 25 );
		}
		return nameLbl;
	}

	private JTextField getNameTxt( ) {
		if ( nameTxt == null ) {
			nameTxt = new JTextField( );
			nameTxt.setBounds( 136, 83, 129, 25 );
			nameTxt.addFocusListener( new FocusAdapter( ) {

				@Override
				public void focusLost( FocusEvent e ) {
					statusTxt.setText( "Focus Losted: " + nameTxt.getText( ) );
				}

			} );
		}
		return nameTxt;
	}

	private JButton getOkBtn( ) {
		if ( okBtn == null ) {
			okBtn = new JButton( "OK" );
			okBtn.setBounds( 300, 82, 89, 23 );
			okBtn.addActionListener( new ActionListener( ) {
				public void actionPerformed( ActionEvent e ) {
					JOptionPane.showMessageDialog( contentPane, "Your name is: " + nameTxt.getText( ) );
				}
			} );
		}
		return okBtn;
	}

	private JLabel getStatusTxt( ) {
		if ( statusTxt == null ) {
			statusTxt = new JLabel( );
			statusTxt.setEnabled( false );
			statusTxt.setBounds( 34, 231, 355, 20 );
		}
		return statusTxt;
	}
}
