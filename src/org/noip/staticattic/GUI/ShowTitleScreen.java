package org.noip.staticattic.GUI;

import java.awt.Color;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ShowTitleScreen extends GUIEvent {

	public ShowTitleScreen(MainWindow main, int delay) {
		
		super(main, delay);
		
	}
	
	@Override
	public void execute() {
		
		super.getMain().mainpanel.setBackground(Color.BLACK);
		
		ImageIcon logo = new ImageIcon();
		
		try {
			
			logo = new ImageIcon(ImageIO.read(super.getMain().getClass().getResource("/resources/img/staticattic.fw.png")));
			
		} catch (Exception e) {
			
			try {
				
				logo = new ImageIcon(ImageIO.read(new File("C:/Users/Ollie/Pictures/staticattic.fw.png")));
				
			} catch (IOException e1) {

				e1.printStackTrace();
				
			}
			
		}
		
		JLabel companylogo = new JLabel(logo);
		companylogo.setBounds((int)(super.getMain().screensize.getWidth()/2)-250, (int)(super.getMain().screensize.getHeight()/2)-150, 500, 300);
		
		super.getMain().mainpanel.add(companylogo);
		super.getMain().repaint();
		
	}

}
