package org.noip.staticattic.entities;

import javax.swing.ImageIcon;

public class Tile extends Inanimate {
	
	public enum Type{
		
		GRASS, FLOWER, TREE, RIVER, SEA, SAND, SNOW, STONE, COBBLE, TILE, GRAVEL, CARPET, WOOD, FULL, DOOR
		
	}
	
	private ImageIcon icon = new ImageIcon();

	public Tile(int xloc, int yloc) {
		
		super(xloc, yloc);
		
	}
	
	public ImageIcon getIcon() {
		
		return icon;
		
	}

	public void setIcon(ImageIcon icon) {
		
		this.icon = icon;
	}
	
	

}