package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class SwingComponets extends JFrame {

	private JPanel	contentPane;
	private JPanel mainPanel;
	private JPanel panel;
	private JLabel nameLbl;
	private JTextField nameTxt;
	private JLabel lblRollNo;
	private JTextField textField;
	private JLabel lblSubject;
	private JTextField textField_1;
	private JLabel lblFaculty;
	private JTextField textField_2;
	private JLabel lblBirthDate;
	private JTextField textField_3;
	private JLabel lblCollegeName;
	private JTextField textField_4;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JPanel sexPanel;
	private JButton btnSave;
	private JTable studTable;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main( String[] args ) {
		EventQueue.invokeLater( new Runnable( ) {
			public void run( ) {
				try {
					SwingComponets frame = new SwingComponets( );
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
	public SwingComponets( ) {
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setBounds( 100, 100, 714, 525 );
		contentPane = new JPanel( );
		contentPane.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
		setContentPane( contentPane );
		contentPane.setLayout(null);
		contentPane.add(getMainPanel());
	}
	private JPanel getMainPanel() {
		if (mainPanel == null) {
			mainPanel = new JPanel();
			mainPanel.setBounds(0, 0, 698, 487);
			mainPanel.setLayout(null);
			mainPanel.add(getPanel());
			mainPanel.add(getScrollPane());
		}
		return mainPanel;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Student Form", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBounds(10, 11, 678, 128);
			panel.setLayout(null);
			panel.add(getNameLbl());
			panel.add(getNameTxt());
			panel.add(getLblRollNo());
			panel.add(getTextField());
			panel.add(getLblSubject());
			panel.add(getTextField_1());
			panel.add(getLblFaculty());
			panel.add(getTextField_2());
			panel.add(getLblBirthDate());
			panel.add(getTextField_3());
			panel.add(getLblCollegeName());
			panel.add(getTextField_4());
			panel.add(getSexPanel());
			panel.add(getBtnSave());
		}
		return panel;
	}
	private JLabel getNameLbl() {
		if (nameLbl == null) {
			nameLbl = new JLabel("Name");
			nameLbl.setBounds(21, 22, 48, 14);
		}
		return nameLbl;
	}
	private JTextField getNameTxt() {
		if (nameTxt == null) {
			nameTxt = new JTextField();
			nameTxt.setBounds(65, 22, 121, 20);
			nameTxt.setColumns(10);
		}
		return nameTxt;
	}
	private JLabel getLblRollNo() {
		if (lblRollNo == null) {
			lblRollNo = new JLabel("Roll No:");
			lblRollNo.setBounds(430, 22, 46, 14);
		}
		return lblRollNo;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(486, 22, 121, 20);
			textField.setColumns(10);
		}
		return textField;
	}
	private JLabel getLblSubject() {
		if (lblSubject == null) {
			lblSubject = new JLabel("Semester");
			lblSubject.setBounds(208, 51, 48, 14);
		}
		return lblSubject;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(65, 48, 121, 20);
		}
		return textField_1;
	}
	private JLabel getLblFaculty() {
		if (lblFaculty == null) {
			lblFaculty = new JLabel("Faculty");
			lblFaculty.setBounds(21, 47, 46, 14);
		}
		return lblFaculty;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(486, 48, 121, 20);
		}
		return textField_2;
	}
	private JLabel getLblBirthDate() {
		if (lblBirthDate == null) {
			lblBirthDate = new JLabel("Birth Date");
			lblBirthDate.setBounds(208, 22, 48, 14);
		}
		return lblBirthDate;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(266, 22, 121, 20);
		}
		return textField_3;
	}
	private JLabel getLblCollegeName() {
		if (lblCollegeName == null) {
			lblCollegeName = new JLabel("College Name");
			lblCollegeName.setBounds(397, 48, 74, 14);
		}
		return lblCollegeName;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(266, 48, 121, 20);
		}
		return textField_4;
	}
	private JRadioButton getRdbtnNewRadioButton() {
		if (rdbtnNewRadioButton == null) {
			rdbtnNewRadioButton = new JRadioButton("Male");
			rdbtnNewRadioButton.setBounds(6, 18, 54, 23);
		}
		return rdbtnNewRadioButton;
	}
	private JRadioButton getRdbtnNewRadioButton_1() {
		if (rdbtnNewRadioButton_1 == null) {
			rdbtnNewRadioButton_1 = new JRadioButton("Female");
			rdbtnNewRadioButton_1.setBounds(62, 18, 64, 23);
		}
		return rdbtnNewRadioButton_1;
	}
	private JPanel getSexPanel() {
		if (sexPanel == null) {
			sexPanel = new JPanel();
			sexPanel.setBorder(new TitledBorder(null, "Sex", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			sexPanel.setBounds(21, 72, 164, 48);
			sexPanel.setLayout(null);
			sexPanel.add(getRdbtnNewRadioButton());
			sexPanel.add(getRdbtnNewRadioButton_1());
		}
		return sexPanel;
	}
	private JButton getBtnSave() {
		if (btnSave == null) {
			btnSave = new JButton("Save");
			btnSave.setBounds(496, 79, 89, 23);
		}
		return btnSave;
	}
	private JTable getStudTable() {
		if (studTable == null) {
			studTable = new JTable();
			studTable.setModel(new DefaultTableModel(
				new Object[][] {
					
				},
				new String[] {
					"ID", "NAME", "RollNo", "Faculty","Sex", "College Name"
				}
			));
		}
		return studTable;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 189, 678, 195);
			scrollPane.setViewportView(getStudTable());
		}
		return scrollPane;
	}
}
