package org.noip.staticattic.GUI.Animation;

import java.util.ArrayList;

import org.noip.staticattic.GUI.MainWindow;
import org.noip.staticattic.entities.Entity;

public class AnimationHandler implements Runnable {
	
	private ArrayList<Entity> entitylist = new ArrayList<Entity>();
	private MainWindow main;

	public AnimationHandler(MainWindow main) {
		
		this.main = main;
		
	}
	
	public ArrayList<Entity> getEntityList() {
		
		return entitylist;
		
	}

	public void setEntityList(ArrayList<Entity> entitylist) {
		
		this.entitylist = entitylist;
		
	}
	
	public void run() {
		
		for (Entity e : entitylist) {
			
			if (e.getAnimationEvent().getDelay() == 0) {
				
				if (!e.getAnimationState().equals(e.getAnimationEvent().getAnimationState())) {
					
					e.getAnimationEvent().setAnimationState(e.getAnimationState());
					
				}
				
				e.getAnimationEvent().execute();
				
				e.getLabel().setIcon(e.getIcon());
				
				main.mainpanel.repaint();
				
				e.getAnimationEvent().setDelay(100);
				
			} else {
				
				e.getAnimationEvent().setDelay(e.getAnimationEvent().getDelay()-20);
				
			}
			
		}
		
	}

}
