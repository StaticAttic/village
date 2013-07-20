package org.noip.staticattic.GUI.Events;

import java.awt.Color;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JLabel;

import org.noip.staticattic.GUI.MainWindow;
import org.noip.staticattic.fileutils.TextureHandler;

public class ShowTitleScreen extends GUIEvent {

	public ShowTitleScreen(MainWindow main, int delay) {
		
		super(main, delay);
		
	}
	
	@Override
	public void execute() {
		
		super.getMain().mainpanel.setBackground(Color.BLACK);
		
		AudioInputStream audioIn;
		Clip clip = null;
		
		try {
			
			audioIn = AudioSystem.getAudioInputStream(super.getMain().getClass().getResource("/resources/wav/startup.wav"));
			clip = AudioSystem.getClip();
			clip.open(audioIn);
			
		} catch (Exception e) {
			
			try {
				
				audioIn = AudioSystem.getAudioInputStream(new File(System.getProperty("user.home")+"/village/startup.wav"));
				clip = AudioSystem.getClip();
				clip.open(audioIn);
				
			} catch (Exception e1) {

				e1.printStackTrace();
				
			}
			
		}
		
		clip.start();
		
		JLabel companylogo = new JLabel(TextureHandler.getCompanyLogo());
		companylogo.setBounds((int)(super.getMain().screensize.getWidth()/2)-250, (int)(super.getMain().screensize.getHeight()/2)-150, 500, 300);
		
		super.getMain().mainpanel.add(companylogo);
		super.getMain().repaint();
		
	}

}
