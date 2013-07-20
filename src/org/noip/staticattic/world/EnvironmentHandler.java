package org.noip.staticattic.world;

import javax.swing.JLabel;

import org.noip.staticattic.GUI.MainWindow;
import org.noip.staticattic.entities.Tile;

public class EnvironmentHandler implements Runnable {

	private MainWindow main;
	private Environment environment = null;
	private Environment MainEnvironment;
	private JLabel player;
	
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
		  
		  player = new JLabel(main.getPlayer().getIcon());
		  
		  player.setBounds(main.getPlayer().getLocation().getX(), main.getPlayer().getLocation().getY(), 68, 88);
		  
		  main.mainpanel.add(player);
		  
		  for (Tile[] row : array) {
		   
		   for (Tile e : row) {
		    
		    main.mainpanel.add(e.getLbl());
		    
		   }
		   
		  }
		  
		  System.out.println(main.mainpanel.getComponentCount());
		  
		  main.repaint();
	}
	
	public void moveRight() {
				
		Tile[][] array = main.getPlayer().getCurrentEnvironment().getArray();
		
		for (Tile[] row : array) {
			
			for (Tile e : row) {
				
				e.getLocation().setX(e.getLocation().getX()+48);				
				e.updatePosition();
												
			}
			
		}
		
		main.repaint();
		
	}
	
	public void moveLeft() {			
		
		Tile[][] array = main.getPlayer().getCurrentEnvironment().getArray();
			
		for (Tile[] row : array) {
				
			for (Tile e : row) {
					
				e.getLocation().setX(e.getLocation().getX()-48);				
				e.updatePosition();
				
			}
				
		}
			
		main.repaint();	
		
	}
	
	public void moveUp() {
					
		Tile[][] array = main.getPlayer().getCurrentEnvironment().getArray();
			
		for (Tile[] row : array) {
				
			for (Tile e : row) {
				
				e.getLocation().setY(e.getLocation().getY()-48);				
				e.updatePosition();
				
			}
				
		}
			
		main.repaint();	
		
	}
	
	public void moveDown() {
					
		Tile[][] array = main.getPlayer().getCurrentEnvironment().getArray();
			
		for (Tile[] row : array) {
				
			for (Tile e : row) {					
				
				e.getLocation().setY(e.getLocation().getY()+48);				
				e.updatePosition();
				
			}
				
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
