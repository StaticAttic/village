package org.noip.staticattic.entities;

import javax.swing.ImageIcon;

public class Player extends Human {
	
	private ImageIcon icon;
	private String name;

	public Player(int xloc, int yloc) {
		
		super(xloc, yloc);
		
	}

	public ImageIcon getIcon() {
		
		return icon;
		
	}

	public void setIcon(ImageIcon icon) {
		
		this.icon = icon;
		
	}

	public String getName() {
		
		return name;
		
	}

	public void setName(String name) {
		
		this.name = name;
		
	}
	
}
