package org.noip.staticattic.entities;

import org.noip.staticattic.world.Environment;

public abstract class Human extends Entity {

	public enum AnimationState {
		
		IDLE, WALKING_UP, WALKING_LEFT, WALKING_RIGHT, WALKING_DOWN, RUNNING_UP, RUNNING_DOWN, RUNNING_LEFT, RUNNING_RIGHT, FISHING, SWINGING_NET
		
	}
	
	private AnimationState state = AnimationState.IDLE;
	private Environment currentenvironment;
	
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
	
}
