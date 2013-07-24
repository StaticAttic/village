package org.noip.staticattic.entities;

import org.noip.staticattic.world.Environment;

public abstract class Human extends Entity {

	private Environment currentenvironment;	
	private String name;
	private Tile currenttile;
	private Integer xID;
	private Integer yID;
	private Gender gender;
	
	public enum Gender {
		
		MALE, FEMALE
		
	}
	
	public Environment getCurrentEnvironment() {
		
		return currentenvironment;
		
	}

	public void setCurrentEnvironment(Environment currentenvironment) {
		
		this.currentenvironment = currentenvironment;
		
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
	
	public Gender getGender() {
		
		return gender;
		
	}

	public void setGender(Gender gender) {
		
		this.gender = gender;
		
	}	

	public Human(int xloc, int yloc) {
		
		super(xloc, yloc);
		
	}
	
}
