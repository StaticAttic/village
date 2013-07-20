package org.noip.staticattic.fileutils;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;

public class AudioHandler {
	
	private static AudioInputStream startup;
	
	public static void LoadAllSounds() {
		
		try {
			
			startup = AudioSystem.getAudioInputStream(AudioHandler.class.getResource("/resources/wav/startup.wav"));
			
		} catch (Exception e) {
			
			try {
				
				startup = AudioSystem.getAudioInputStream(new File(System.getProperty("user.home")+"/village/startup.wav"));
				
			} catch (Exception e1) {

				e1.printStackTrace();
				
			}
			
		}
		
	}

	public static AudioInputStream getStartup() {
		
		return startup;
		
	}

}
