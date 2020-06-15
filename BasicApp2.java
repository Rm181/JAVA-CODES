package com.myapp;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class BasicApp2 extends JFrame implements ActionListener {

	JLabel lblUName, lblPass;
	JTextField txtName;
	JPasswordField txtPass;
	JButton btnSubmit, btnClear, btnClose;

	public BasicApp2() {
		lblUName = new JLabel("UserName");
		lblPass = new JLabel("Password");
		txtName = new JTextField(20);
		txtPass = new JPasswordField(20);
		btnSubmit = new JButton("Submit");
		btnClear = new JButton("Clear");
		btnClose = new JButton("Close");
		add(lblUName);
		add(txtName);
		add(lblPass);
		add(txtPass);
		add(btnSubmit);
		add(btnClear);
		add(btnClose);
		btnSubmit.addActionListener(this);
		btnClear.addActionListener(this);
		btnClose.addActionListener(this);

	}

	public static void main(String[] args) {
		BasicApp2 obj = new BasicApp2();
		obj.setSize(300, 250);
		obj.setVisible(true);
		obj.setTitle("My Second App");
		obj.setLayout(new FlowLayout());
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnSubmit) {
			System.out.println("Submit Button is clicked..");
		} else if (e.getSource() == btnClear) {
			txtName.setText("");
			txtPass.setText("");
		} else if (e.getSource() == btnClose) {
			this.dispose();
		}

	}

}
