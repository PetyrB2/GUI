package com.qa.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.management.monitor.MonitorSettingException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI implements ActionListener {

	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passLabel;
	private static JPasswordField passText;
	private static JButton button;
	private static JLabel success;
	private static JLabel notesLabel;
	
	
	public static void main(String[] args) {

		// beginnersbooks.com
		
		// Create our Window FRAME
		JFrame frame = new JFrame();
		// Set up our Editable PANEL in the Frame
		JPanel panel = new JPanel();
		// Setup our Window FRAME
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Add Panel
		frame.add(panel);
		
		
		panel.setLayout(null);
		
		// Create and set up user Label
		userLabel = new JLabel("Username");
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);
		
		// Create and set up Password Label
		passLabel = new JLabel("Password");
		passLabel.setBounds(10, 50, 80, 25);
		panel.add(passLabel);
		
		// Text Field & Password Field
		userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		passText = new JPasswordField(20);
		passText.setBounds(100, 50, 165, 25);
		panel.add(passText);
		
		// Set up Button
		button = new JButton("Login");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new GUI());
		panel.add(button);
		
		success = new JLabel("");
		success.setBounds(10, 110, 300, 25);
		
		panel.add(success);

		// Create and set up notes Label
		notesLabel = new JLabel("Hint: Admin, Password");
		notesLabel.setBounds(10, 130, 300, 25);
		panel.add(notesLabel);
		
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String user = userText.getText();
		String password = passText.getText();

		System.out.println(user + "," + password);
		
		if(user.equals("Admin") && password.equals("Password")) {
			success.setText("Login Successful !");
		}
		else {
			success.setText("Login FAILED !");
		}
		
	}
}
