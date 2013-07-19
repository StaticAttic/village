package org.noip.staticattic.GUI.Events;

import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import org.noip.staticattic.GUI.MainWindow;

public class ShowCharacterCreationScreen extends GUIEvent {
	
	public ShowCharacterCreationScreen(MainWindow main, int delay) {
		
		super(main, delay);
		
	}
	
	@Override
	public void execute() {
		
		super.getMain().mainpanel.removeAll();
		
		JButton cont = new JButton();
		
		ImageIcon contup = new ImageIcon();
		ImageIcon contover = new ImageIcon();
		ImageIcon contdown = new ImageIcon();
		
		try {
			
			contup = new ImageIcon(ImageIO.read(super.getMain().getClass().getResource("/resources/img/GUI/continuedefault.fw.png")));
			contover = new ImageIcon(ImageIO.read(super.getMain().getClass().getResource("/resources/img/GUI/continueover.fw.png")));
			contdown = new ImageIcon(ImageIO.read(super.getMain().getClass().getResource("/resources/img/GUI/continuedown.fw.png")));
			
		} catch (Exception e) {
			
			try {
				
				contup = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/continuedefault.fw.png")));
				contover = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/continueover.fw.png")));
				contdown = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/continuedown.fw.png")));
				
			} catch (Exception e1) {

				e1.printStackTrace();
				
			}
			
		}
		
		cont.setIcon(contup);
		cont.setPressedIcon(contdown);
		cont.setRolloverIcon(contover);
		cont.setContentAreaFilled(false);
		cont.setBorderPainted(false);
		cont.setBounds((int)(super.getMain().screensize.getWidth()/2)-200, (int)(super.getMain().screensize.getHeight()-(super.getMain().screensize.getHeight()/4)), 400, 60);
		cont.setActionCommand("createcharacter");
		cont.addActionListener(super.getMain());
		
		super.getMain().mainpanel.add(cont);
		
		super.getMain().repaint();
		
	}

}
