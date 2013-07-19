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
		JButton newgame = new JButton();
		JButton cont = new JButton();
		JButton options = new JButton();
		
		ImageIcon newup = new ImageIcon();
		ImageIcon newover = new ImageIcon();
		ImageIcon newdown = new ImageIcon();
		ImageIcon contup = new ImageIcon();
		ImageIcon contover = new ImageIcon();
		ImageIcon contdown = new ImageIcon();
		ImageIcon optionsup = new ImageIcon();
		ImageIcon optionsover = new ImageIcon();
		ImageIcon optionsdown = new ImageIcon();
		ImageIcon exitup = new ImageIcon();
		ImageIcon exitover = new ImageIcon();
		ImageIcon exitdown = new ImageIcon();
		
		ImageIcon logo = new ImageIcon();
		
		try {
			
			newup = new ImageIcon(ImageIO.read(super.getMain().getClass().getResource("/resources/img/GUI/newgamedefault.fw.png")));
			newover = new ImageIcon(ImageIO.read(super.getMain().getClass().getResource("/resources/img/GUI/newgameover.fw.png")));
			newdown = new ImageIcon(ImageIO.read(super.getMain().getClass().getResource("/resources/img/GUI/newgamedown.fw.png")));
			contup = new ImageIcon(ImageIO.read(super.getMain().getClass().getResource("/resources/img/GUI/continuedefault.fw.png")));
			contover = new ImageIcon(ImageIO.read(super.getMain().getClass().getResource("/resources/img/GUI/continueover.fw.png")));
			contdown = new ImageIcon(ImageIO.read(super.getMain().getClass().getResource("/resources/img/GUI/continuedown.fw.png")));
			optionsup = new ImageIcon(ImageIO.read(super.getMain().getClass().getResource("/resources/img/GUI/optionsdefault.fw.png")));
			optionsover = new ImageIcon(ImageIO.read(super.getMain().getClass().getResource("/resources/img/GUI/optionsover.fw.png")));
			optionsdown = new ImageIcon(ImageIO.read(super.getMain().getClass().getResource("/resources/img/GUI/optionsdown.fw.png")));
			exitup = new ImageIcon(ImageIO.read(super.getMain().getClass().getResource("/resources/img/GUI/exitdefault.fw.png")));
			exitover = new ImageIcon(ImageIO.read(super.getMain().getClass().getResource("/resources/img/GUI/exitover.fw.png")));
			exitdown = new ImageIcon(ImageIO.read(super.getMain().getClass().getResource("/resources/img/GUI/exitdown.fw.png")));
			
			logo = new ImageIcon(ImageIO.read(super.getMain().getClass().getResource("/resources/img/GUI/logo.fw.png")));
			
		} catch (Exception e) {
			
			try {
				
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
				
			} catch (Exception e1) {

				e1.printStackTrace();
				
			}
			
		}
		
		JLabel gamelogo = new JLabel(logo);
		gamelogo.setBounds((int)(super.getMain().screensize.getWidth()/2)-485, (int)(super.getMain().screensize.getHeight()/4)-65, 970, 130);
		
		newgame.setIcon(newup);
		newgame.setPressedIcon(newdown);
		newgame.setRolloverIcon(newover);
		newgame.setContentAreaFilled(false);
		newgame.setBorderPainted(false);
		newgame.setBounds((int)(super.getMain().screensize.getWidth()/2)-200, gamelogo.getY()+gamelogo.getHeight()+60, 400, 60);
		newgame.setActionCommand("newgame");
		newgame.addActionListener(super.getMain());
		
		cont.setIcon(contup);
		cont.setPressedIcon(contdown);
		cont.setRolloverIcon(contover);
		cont.setContentAreaFilled(false);
		cont.setBorderPainted(false);
		cont.setBounds((int)(super.getMain().screensize.getWidth()/2)-200, newgame.getY()+90, 400, 60);
		cont.setActionCommand("continue");
		cont.addActionListener(super.getMain());
		
		options.setIcon(optionsup);
		options.setPressedIcon(optionsdown);
		options.setRolloverIcon(optionsover);
		options.setContentAreaFilled(false);
		options.setBorderPainted(false);
		options.setBounds((int)(super.getMain().screensize.getWidth()/2)-200, cont.getY()+90, 400, 60);
		options.setActionCommand("options");
		options.addActionListener(super.getMain());
		
		exit.setIcon(exitup);
		exit.setPressedIcon(exitdown);
		exit.setRolloverIcon(exitover);
		exit.setContentAreaFilled(false);
		exit.setBorderPainted(false);
		exit.setBounds((int)(super.getMain().screensize.getWidth()/2)-200, options.getY()+90, 400, 60);
		exit.setActionCommand("exit");
		exit.addActionListener(super.getMain());
		
		super.getMain().mainpanel.add(exit);
		super.getMain().mainpanel.add(gamelogo);
		super.getMain().mainpanel.add(options);
		super.getMain().mainpanel.add(newgame);
		super.getMain().mainpanel.add(cont);
		
		super.getMain().repaint();
		
	}

}
