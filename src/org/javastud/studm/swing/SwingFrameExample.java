package org.javastud.studm.swing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SwingFrameExample {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		//Add Button
		JButton button = new JButton("Click");
		button.setLocation(130, 100);
		button.setSize(100, 40);
		f.getContentPane().add(button);
		
		/*ActionListener actList = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "First Java Swing Program!");
			}
		};*/
		
		
		
		//Add Label and Text Field
		JLabel nameLbl = new JLabel();
		nameLbl.setText("Name: ");
		nameLbl.setForeground(Color.BLUE);
		nameLbl.setBounds(130, 200, 60, 40);
		f.getContentPane().add(nameLbl);
		
		final JTextField nameTxt = new JTextField();
		nameTxt.setBounds(200, 200, 150, 40);
		f.add(nameTxt);
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "First Java Swing Program of: " + nameTxt.getText() );
			}
		});
		
		
		f.setSize(400, 500);
		f.setLayout(null); //Absolot layout
		
		f.setVisible(true);
		
		
	}
}
