package org.noip.staticattic.entities;

import java.util.UUID;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import org.noip.staticattic.location.Location;

public abstract class Entity {
	
	private Location location;
	private final UUID entityID;
	private ImageIcon icon = new ImageIcon();
	private JLabel label;

	public UUID getID() {
		
		return this.entityID;
		
	}
	
	public Location getLocation() {
		
		return this.location;
		
	}
	
	public Entity(int xloc, int yloc) {
		
		this.location = new Location(xloc, yloc);
		this.entityID = UUID.randomUUID();
		
	}

	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}

	public ImageIcon getIcon() {
		return icon;
	}

	public void setIcon(ImageIcon icon) {
		this.icon = icon;
	}

}
