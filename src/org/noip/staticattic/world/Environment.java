package org.noip.staticattic.world;

import org.noip.staticattic.entities.Tile;

public class Environment {
	
	private Tile[][] array = new Tile[100][100];
	
	public Environment() {
		
		for (int x = 0; x < 100; x++) {
			
			for (int y = 0; y < 100; y++) {
				
				array[x][y] = new Tile(34*x,34*y);
				
			}
			
		}
		
	}
	
	public Tile[][] getArray() {
		
		return this.array;		
		
	}
	
}
