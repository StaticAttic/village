package org.noip.staticattic.world;

import java.util.ArrayList;

import org.noip.staticattic.entities.Entity;
import org.noip.staticattic.entities.Tile;

public class Environment {
	
	private Tile[][] array = new Tile[99][99];
	private ArrayList<Entity> entitylist = new ArrayList<Entity>();
	
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
	
	public void addToEntityList(Entity e) {
		
		entitylist.add(e);
		
	}

	public ArrayList<Entity> getEntityList() {
		
		return entitylist;
		
	}

	public void setEntityList(ArrayList<Entity> entitylist) {
		
		this.entitylist = entitylist;
		
	}
	
}
