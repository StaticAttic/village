package org.noip.staticattic.world;

import java.util.ArrayList;

import org.noip.staticattic.entities.Entity;
import org.noip.staticattic.entities.Tile;
import org.noip.staticattic.entities.Tile.Type;
import org.noip.staticattic.fileutils.TextureHandler;

public class Environment {
	
	private int width = 199;
	private int height = 199;
	private Tile[][] array = new Tile[width][height];
	private ArrayList<Entity> entitylist = new ArrayList<Entity>();

	private enum Direction {
		
		NORTH, SOUTH, EAST, WEST;
		
	}
	
	private Direction direction;
	private int currx,curry;
	
	public Environment() {
		
		for (int x = 0; x < 199; x++) {
			
			for (int y = 0; y < 199; y++) {
				
				array[x][y] = new Tile(x,y);
				
			}
			
		}
		
		genRivers();
		
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
	
	private void genRivers() {
		
		currx = (int)(Math.random()*width-1);
		curry = 0;
		array[currx][curry].setType(Type.RIVER);
		array[currx][curry].setIcon(TextureHandler.getWater());
		
		chooseDirection();
		
		genNextTile();
		
	}
	
	private void genNextTile() {
		
		if (direction.equals(Direction.NORTH)) {
			
			curry--;
			
		} else if (direction.equals(Direction.SOUTH)) {
			
			curry++;
			
		} else if (direction.equals(Direction.EAST)) {
			
			currx++;
			
		} else {
			
			currx--;
			
		}
		
		if (curry != height) {
			
			array[currx][curry].setType(Type.RIVER);
			array[currx][curry].setIcon(TextureHandler.getWater());
			
			chooseDirection();
			
			genNextTile();
			
		} 
		
	}
	
	private void chooseDirection() {
		
		int roll = rollRandom();
		Direction possibledirection = null;
		
		if (roll < 2 && direction != null) {
			
			possibledirection = direction;
			
		} else {
			
			do {
				
				int roll2 = rollRandom();
			
				if (roll2 == 0) {
				
					possibledirection = Direction.EAST;
				
				} else if (roll2 == 1) {
				
					possibledirection = Direction.WEST;
				
				} else if (roll2 == 2) {
				
					possibledirection = Direction.SOUTH;
				
				} else if (roll2 == 3){
					
					possibledirection = Direction.NORTH;
					
				}
			
			} while (possibledirection.equals(direction));
			
		}
		
		if (currx == 0 && possibledirection.equals(Direction.WEST)) {
			
			chooseDirection();
			
		} else if (currx == width-1 && possibledirection.equals(Direction.EAST)) {
			
			chooseDirection();
			
		} else if (curry == 0 && possibledirection.equals(Direction.NORTH)) {
			
			chooseDirection();
			
		} else {
		
			direction = possibledirection;
			
		}
		
	}
	
	private int rollRandom() {
		
		return (int) Math.round(((Math.random()*3)));
		
	}
	
}
