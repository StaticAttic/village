package org.noip.staticattic.GUI.Events;

import javax.swing.JButton;
import javax.swing.JCheckBox;

import org.noip.staticattic.GUI.MainWindow;
import org.noip.staticattic.fileutils.TextureHandler;

public class ShowCharacterCreationScreen extends GUIEvent {
	
	public ShowCharacterCreationScreen(MainWindow main, int delay) {
		
		super(main, delay);
		
	}
	
	@Override
	public void execute() {
		
		super.getMain().mainpanel.removeAll();
		
		JButton cont = new JButton();
		
		JCheckBox male = new JCheckBox();
		JCheckBox female = new JCheckBox();
		
		male.setIcon(TextureHandler.getMPlayerSelectionUp());
		male.setSelectedIcon(TextureHandler.getMPlayerSelectionOver());
		male.setContentAreaFilled(false);
		male.setBorderPainted(false);
		male.setBounds((int)(super.getMain().screensize.getWidth()/3)-190, (int)(super.getMain().screensize.getHeight()/3)-230, 380, 480);
		male.setActionCommand("selectmale");
		male.addActionListener(super.getMain());
		
		female.setIcon(TextureHandler.getFPlayerSelectionUp());
		female.setSelectedIcon(TextureHandler.getFPlayerSelectionOver());
		female.setContentAreaFilled(false);
		female.setBorderPainted(false);
		female.setBounds((int)(super.getMain().screensize.getWidth()-(super.getMain().screensize.getWidth()/3))-190, (int)(super.getMain().screensize.getHeight()/3)-230, 380, 480);
		female.setActionCommand("selectfemale");
		female.addActionListener(super.getMain());
		
		cont.setIcon(TextureHandler.getContUp());
		cont.setPressedIcon(TextureHandler.getContDown());
		cont.setRolloverIcon(TextureHandler.getContOver());
		cont.setContentAreaFilled(false);
		cont.setBorderPainted(false);
		cont.setBounds((int)(super.getMain().screensize.getWidth()/2)-200, (int)(super.getMain().screensize.getHeight()-(super.getMain().screensize.getHeight()/4)), 400, 60);
		cont.setActionCommand("createcharacter");
		cont.addActionListener(super.getMain());
		
		super.getMain().mainpanel.add(cont);
		super.getMain().mainpanel.add(male);
		super.getMain().mainpanel.add(female);
		
		super.getMain().repaint();
		
	}

}
