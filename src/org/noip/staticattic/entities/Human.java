package org.noip.staticattic.entities;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.noip.staticattic.GUI.Animation.HumanAnimation;
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
	private HumanAnimation animationthread;
	ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(3);
	
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
		
		this.setAnimationthread(new HumanAnimation(this, 200));
		executor.scheduleAtFixedRate(this.getAnimationthread(), 0L, 200L, TimeUnit.MILLISECONDS);
		
		executor.shutdown();
		
		
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

	public Runnable getAnimationthread() {
		
		return animationthread;
		
	}

	public void setAnimationthread(HumanAnimation animationthread) {
		
		this.animationthread = animationthread;
		
	}
	
}
