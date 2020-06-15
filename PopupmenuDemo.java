package com.menus;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class PopupmenuDemo extends JFrame implements MouseListener {

	JPopupMenu popmenu;
	JMenuItem Cut, Copy, Paste, Refresh;

	public PopupmenuDemo() {
		setSize(400, 500);
		setVisible(true);
		setLayout(new FlowLayout());
		popmenu = new JPopupMenu();
		Cut = new JMenuItem("Cut");
		Copy = new JMenuItem("Copy");
		Paste = new JMenuItem("Paste");
		Refresh = new JMenuItem("Refresh");
		popmenu.add(Cut);
		popmenu.add(Copy);
		popmenu.add(Paste);
		popmenu.add(Refresh);
		add(popmenu);
		this.addMouseListener(this);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if (e.isPopupTrigger()) {
			popmenu.show(e.getComponent(), e.getX(), e.getY());
		}

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		new PopupmenuDemo();
	}

}
