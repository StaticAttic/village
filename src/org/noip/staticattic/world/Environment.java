package org.noip.staticattic.world;

import org.noip.staticattic.entities.Tile;

public class Environment {
	
	private Tile[][] array = new Tile[99][99];
	
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
	
}
