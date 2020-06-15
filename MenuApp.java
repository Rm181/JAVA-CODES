package com.menus;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JTextArea;

public class MenuApp extends JFrame implements ActionListener, WindowListener {

	JMenuBar mb;
	JMenu file, edit;
	JMenuItem newfile, open, save, saveas, exit, cut, copy, paste;
	JSeparator sep;
	JTextArea txt;

	public MenuApp() {
		mb = new JMenuBar();
		file = new JMenu("File");
		edit = new JMenu("Edit");
		newfile = new JMenuItem("New");
		open = new JMenuItem("Open");
		save = new JMenuItem("Save");
		saveas = new JMenuItem("Save As");
		cut = new JMenuItem("Cut");
		copy = new JMenuItem("Copy");
		paste = new JMenuItem("Paste");
		exit = new JMenuItem("Exit");
		txt = new JTextArea();
		sep = new JSeparator();
		setJMenuBar(mb);
		mb.add(file);
		mb.add(edit);
		file.add(newfile);
		file.add(open);
		file.add(sep);
		file.add(save);
		file.add(saveas);
		file.add(exit);
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		add(txt);
		open.addActionListener(this);
		saveas.addActionListener(this);
		newfile.addActionListener(this);
		this.addWindowListener(this);
	}

	public static void main(String[] args) {
		MenuApp ma = new MenuApp();
		ma.setSize(500, 600);
		ma.setVisible(true);
	}

	class MyDialog extends JDialog {

		JLabel lblmsg;
		JButton btnYes, btnNo, btnCancel;

		public MyDialog(Frame frame, boolean modal) {
			super(frame, modal);
			setLayout(new FlowLayout());
			lblmsg = new JLabel("Do you want to save before you exit?");
			btnYes = new JButton("Yes");
			btnNo = new JButton("No");
			btnCancel = new JButton("Cancel");
			add(lblmsg);
			add(btnYes);
			add(btnNo);
			add(btnCancel);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JFileChooser fc = new JFileChooser();
		if (e.getSource() == open) {
			fc.showOpenDialog(this);
		}

		if (e.getSource() == saveas) {
			fc.showSaveDialog(this);
		}

		JColorChooser cc = new JColorChooser();

		if (e.getSource() == newfile) {
			Color c = cc.showDialog(this, getTitle(), Color.YELLOW);
			txt.setForeground(c);
		}

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		MyDialog md = new MyDialog(this, true);
		md.setSize(200, 100);
		md.setVisible(true);
		

	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

}
