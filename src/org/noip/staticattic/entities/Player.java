package org.noip.staticattic.entities;

import javax.swing.JLabel;

import org.noip.staticattic.GUI.Animation.AnimationEvent;
import org.noip.staticattic.fileutils.TextureHandler;

public class Player extends Human {

	public Player(int xloc, int yloc) {
		
		super(xloc, yloc);
		
		this.setAnimationEvent(new AnimationEvent(this));
		
		this.setIcon(TextureHandler.getPlayerDown());
		this.setLabel(new JLabel(this.getIcon()));
		this.getLabel().setBounds(this.getLocation().getX(), this.getLocation().getY(), 34, 44);
		
	}
	
}
