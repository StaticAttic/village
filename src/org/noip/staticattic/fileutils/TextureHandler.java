package org.noip.staticattic.fileutils;

import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class TextureHandler {
	
	private static ImageIcon grass = new ImageIcon();
	private static ImageIcon mplayerdown = new ImageIcon();
	private static ImageIcon fplayerdown = new ImageIcon();
	private static ImageIcon mplayerleft = new ImageIcon();
	private static ImageIcon mplayerright = new ImageIcon();
	private static ImageIcon mplayerup = new ImageIcon();
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
	private static ImageIcon mplayerdown2 = new ImageIcon();
	private static ImageIcon mplayerdown3 = new ImageIcon();
	private static ImageIcon mplayerleft2 = new ImageIcon();
	private static ImageIcon mplayerleft3 = new ImageIcon();
	private static ImageIcon mplayerright2 = new ImageIcon();
	private static ImageIcon mplayerright3 = new ImageIcon();
	private static ImageIcon mplayerup2 = new ImageIcon();
	private static ImageIcon mplayerup3 = new ImageIcon();
	private static ImageIcon mplayerselectionup = new ImageIcon();
	private static ImageIcon mplayerselectionover = new ImageIcon();
	private static ImageIcon fplayerselectionup = new ImageIcon();
	private static ImageIcon fplayerselectionover = new ImageIcon();
	
	public static void loadAllTextures() {
		
		try {
		    
			grass = new ImageIcon(ImageIO.read(TextureHandler.class.getResource("/resources/img/tiles/grass.fw.png")));
			mplayerdown = new ImageIcon(ImageIO.read(TextureHandler.class.getResource("/resources/img/dude.png")));
			mplayerleft = new ImageIcon(ImageIO.read(TextureHandler.class.getResource("/resources/img/dudeleft.fw.png")));
			mplayerright = new ImageIcon(ImageIO.read(TextureHandler.class.getResource("/resources/img/duderight.fw.png")));
			mplayerup = new ImageIcon(ImageIO.read(TextureHandler.class.getResource("/resources/img/dudeback.fw.png")));
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
			mplayerdown2 = new ImageIcon(ImageIO.read(TextureHandler.class.getResource("/resources/img/dude2.png")));
			mplayerdown3 = new ImageIcon(ImageIO.read(TextureHandler.class.getResource("/resources/img/dude3.png")));
			mplayerleft2 = new ImageIcon(ImageIO.read(TextureHandler.class.getResource("/resources/img/dudeleft2.png")));
			mplayerleft3 = new ImageIcon(ImageIO.read(TextureHandler.class.getResource("/resources/img/dudeleft3.png")));
			mplayerright2 = new ImageIcon(ImageIO.read(TextureHandler.class.getResource("/resources/img/duderight2.png")));
			mplayerright3 = new ImageIcon(ImageIO.read(TextureHandler.class.getResource("/resources/img/duderight3.png")));
			mplayerup2 = new ImageIcon(ImageIO.read(TextureHandler.class.getResource("/resources/img/dudeback2.png")));
			mplayerup3 = new ImageIcon(ImageIO.read(TextureHandler.class.getResource("/resources/img/dudeback3.png")));
			mplayerselectionup = new ImageIcon(ImageIO.read(TextureHandler.class.getResource("/resources/img/GUI/dudeselectionup.fw.png")));
			mplayerselectionover = new ImageIcon(ImageIO.read(TextureHandler.class.getResource("/resources/img/GUI/dudeselectionover.fw.png")));
			fplayerselectionup = new ImageIcon(ImageIO.read(TextureHandler.class.getResource("/resources/img/dudetteselectionup.fw.png")));
			fplayerselectionover = new ImageIcon(ImageIO.read(TextureHandler.class.getResource("/resources/img/dudetteselectionover.fw.png")));
		    
		} catch (Exception e1) {
		    
			try {
		     
				grass = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/grass.fw.png")));
				mplayerdown = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/dude.png")));
				fplayerdown = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/dudette.png")));
				mplayerleft = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/dudeleft.fw.png")));
				mplayerright = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/duderight.fw.png")));
				mplayerup = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/dudeback.fw.png")));
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
				mplayerdown2 = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/dude2.png")));
				mplayerdown3 = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/dude3.png")));
				mplayerleft2 = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/dudeleft2.png")));
				mplayerleft3 = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/dudeleft3.png")));
				mplayerright2 = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/duderight2.png")));
				mplayerright3 = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/duderight3.png")));
				mplayerup2 = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/dudeback2.png")));
				mplayerup3 = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/dudeback3.png")));
				mplayerselectionup = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/dudeselectionup.fw.png")));
				mplayerselectionover = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/dudeselectionover.fw.png")));
				fplayerselectionup = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/dudetteselectionup.fw.png")));
				fplayerselectionover = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/dudetteselectionover.fw.png")));
		     
		    } catch (Exception e2) {
		     
		         e2.printStackTrace();
		     
		    }
		    
        }
		
	}

	public static ImageIcon getGrass() {
		
		return grass;
		
	}
		
	public static ImageIcon getMPlayerDown() {
		
		return mplayerdown;
		
	}
	
	public static ImageIcon getFPlayerDown() {
		
		return fplayerdown;
		
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

	public static ImageIcon getMPlayerLeft() {
		
		return mplayerleft;
		
	}

	public static ImageIcon getMPlayerRight() {
		
		return mplayerright;
		
	}

	public static ImageIcon getMPlayerUp() {
		
		return mplayerup;
		
	}

	public static ImageIcon getMPlayerDown2() {
		
		return mplayerdown2;
		
	}

	public static ImageIcon getMPlayerDown3() {
		
		return mplayerdown3;
		
	}

	public static ImageIcon getMPlayerLeft2() {
		
		return mplayerleft2;
		
	}

	public static ImageIcon getMPlayerLeft3() {
		
		return mplayerleft3;
		
	}

	public static ImageIcon getMPlayerRight2() {
		
		return mplayerright2;
		
	}

	public static ImageIcon getMPlayerRight3() {
		
		return mplayerright3;
		
	}

	public static ImageIcon getMPlayerUp2() {
		
		return mplayerup2;
		
	}

	public static ImageIcon getMPlayerUp3() {
		
		return mplayerup3;
		
	}

	public static ImageIcon getMPlayerSelectionUp() {
		
		return mplayerselectionup;

	}

	public static ImageIcon getMPlayerSelectionOver() {
		
		return mplayerselectionover;
		
	}

	public static ImageIcon getFPlayerSelectionUp() {
		
		return fplayerselectionup;
		
	}

	public static ImageIcon getFPlayerSelectionOver() {
		
		return fplayerselectionover;
		
	}

}
