package org.noip.staticattic.GUI.Events;

import java.awt.Color;

import javax.swing.JButton;

import org.noip.staticattic.GUI.MainWindow;

public class ShowMenuScreen extends GUIEvent{

	public ShowMenuScreen(MainWindow main, int delay) {
		
		super(main, delay);
		
	}
	
	@Override
	public void execute() {
		
		super.getMain().mainpanel.setBackground(Color.WHITE);
		super.getMain().mainpanel.remove(0);
		
		JButton exit = new JButton("Exit");
		exit.setBounds((int)(super.getMain().screensize.getWidth()/2)-50, (int)(super.getMain().screensize.getHeight()/2)-15, 100, 30);
		exit.setActionCommand("exit");
		exit.addActionListener(super.getMain());
		
		super.getMain().mainpanel.add(exit);
		
		super.getMain().repaint();
		
	}

}
