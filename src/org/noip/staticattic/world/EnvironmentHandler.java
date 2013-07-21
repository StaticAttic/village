package org.noip.staticattic.world;

import org.noip.staticattic.GUI.MainWindow;
import org.noip.staticattic.entities.Tile;

public class EnvironmentHandler implements Runnable {

	private MainWindow main;
	private Environment environment = null;
	private Environment MainEnvironment;	
	
	public EnvironmentHandler(MainWindow main) {
		
		this.main = main;
		
	}
	
	@Override
	public void run() {
	
		if (!main.getPlayer().getCurrentEnvironment().equals(environment)) {
			
			environment = main.getPlayer().getCurrentEnvironment();
			changeEnvironments();
			
		}
		
	}
	
	private void changeEnvironments() {
		
		Tile[][] array = main.getPlayer().getCurrentEnvironment().getArray();
				  
		main.mainpanel.add(main.getPlayer().getLabel());
		  
		for (Tile[] row : array) {
		   
			for (Tile e : row) {
		    
				main.mainpanel.add(e.getLabel());
		    
			}
		   
		}
		  
		main.repaint();
		  
	}
	
	public void moveRight() {
				
		Tile[][] array = main.getPlayer().getCurrentEnvironment().getArray();
		
		int x = 0;
		int y = 0;
		
		for (Tile[] row : array) {
			
			for (Tile e : row) {
				
				if (e.equals(main.getPlayer().getCurrentTile())) {
					
					try {
						
						main.getPlayer().setCurrentTile(array[x+1][y]);
						
					} catch (IndexOutOfBoundsException e1) {
						
						//swallow - edge of map
						
					}
					
				}
				
				e.getLocation().setX(e.getLocation().getX()+34);				
				e.updatePosition();
				
				y++;
												
			}
			
			x++;
			
		}
		
		main.repaint();
		
	}
	
	public void moveLeft() {			
		
		Tile[][] array = main.getPlayer().getCurrentEnvironment().getArray();
			
		int x = 0;
		int y = 0;
		
		for (Tile[] row : array) {
				
			for (Tile e : row) {
					
				if (e.equals(main.getPlayer().getCurrentTile())) {
					
					try {
						
						main.getPlayer().setCurrentTile(array[x-1][y]);
						
					} catch (IndexOutOfBoundsException e1) {
						
						//swallow - edge of map
						
					}
					
				}
				
				e.getLocation().setX(e.getLocation().getX()-34);				
				e.updatePosition();
				
				y++;
				
			}
			
			x++;
				
		}
			
		main.repaint();	
		
	}
	
	public void moveUp() {
					
		Tile[][] array = main.getPlayer().getCurrentEnvironment().getArray();
			
		int x = 0;
		int y = 0;
		
		for (Tile[] row : array) {
				
			for (Tile e : row) {
				
				if (e.equals(main.getPlayer().getCurrentTile())) {
					
					try {
						
						main.getPlayer().setCurrentTile(array[x][y-1]);
						
					} catch (IndexOutOfBoundsException e1) {
						
						//swallow - edge of map
						
					}
					
				}
				
				e.getLocation().setY(e.getLocation().getY()-34);				
				e.updatePosition();
				
				y++;
				
			}
		
			x++;
			
		}
			
		main.repaint();	
		
	}
	
	public void moveDown() {
					
		Tile[][] array = main.getPlayer().getCurrentEnvironment().getArray();
			
		int x = 0;
		int y = 0;
		
		for (Tile[] row : array) {
			
			for (Tile e : row) {					
				
				if (e.equals(main.getPlayer().getCurrentTile())) {
					
					try {
						
						main.getPlayer().setCurrentTile(array[x][y+1]);
						
					} catch (IndexOutOfBoundsException e1) {
						
						//swallow - edge of map
						
					}
					
				}
				
				e.getLocation().setY(e.getLocation().getY()+34);				
				e.updatePosition();
				
				y++;
				
			}
			
			x++;
				
		}
			
		main.repaint();	
		
	}

	public Environment getMainEnvironment() {
		
		return MainEnvironment;
		
	}

	public void setMainEnvironment(Environment mainEnvironment) {
		
		MainEnvironment = mainEnvironment;
		
	}

}
