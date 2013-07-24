package org.noip.staticattic.entities;

import javax.swing.JLabel;

import org.noip.staticattic.GUI.Animation.AnimationEvent;

public class Player extends Human {

	public Player(int xloc, int yloc) {
		
		super(xloc, yloc);
		
		this.setAnimationEvent(new AnimationEvent(this));
		
		this.setLabel(new JLabel(this.getIcon()));
		this.getLabel().setBounds(this.getLocation().getX(), this.getLocation().getY(), 34, 44);
		
	}
	
}
