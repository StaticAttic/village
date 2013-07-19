package org.noip.staticattic.GUI.Events;

import java.awt.Color;
import java.io.File;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import org.noip.staticattic.GUI.MainWindow;

public class ShowTitleScreen extends GUIEvent {

	public ShowTitleScreen(MainWindow main, int delay) {
		
		super(main, delay);
		
	}
	
	@Override
	public void execute() {
		
		super.getMain().mainpanel.setBackground(Color.BLACK);
		
		ImageIcon logo = new ImageIcon();
		AudioInputStream audioIn;
		Clip clip = null;
		
		try {
			
			logo = new ImageIcon(ImageIO.read(super.getMain().getClass().getResource("/resources/img/staticattic.fw.png")));
			audioIn = AudioSystem.getAudioInputStream(super.getMain().getClass().getResource("/resources/wav/startup.wav"));
			clip = AudioSystem.getClip();
			clip.open(audioIn);
			
		} catch (Exception e) {
			
			try {
				
				logo = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/staticattic.fw.png")));
				audioIn = AudioSystem.getAudioInputStream(new File(System.getProperty("user.home")+"/village/startup.wav"));
				clip = AudioSystem.getClip();
				clip.open(audioIn);
				
			} catch (Exception e1) {

				e1.printStackTrace();
				
			}
			
		}
		
		clip.start();
		
		JLabel companylogo = new JLabel(logo);
		companylogo.setBounds((int)(super.getMain().screensize.getWidth()/2)-250, (int)(super.getMain().screensize.getHeight()/2)-150, 500, 300);
		
		super.getMain().mainpanel.add(companylogo);
		super.getMain().repaint();
		
	}

}
