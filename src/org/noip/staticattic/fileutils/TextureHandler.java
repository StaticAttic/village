package org.noip.staticattic.fileutils;

import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class TextureHandler {
	
	private static ImageIcon grass = new ImageIcon();
	private static ImageIcon player = new ImageIcon();
	private static ImageIcon logo = new ImageIcon();
	private static ImageIcon icon = new ImageIcon();
	private static ImageIcon companylogo = new ImageIcon();
	private static ImageIcon newup = new ImageIcon();
	private static ImageIcon newover = new ImageIcon();
	private static ImageIcon newdown = new ImageIcon();
	private static ImageIcon contup = new ImageIcon();
	private static ImageIcon contover = new ImageIcon();
	private static ImageIcon contdown = new ImageIcon();
	private static ImageIcon optionsup = new ImageIcon();
	private static ImageIcon optionsover = new ImageIcon();
	private static ImageIcon optionsdown = new ImageIcon();
	private static ImageIcon exitup = new ImageIcon();
	private static ImageIcon exitover = new ImageIcon();
	private static ImageIcon exitdown = new ImageIcon();
	
	public static void loadAllTextures() {
		
		try {
		    
			grass = new ImageIcon(ImageIO.read(TextureHandler.class.getResource("/resources/img/tiles/grass.fw.png")));
			player = new ImageIcon(ImageIO.read(TextureHandler.class.getResource("/resources/img/dude.png")));
			companylogo = new ImageIcon(ImageIO.read(TextureHandler.class.getResource("/resources/img/staticattic.fw.png")));
			newup = new ImageIcon(ImageIO.read(TextureHandler.class.getResource("/resources/img/GUI/newgamedefault.fw.png")));
			newover = new ImageIcon(ImageIO.read(TextureHandler.class.getResource("/resources/img/GUI/newgameover.fw.png")));
			newdown = new ImageIcon(ImageIO.read(TextureHandler.class.getResource("/resources/img/GUI/newgamedown.fw.png")));
			contup = new ImageIcon(ImageIO.read(TextureHandler.class.getResource("/resources/img/GUI/continuedefault.fw.png")));
			contover = new ImageIcon(ImageIO.read(TextureHandler.class.getResource("/resources/img/GUI/continueover.fw.png")));
			contdown = new ImageIcon(ImageIO.read(TextureHandler.class.getResource("/resources/img/GUI/continuedown.fw.png")));
			optionsup = new ImageIcon(ImageIO.read(TextureHandler.class.getResource("/resources/img/GUI/optionsdefault.fw.png")));
			optionsover = new ImageIcon(ImageIO.read(TextureHandler.class.getResource("/resources/img/GUI/optionsover.fw.png")));
			optionsdown = new ImageIcon(ImageIO.read(TextureHandler.class.getResource("/resources/img/GUI/optionsdown.fw.png")));
			exitup = new ImageIcon(ImageIO.read(TextureHandler.class.getResource("/resources/img/GUI/exitdefault.fw.png")));
			exitover = new ImageIcon(ImageIO.read(TextureHandler.class.getResource("/resources/img/GUI/exitover.fw.png")));
			exitdown = new ImageIcon(ImageIO.read(TextureHandler.class.getResource("/resources/img/GUI/exitdown.fw.png")));
			logo = new ImageIcon(ImageIO.read(TextureHandler.class.getResource("/resources/img/GUI/logo.fw.png")));
			icon = new ImageIcon(ImageIO.read(TextureHandler.class.getResource("/resources/img/icon.png")));
		    
		} catch (Exception e1) {
		    
			try {
		     
				grass = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/grass.fw.png")));
				player = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/dude.png")));
				companylogo = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/staticattic.fw.png")));
				newup = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/newgamedefault.fw.png")));
				newover = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/newgameover.fw.png")));
				newdown = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/newgamedown.fw.png")));
				contup = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/continuedefault.fw.png")));
				contover = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/continueover.fw.png")));
				contdown = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/continuedown.fw.png")));
				optionsup = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/optionsdefault.fw.png")));
				optionsover = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/optionsover.fw.png")));
				optionsdown = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/optionsdown.fw.png")));
				exitup = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/exitdefault.fw.png")));
				exitover = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/exitover.fw.png")));
				exitdown = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/exitdown.fw.png")));
				logo = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/logo.fw.png")));
				icon = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/icon.png")));
		     
		    } catch (Exception e2) {
		     
		         e2.printStackTrace();
		     
		    }
		    
        }
		
	}

	public static ImageIcon getGrass() {
		
		return grass;
		
	}
		
	public static ImageIcon getPlayer() {
		
		return player;
		
	}

	public static ImageIcon getLogo() {
		
		return logo;
		
	}

	public static ImageIcon getIcon() {
		
		return icon;
		
	}

	public static ImageIcon getCompanyLogo() {
		
		return companylogo;
		
	}

	public static ImageIcon getNewUp() {
		
		return newup;
		
	}

	public static ImageIcon getNewOver() {
		
		return newover;
		
	}

	public static ImageIcon getNewDown() {
		
		return newdown;
		
	}

	public static ImageIcon getContUp() {
		
		return contup;
		
	}

	public static ImageIcon getContOver() {
		
		return contover;
		
	}

	public static ImageIcon getContDown() {
		
		return contdown;
		
	}

	public static ImageIcon getOptionsUp() {
		
		return optionsup;
		
	}

	public static ImageIcon getOptionsOver() {
		
		return optionsover;
		
	}

	public static ImageIcon getOptionsDown() {
		
		return optionsdown;
		
	}

	public static ImageIcon getExitUp() {
		
		return exitup;
		
	}

	public static ImageIcon getExitOver() {
		
		return exitover;
		
	}

	public static ImageIcon getExitDown() {
		
		return exitdown;
		
	}
	
}
