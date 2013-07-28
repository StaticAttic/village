package org.noip.staticattic.entities;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JLabel;

import org.noip.staticattic.GUI.Animation.AnimationEvent;

public class Player extends Human {
	
	private Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();

	public Player(int xloc, int yloc) {
		
		super(xloc, yloc);
		
		this.setAnimationEvent(new AnimationEvent(this));
		
		this.setLabel(new JLabel(this.getIcon()));
		this.getLabel().setBounds((int)(screensize.getWidth()/2)-17, (int)(screensize.getHeight()/2)-22, 34, 44);
		
	}
	
}
