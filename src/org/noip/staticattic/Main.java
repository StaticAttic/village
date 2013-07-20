package org.noip.staticattic;

import org.noip.staticattic.GUI.MainWindow;
import org.noip.staticattic.fileutils.TextureHandler;

public class Main {

	public static void main(String[] args) {
		
		TextureHandler.loadAllTextures();
		
		new MainWindow();
		
	}
	
}
