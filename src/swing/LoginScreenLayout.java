package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridLayout;
import javax.swing.JPasswordField;

public class LoginScreenLayout extends JFrame {

	private JPanel		contentPane;
	private JPanel		panelTop;
	private JPanel		panelBottom;
	private JPanel		panelLeft;
	private JPanel		panelRight;
	private JPanel		panelCenter;
	private JLabel		lblUserName;
	private JTextField	username;
	private JLabel		lblPassword;
	private JPasswordField	password;
	private JButton		btnSignIn;
	private JButton		btnCancel;
	private JPanel		loginPanel;
	private JLabel status;

	/**
	 * Launch the application.
	 */
	public static void main( String[] args ) {
		EventQueue.invokeLater( new Runnable( ) {
			public void run( ) {
				try {
					LoginScreenLayout frame = new LoginScreenLayout( );
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
	public LoginScreenLayout( ) {
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setBounds( 100, 100, 499, 261 );
		contentPane = new JPanel( );
		contentPane.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
		setContentPane( contentPane );
		contentPane.setLayout( new BorderLayout( -2, -2 ) );
		contentPane.add( getPanel_1( ), BorderLayout.NORTH );
		contentPane.add( getPanel_1_1( ), BorderLayout.SOUTH );
		contentPane.add( getPanelLeft( ), BorderLayout.WEST );
		contentPane.add( getPanelRight( ), BorderLayout.EAST );
		contentPane.add( getPanelCenter( ), BorderLayout.CENTER );
	}

	private JPanel getPanel_1( ) {
		if ( panelTop == null ) {
			panelTop = new JPanel( );
			FlowLayout flowLayout = ( FlowLayout ) panelTop.getLayout( );
			flowLayout.setVgap( 10 );
			flowLayout.setHgap( 10 );
			panelTop.setBackground( UIManager.getColor( "activeCaption" ) );
			panelTop.setForeground( Color.BLACK );
			panelTop.setBorder( null );
		}
		return panelTop;
	}

	private JPanel getPanel_1_1( ) {
		if ( panelBottom == null ) {
			panelBottom = new JPanel( );
			FlowLayout flowLayout = ( FlowLayout ) panelBottom.getLayout( );
			flowLayout.setVgap( 10 );
			flowLayout.setHgap( 10 );
			panelBottom.setBackground( UIManager.getColor( "activeCaption" ) );
			panelBottom.setForeground( Color.BLACK );
		}
		return panelBottom;
	}

	private JPanel getPanelLeft( ) {
		if ( panelLeft == null ) {
			panelLeft = new JPanel( );
			FlowLayout flowLayout = ( FlowLayout ) panelLeft.getLayout( );
			flowLayout.setVgap( 10 );
			flowLayout.setHgap( 10 );
			panelLeft.setBackground( UIManager.getColor( "activeCaption" ) );
			panelLeft.setForeground( Color.BLACK );
		}
		return panelLeft;
	}

	private JPanel getPanelRight( ) {
		if ( panelRight == null ) {
			panelRight = new JPanel( );
			FlowLayout flowLayout = ( FlowLayout ) panelRight.getLayout( );
			flowLayout.setVgap( 10 );
			flowLayout.setHgap( 10 );
			panelRight.setBackground( UIManager.getColor( "activeCaption" ) );
			panelRight.setForeground( Color.BLACK );
		}
		return panelRight;
	}

	private JPanel getPanelCenter( ) {
		if ( panelCenter == null ) {
			panelCenter = new JPanel( );
			panelCenter.setBackground( new Color( 204, 255, 204 ) );
			panelCenter.setBorder( new EtchedBorder( EtchedBorder.LOWERED, null, null ) );
			panelCenter.setForeground( Color.BLACK );
			panelCenter.setLayout( new FormLayout(new ColumnSpec[] {
					FormFactory.RELATED_GAP_COLSPEC,
					ColumnSpec.decode("default:grow"),
					ColumnSpec.decode("6dlu"),
					FormFactory.DEFAULT_COLSPEC,
					FormFactory.RELATED_GAP_COLSPEC,
					FormFactory.DEFAULT_COLSPEC,
					FormFactory.RELATED_GAP_COLSPEC,
					FormFactory.DEFAULT_COLSPEC,
					FormFactory.RELATED_GAP_COLSPEC,
					ColumnSpec.decode("default:grow"),},
				new RowSpec[] {
					FormFactory.RELATED_GAP_ROWSPEC,
					RowSpec.decode("default:grow"),
					FormFactory.RELATED_GAP_ROWSPEC,
					FormFactory.DEFAULT_ROWSPEC,
					FormFactory.RELATED_GAP_ROWSPEC,
					FormFactory.DEFAULT_ROWSPEC,
					FormFactory.RELATED_GAP_ROWSPEC,
					FormFactory.DEFAULT_ROWSPEC,
					FormFactory.RELATED_GAP_ROWSPEC,
					FormFactory.DEFAULT_ROWSPEC,
					FormFactory.RELATED_GAP_ROWSPEC,
					FormFactory.DEFAULT_ROWSPEC,
					FormFactory.RELATED_GAP_ROWSPEC,
					FormFactory.DEFAULT_ROWSPEC,
					FormFactory.RELATED_GAP_ROWSPEC,
					FormFactory.DEFAULT_ROWSPEC,}) );
			panelCenter.add( getLoginPanel( ), "2, 2, 9, 8, fill, fill" );
			panelCenter.add(getStatus(), "8, 10, 3, 1");
			panelCenter.add( getBtnSignIn( ), "4, 14" );
			panelCenter.add( getBtnCancel( ), "10, 14" );
		}
		return panelCenter;
	}

	private JLabel getLblUserName( ) {
		if ( lblUserName == null ) {
			lblUserName = new JLabel( "User Name:" );
			lblUserName.setFont( new Font( "Tahoma", Font.BOLD, 13 ) );
		}
		return lblUserName;
	}

	private JTextField getUsername( ) {
		if ( username == null ) {
			username = new JTextField( );
			username.setSize( 250, 30 );
			username.setColumns( 10 );
		}
		return username;
	}

	private JLabel getLblPassword( ) {
		if ( lblPassword == null ) {
			lblPassword = new JLabel( "Password:" );
			lblPassword.setFont( new Font( "Tahoma", Font.BOLD, 13 ) );
		}
		return lblPassword;
	}

	private JPasswordField getPassword( ) {
		if ( password == null ) {
			password = new JPasswordField( );
			password.setColumns( 10 );
		}
		return password;
	}

	private JButton getBtnSignIn( ) {
		if ( btnSignIn == null ) {
			btnSignIn = new JButton( "Sign In" );
			btnSignIn.setFont( new Font( "Tahoma", Font.BOLD, 11 ) );
		}
		return btnSignIn;
	}

	private JButton getBtnCancel( ) {
		if ( btnCancel == null ) {
			btnCancel = new JButton( "Cancel" );
			btnCancel.addActionListener( new ActionListener( ) {
				@Override
				public void actionPerformed( ActionEvent e ) {
					System.exit( 0 );
				}
			} );
		}
		return btnCancel;
	}

	private JPanel getLoginPanel( ) {
		if ( loginPanel == null ) {
			loginPanel = new JPanel( );
			loginPanel.setBorder( new TitledBorder( UIManager.getBorder( "TitledBorder.border" ), "Login", TitledBorder.LEADING, TitledBorder.TOP, null, new Color( 0, 0, 0 ) ) );
			loginPanel.setLayout(new GridLayout(2, 3, 2, 2));
			loginPanel.add( getLblUserName( ) );
			loginPanel.add( getUsername( ) );
			loginPanel.add( getLblPassword( ) );
			loginPanel.add( getPassword( ) );
		}
		return loginPanel;
	}
	
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("Status:");
			status.setForeground(new Color(204, 0, 102));
			status.setFont(new Font("Tahoma", Font.BOLD, 11));
		}
		return status;
	}
}
