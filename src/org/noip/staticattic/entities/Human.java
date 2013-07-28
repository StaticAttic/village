package org.noip.staticattic.entities;

import javax.swing.JLabel;

import org.noip.staticattic.world.Environment;

public abstract class Human extends Entity {

	private Environment currentenvironment;	
	private String name;
	private Tile currenttile;
	private Gender gender;
	private JLabel label;
	
	public enum Gender {
		
		MALE, FEMALE
		
	}
	
	public Environment getCurrentEnvironment() {
		
		return currentenvironment;
		
	}
	
	public JLabel getLabel() {
		
		return label;
		
	}

	public void setLabel(JLabel label) {
		
		this.label = label;
		
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
		
		this.getLocation().setX(currenttile.getLocation().getX());
		this.getLocation().setY(currenttile.getLocation().getY());
		this.currenttile = currenttile;
		
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
