package com.myapp;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class BasicSwingApp {

	JFrame f;
	JLabel lblUName, lblPass;
	JTextField txtName;
	JPasswordField txtPass;
	JButton btnSubmit, btnClear;

	public BasicSwingApp() {
		f = new JFrame("My First Swing App");
		f.setSize(300, 250);
		f.setVisible(true);
		f.setLayout(new FlowLayout());
		lblUName = new JLabel("UserName");
		lblPass = new JLabel("Password");
		txtName = new JTextField(20);
		txtPass = new JPasswordField(20);
		btnSubmit = new JButton("Submit");
		btnClear = new JButton("Clear");
		f.add(lblUName);
		f.add(txtName);
		f.add(lblPass);
		f.add(txtPass);
		f.add(btnSubmit);
		f.add(btnClear);

	}

	public static void main(String[] args) {

		new BasicSwingApp();

	}

}
