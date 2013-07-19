package org.noip.staticattic.GUI.Events;

import java.awt.Color;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import org.noip.staticattic.GUI.MainWindow;

public class ShowMenuScreen extends GUIEvent{

	public ShowMenuScreen(MainWindow main, int delay) {
		
		super(main, delay);
		
	}
	
	@Override
	public void execute() {
		
		super.getMain().mainpanel.removeAll();
		super.getMain().mainpanel.setBackground(Color.WHITE);
		
		JButton exit = new JButton();
		JButton start = new JButton();
		JButton options = new JButton();
		
		ImageIcon upstate = new ImageIcon();
		ImageIcon overstate = new ImageIcon();
		ImageIcon downstate = new ImageIcon();
		ImageIcon logo = new ImageIcon();
		
		try {
			
			upstate = new ImageIcon(ImageIO.read(super.getMain().getClass().getResource("/resources/img/GUI/defaultstate.fw.png")));
			overstate = new ImageIcon(ImageIO.read(super.getMain().getClass().getResource("/resources/img/GUI/overstate.fw.png")));
			downstate = new ImageIcon(ImageIO.read(super.getMain().getClass().getResource("/resources/img/GUI/downstate.fw.png")));
			logo = new ImageIcon(ImageIO.read(super.getMain().getClass().getResource("/resources/img/GUI/logo.fw.png")));
			
		} catch (Exception e) {
			
			try {
				
				upstate = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/button.fw.png")));
				overstate = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/buttonover.fw.png")));
				downstate = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/buttondown.fw.png")));
				logo = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/logo.fw.png")));
				
			} catch (Exception e1) {

				e1.printStackTrace();
				
			}
			
		}
		
		JLabel gamelogo = new JLabel(logo);
		gamelogo.setBounds((int)(super.getMain().screensize.getWidth()/2)-485, (int)(super.getMain().screensize.getHeight()/4)-65, 970, 130);
		
		exit.setIcon(upstate);
		exit.setPressedIcon(downstate);
		exit.setRolloverIcon(overstate);
		exit.setContentAreaFilled(false);
		exit.setBorderPainted(false);
		exit.setBounds((int)(super.getMain().screensize.getWidth()/2)-200, (int)(super.getMain().screensize.getHeight()/2)-30, 400, 60);
		exit.setActionCommand("exit");
		exit.addActionListener(super.getMain());
		
		super.getMain().mainpanel.add(exit);
		super.getMain().mainpanel.add(gamelogo);
		
		super.getMain().repaint();
		
	}

}
