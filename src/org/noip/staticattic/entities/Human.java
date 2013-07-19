package org.noip.staticattic.entities;

import javax.swing.ImageIcon;

import org.noip.staticattic.world.Environment;

public abstract class Human extends Entity {

	public enum AnimationState {
		
		IDLE, WALKING_UP, WALKING_LEFT, WALKING_RIGHT, WALKING_DOWN, RUNNING_UP, RUNNING_DOWN, RUNNING_LEFT, RUNNING_RIGHT, FISHING, SWINGING_NET
		
	}
	
	private AnimationState state = AnimationState.IDLE;
	private Environment currentenvironment;
	private ImageIcon icon;
	private String name;
	
	public void setAnimationState(AnimationState state) {
		
		this.state = state;
		
	}
	
	public AnimationState getAnimationState() { 
		
		return this.state;
		
	}
	
	public Environment getCurrentEnvironment() {
		
		return currentenvironment;
		
	}

	public void setCurrentEnvironment(Environment currentenvironment) {
		
		this.currentenvironment = currentenvironment;
		
	}

	public Human(int xloc, int yloc) {
		
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
