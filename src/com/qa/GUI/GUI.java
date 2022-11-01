package com.qa.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI implements ActionListener {

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
		JLabel userLabel = new JLabel("Username");
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);
		
		// Create and set up Password Label
		JLabel passLabel = new JLabel("Password");
		passLabel.setBounds(10, 50, 80, 25);
		panel.add(passLabel);
		
		// Text Field & Password Field
		JTextField userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		JPasswordField passText = new JPasswordField(20);
		passText.setBounds(100, 50, 165, 25);
		panel.add(passText);
		
		// Set up Button
		JButton button = new JButton("Login");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new GUI());
		panel.add(button);
		
		JLabel success = new JLabel("");
		success.setBounds(10, 110, 300, 25);
		
		panel.add(success);

		
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Push my Buttons");
	}
}
