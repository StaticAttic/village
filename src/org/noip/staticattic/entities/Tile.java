package org.noip.staticattic.entities;

import javax.swing.ImageIcon;

public class Tile extends Inanimate {
	
	private Type type = Type.GRASS;
	private ImageIcon icon = new ImageIcon();
	
	public enum Type{
		
		GRASS, FLOWER, TREE, RIVER, SEA, SAND, SNOW, STONE, COBBLE, TILE, GRAVEL, CARPET, WOOD, FULL, DOOR
		
	}

	public Tile(int xloc, int yloc) {
		
		super(xloc, yloc);
		
	}
	
	public ImageIcon getIcon() {
		
		return icon;
		
	}

	public void setIcon(ImageIcon icon) {
		
		this.icon = icon;
		
	}

	public Type getType() {
		
		return type;
		
	}

	public void setType(Type type) {
		
		this.type = type;
		
	}

}