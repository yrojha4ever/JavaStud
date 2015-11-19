package swing.proj;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

public class StudentMangement extends JFrame {

	private static final long	serialVersionUID	= -8360585084201808315L;
	private JPanel				contentPane;
	private JPanel				mainPanel;
	private JPanel				panel;
	private JLabel				nameLbl;
	private JTextField			nameTxt;
	private JLabel				lblRollNo;
	private JTextField			textField;
	private JLabel				lblSubject;
	private JTextField			textField_1;
	private JLabel				lblFaculty;
	private JTextField			textField_2;
	private JLabel				lblBirthDate;
	private JTextField			textField_3;
	private JLabel				lblCollegeName;
	private JTextField			textField_4;
	private JRadioButton		rdbtnNewRadioButton;
	private JRadioButton		rdbtnNewRadioButton_1;
	private JPanel				sexPanel;
	private JButton				btnSave;
	private JTable				studTable;
	private JLabel				lblUser;
	private JLabel			activeUser;
	private JButton				btnLogout;

	private JButton				btnExit;

	/**
	 * Launch the application.
	 */
	public static void main( String[] args ) {
		EventQueue.invokeLater( new Runnable( ) {
			public void run( ) {
				try {
					StudentMangement frame = new StudentMangement( );
					frame.setVisible( true );
				} catch ( Exception e ) {
					e.printStackTrace( );
				}
			}
		} );
	}

	public StudentMangement( String activeUser ) {
		this( );
		this.getActiveUser( ).setText( activeUser );
	}

	/**
	 * Create the frame.
	 */
	public StudentMangement( ) {
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setBounds( 100, 100, 771, 538 );
		contentPane = new JPanel( );
		contentPane.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
		setContentPane( contentPane );
		contentPane.setLayout( null );
		contentPane.add( getMainPanel( ) );
	}

	private JPanel getMainPanel( ) {
		if ( mainPanel == null ) {
			mainPanel = new JPanel( );
			mainPanel.setBounds( 0, 0, 753, 487 );
			mainPanel.setLayout( null );
			mainPanel.add( getPanel( ) );
			mainPanel.add( getStudTable( ) );
			mainPanel.add( getLblUser( ) );
			mainPanel.add( getActiveUser( ) );
			mainPanel.add( getBtnLogout( ) );
			mainPanel.add( getBtnExit( ) );
		}
		return mainPanel;
	}

	private JPanel getPanel( ) {
		if ( panel == null ) {
			panel = new JPanel( );
			panel.setBorder( new TitledBorder( UIManager.getBorder( "TitledBorder.border" ), "Student Form", TitledBorder.LEADING, TitledBorder.TOP, null, new Color( 0, 0, 0 ) ) );
			panel.setBounds( 10, 43, 723, 128 );
			panel.setLayout( null );
			panel.add( getNameLbl( ) );
			panel.add( getNameTxt( ) );
			panel.add( getLblRollNo( ) );
			panel.add( getTextField( ) );
			panel.add( getLblSubject( ) );
			panel.add( getTextField_1( ) );
			panel.add( getLblFaculty( ) );
			panel.add( getTextField_2( ) );
			panel.add( getLblBirthDate( ) );
			panel.add( getTextField_3( ) );
			panel.add( getLblCollegeName( ) );
			panel.add( getTextField_4( ) );
			panel.add( getSexPanel( ) );
			panel.add( getBtnSave( ) );
		}
		return panel;
	}

	private JLabel getNameLbl( ) {
		if ( nameLbl == null ) {
			nameLbl = new JLabel( "Name" );
			nameLbl.setBounds( 21, 22, 48, 14 );
		}
		return nameLbl;
	}

	private JTextField getNameTxt( ) {
		if ( nameTxt == null ) {
			nameTxt = new JTextField( );
			nameTxt.setBounds( 65, 22, 121, 20 );
			nameTxt.setColumns( 10 );
		}
		return nameTxt;
	}

	private JLabel getLblRollNo( ) {
		if ( lblRollNo == null ) {
			lblRollNo = new JLabel( "Roll No:" );
			lblRollNo.setBounds( 452, 22, 76, 14 );
		}
		return lblRollNo;
	}

	private JTextField getTextField( ) {
		if ( textField == null ) {
			textField = new JTextField( );
			textField.setBounds( 528, 19, 121, 20 );
			textField.setColumns( 10 );
		}
		return textField;
	}

	private JLabel getLblSubject( ) {
		if ( lblSubject == null ) {
			lblSubject = new JLabel( "Semester" );
			lblSubject.setBounds( 196, 51, 72, 14 );
		}
		return lblSubject;
	}

	private JTextField getTextField_1( ) {
		if ( textField_1 == null ) {
			textField_1 = new JTextField( );
			textField_1.setColumns( 10 );
			textField_1.setBounds( 65, 48, 121, 20 );
		}
		return textField_1;
	}

	private JLabel getLblFaculty( ) {
		if ( lblFaculty == null ) {
			lblFaculty = new JLabel( "Faculty" );
			lblFaculty.setBounds( 21, 47, 46, 14 );
		}
		return lblFaculty;
	}

	private JTextField getTextField_2( ) {
		if ( textField_2 == null ) {
			textField_2 = new JTextField( );
			textField_2.setColumns( 10 );
			textField_2.setBounds( 528, 45, 121, 20 );
		}
		return textField_2;
	}

	private JLabel getLblBirthDate( ) {
		if ( lblBirthDate == null ) {
			lblBirthDate = new JLabel( "Birth Date" );
			lblBirthDate.setBounds( 196, 22, 72, 14 );
		}
		return lblBirthDate;
	}

	private JTextField getTextField_3( ) {
		if ( textField_3 == null ) {
			textField_3 = new JTextField( );
			textField_3.setColumns( 10 );
			textField_3.setBounds( 278, 22, 121, 20 );
		}
		return textField_3;
	}

	private JLabel getLblCollegeName( ) {
		if ( lblCollegeName == null ) {
			lblCollegeName = new JLabel( "College Name" );
			lblCollegeName.setBounds( 419, 48, 109, 14 );
		}
		return lblCollegeName;
	}

	private JTextField getTextField_4( ) {
		if ( textField_4 == null ) {
			textField_4 = new JTextField( );
			textField_4.setColumns( 10 );
			textField_4.setBounds( 278, 48, 121, 20 );
		}
		return textField_4;
	}

	private JRadioButton getRdbtnNewRadioButton( ) {
		if ( rdbtnNewRadioButton == null ) {
			rdbtnNewRadioButton = new JRadioButton( "Male" );
			rdbtnNewRadioButton.setBounds( 6, 18, 54, 23 );
		}
		return rdbtnNewRadioButton;
	}

	private JRadioButton getRdbtnNewRadioButton_1( ) {
		if ( rdbtnNewRadioButton_1 == null ) {
			rdbtnNewRadioButton_1 = new JRadioButton( "Female" );
			rdbtnNewRadioButton_1.setBounds( 73, 18, 93, 23 );
		}
		return rdbtnNewRadioButton_1;
	}

	private JPanel getSexPanel( ) {
		if ( sexPanel == null ) {
			sexPanel = new JPanel( );
			sexPanel.setBorder( new TitledBorder( null, "Sex", TitledBorder.LEADING, TitledBorder.TOP, null, null ) );
			sexPanel.setBounds( 21, 72, 169, 48 );
			sexPanel.setLayout( null );
			sexPanel.add( getRdbtnNewRadioButton( ) );
			sexPanel.add( getRdbtnNewRadioButton_1( ) );
		}
		return sexPanel;
	}

	private JButton getBtnSave( ) {
		if ( btnSave == null ) {
			btnSave = new JButton( "Save" );
			btnSave.setBounds( 560, 79, 89, 23 );
		}
		return btnSave;
	}

	private JTable getStudTable( ) {
		if ( studTable == null ) {
			studTable = new JTable( );
			studTable.setBounds( 10, 214, 678, 195 );
		}
		return studTable;
	}

	private JLabel getLblUser( ) {
		if ( lblUser == null ) {
			lblUser = new JLabel( "Active User" );
			lblUser.setForeground( new Color( 0, 0, 128 ) );
			lblUser.setFont( new Font( "Tahoma", Font.BOLD, 11 ) );
			lblUser.setBounds( 430, 13, 76, 23 );
		}
		return lblUser;
	}

	private JLabel getActiveUser( ) {
		if ( activeUser == null ) {
			activeUser = new JLabel( );
			activeUser.setBackground(new Color(245, 245, 245));
			activeUser.setForeground(new Color(95, 158, 160));
			activeUser.setFont(new Font("Tahoma", Font.BOLD, 12));
			activeUser.setBounds( 511, 14, 111, 22 );
		}
		return activeUser;
	}

	private JButton getBtnLogout( ) {
		if ( btnLogout == null ) {
			btnLogout = new JButton( "" );
			btnLogout.setIcon( new ImageIcon( "resource/logout.png" ) );
			btnLogout.setBounds( 626, 5, 54, 37 );
			btnLogout.addActionListener( new ActionListener( ) {

				@Override
				public void actionPerformed( ActionEvent e ) {
					switchToLoginScreen( );
				}
			} );
		}
		return btnLogout;
	}

	private JButton getBtnExit( ) {
		if ( btnExit == null ) {
			btnExit = new JButton( "Exit" );
			btnExit.setFont( new Font( "Tahoma", Font.BOLD, 12 ) );
			btnExit.setForeground( new Color( 255, 0, 0 ) );
			btnExit.setBounds( 599, 446, 89, 30 );
			btnExit.addActionListener( new ActionListener( ) {

				@Override
				public void actionPerformed( ActionEvent e ) {
					WindowManager.ui.clear( );
					System.exit( 0 );
				}
			} );
		}
		return btnExit;
	}

	private void switchToLoginScreen( ) {
		LoginScreenLayout loginWindow = ( LoginScreenLayout ) WindowManager.ui.get( "LoginScreenLayout" );
		loginWindow.setVisible( true );

		StudentMangement studManagWindow = ( StudentMangement ) WindowManager.ui.get( "StudentMangement" );
		studManagWindow.dispose( );
	}

}
