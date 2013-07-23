package org.noip.staticattic.entities;

import java.util.UUID;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import org.noip.staticattic.GUI.Animation.AnimationEvent;
import org.noip.staticattic.location.Location;

public abstract class Entity {
	
	private Location location;
	private final UUID entityID;
	private AnimationEvent animationevent;
	private ImageIcon icon;
	private JLabel label;	
	
	public enum AnimationState {
		
		IDLE_LEFT, IDLE_RIGHT, IDLE_UP, IDLE_DOWN, WALKING_UP, WALKING_LEFT, WALKING_RIGHT, WALKING_DOWN, RUNNING_UP, RUNNING_DOWN, RUNNING_LEFT, RUNNING_RIGHT, FISHING, SWINGING_NET
		
	}
	
	private AnimationState state = AnimationState.IDLE_DOWN;

	public UUID getID() {
		
		return this.entityID;
		
	}
	
	public Location getLocation() {
		
		return this.location;
		
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

	public AnimationEvent getAnimationEvent() {
		
		return animationevent;
		
	}

	public void setAnimationEvent(AnimationEvent animationevent) {
		
		this.animationevent = animationevent;
		
	}

	public AnimationState getAnimationState() {
		
		return state;
		
	}

	public void setAnimationState(AnimationState state) {
		
		this.state = state;
		
	}	
	
	public Entity(int xloc, int yloc) {
		
		this.location = new Location(xloc, yloc);
		this.entityID = UUID.randomUUID();
		
	}
	
}
