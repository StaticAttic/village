package org.noip.staticattic.fileutils;

import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class TextureHandler {
	
	private static ImageIcon grass = new ImageIcon();
	private static ImageIcon playerdown = new ImageIcon();
	private static ImageIcon playerleft = new ImageIcon();
	private static ImageIcon playerright = new ImageIcon();
	private static ImageIcon playerup = new ImageIcon();
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
	private static ImageIcon playerdown2 = new ImageIcon();
	private static ImageIcon playerdown3 = new ImageIcon();
	private static ImageIcon playerleft2 = new ImageIcon();
	private static ImageIcon playerleft3 = new ImageIcon();
	private static ImageIcon playerright2 = new ImageIcon();
	private static ImageIcon playerright3 = new ImageIcon();
	private static ImageIcon playerup2 = new ImageIcon();
	private static ImageIcon playerup3 = new ImageIcon();
	
	public static void loadAllTextures() {
		
		try {
		    
			grass = new ImageIcon(ImageIO.read(TextureHandler.class.getResource("/resources/img/tiles/grass.fw.png")));
			playerdown = new ImageIcon(ImageIO.read(TextureHandler.class.getResource("/resources/img/dude.png")));
			playerleft = new ImageIcon(ImageIO.read(TextureHandler.class.getResource("/resources/img/dudeleft.fw.png")));
			playerright = new ImageIcon(ImageIO.read(TextureHandler.class.getResource("/resources/img/duderight.fw.png")));
			playerup = new ImageIcon(ImageIO.read(TextureHandler.class.getResource("/resources/img/dudeback.fw.png")));
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
				playerdown = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/dude.png")));
				playerleft = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/dudeleft.fw.png")));
				playerright = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/duderight.fw.png")));
				playerup = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/dudeback.fw.png")));
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
				playerdown2 = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/dude2.png")));
				playerdown3 = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/dude3.png")));
				playerleft2 = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/dudeleft2.png")));
				playerleft3 = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/dudeleft3.png")));
				playerright2 = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/duderight2.png")));
				playerright3 = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/duderight3.png")));
				playerup2 = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/dudeback2.png")));
				playerup3 = new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/dudeback3.png")));
		     
		    } catch (Exception e2) {
		     
		         e2.printStackTrace();
		     
		    }
		    
        }
		
	}

	public static ImageIcon getGrass() {
		
		return grass;
		
	}
		
	public static ImageIcon getPlayerDown() {
		
		return playerdown;
		
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

	public static ImageIcon getPlayerLeft() {
		
		return playerleft;
		
	}

	public static ImageIcon getPlayerRight() {
		
		return playerright;
		
	}

	public static ImageIcon getPlayerUp() {
		
		return playerup;
		
	}

	public static ImageIcon getPlayerDown2() {
		
		return playerdown2;
		
	}

	public static void setPlayerDown2(ImageIcon playerdown2) {
		
		TextureHandler.playerdown2 = playerdown2;
		
	}

	public static ImageIcon getPlayerDown3() {
		
		return playerdown3;
		
	}

	public static void setPlayerDown3(ImageIcon playerdown3) {
		
		TextureHandler.playerdown3 = playerdown3;
		
	}

	public static ImageIcon getPlayerLeft2() {
		
		return playerleft2;
		
	}

	public static void setPlayerLeft2(ImageIcon playerleft2) {
		
		TextureHandler.playerleft2 = playerleft2;
		
	}

	public static ImageIcon getPlayerLeft3() {
		
		return playerleft3;
		
	}

	public static void setPlayerLeft3(ImageIcon playerleft3) {
		
		TextureHandler.playerleft3 = playerleft3;
		
	}

	public static ImageIcon getPlayerRight2() {
		
		return playerright2;
		
	}

	public static void setPlayerRight2(ImageIcon playerright2) {
		
		TextureHandler.playerright2 = playerright2;
		
	}

	public static ImageIcon getPlayerRight3() {
		
		return playerright3;
		
	}

	public static void setPlayerRight3(ImageIcon playerright3) {
		
		TextureHandler.playerright3 = playerright3;
		
	}

	public static ImageIcon getPlayerUp2() {
		
		return playerup2;
		
	}

	public static void setPlayerUp2(ImageIcon playerup2) {
		
		TextureHandler.playerup2 = playerup2;
		
	}

	public static ImageIcon getPlayerUp3() {
		
		return playerup3;
		
	}

	public static void setPlayerUp3(ImageIcon playerup3) {
		
		TextureHandler.playerup3 = playerup3;
		
	}	
}
