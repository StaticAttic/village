package org.noip.staticattic.world;

import org.noip.staticattic.entities.Tile;

public class Environment {
	
	private Tile[][] array = new Tile[100][100];
	
	public Environment() {
		
		for (int i = 0; i < 100; i++) {
			
			for (int x = 0; x < 100; x++) {
				
				array[i][x] = new Tile(48*i,48*x);
				
			}
			
		}
		
	}
	
	public Tile[][] getArray() {
		
		return this.array;
		
	}

}
