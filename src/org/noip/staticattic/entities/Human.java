package org.noip.staticattic.entities;

import org.noip.staticattic.world.Environment;

public abstract class Human extends Entity {

	public enum AnimationState {
		
		IDLE_LEFT, IDLE_RIGHT, IDLE_UP, IDLE_DOWN, WALKING_UP, WALKING_LEFT, WALKING_RIGHT, WALKING_DOWN, RUNNING_UP, RUNNING_DOWN, RUNNING_LEFT, RUNNING_RIGHT, FISHING, SWINGING_NET
		
	}
	
	private AnimationState state = AnimationState.IDLE_DOWN;
	private Environment currentenvironment;	
	private String name;
	private Tile currenttile;
	private Integer xID;
	private Integer yID;
	
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
	
	public void addToList() {
		
		this.currentenvironment.addToHumanArray(this);
		
	}	
	
	public Human(int xloc, int yloc) {
		
		super(xloc, yloc);		
		
	}	
	
	public String getName() {
		
		return name;
		
	}

	public void setName(String name) {
		
		this.name = name;
		
	}

	public Tile getCurrentTile() {
		
		return currenttile;
		
	}

	public void setCurrentTile(Tile currenttile) {
		
		this.currenttile = currenttile;
		
	}

	public Integer getXID() {
		return xID;
	}

	public void setXID(Integer xID) {
		this.xID = xID;
	}

	public Integer getYID() {
		return yID;
	}

	public void setYID(Integer yID) {
		this.yID = yID;
	}
	
}
