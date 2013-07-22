package org.noip.staticattic.world;

import java.util.ArrayList;

import org.noip.staticattic.entities.Human;
import org.noip.staticattic.entities.Tile;

public class Environment {
	
	private Tile[][] array = new Tile[99][99];
	private ArrayList<Human> humanArray = new ArrayList<Human>();
	
	public Environment() {
		
		for (int x = 0; x < 99; x++) {
			
			for (int y = 0; y < 99; y++) {
				
				array[x][y] = new Tile(34*x,34*y);
				
			}
			
		}
		
	}
	
	public Tile[][] getArray() {
		
		return this.array;		
		
	}	
	
	public void addToHumanArray(Human e) {
		
		this.humanArray.add(e);
		
	}

	public ArrayList<Human> getHumanArray() {
		return humanArray;
	}

	public void setHumanArray(ArrayList<Human> humanArray) {
		this.humanArray = humanArray;
	}
	
}
