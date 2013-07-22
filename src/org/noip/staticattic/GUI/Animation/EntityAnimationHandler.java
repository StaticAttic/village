package org.noip.staticattic.GUI.Animation;

import java.util.ArrayList;

import org.noip.staticattic.GUI.MainWindow;
import org.noip.staticattic.entities.Human;
import org.noip.staticattic.entities.Human.AnimationState;

public class EntityAnimationHandler implements Runnable {
	
	private ArrayList<Human> HumanArray;
	private ArrayList<EntityAnimationEvent> events = new ArrayList<EntityAnimationEvent>();
	private MainWindow main;
		
	public EntityAnimationHandler(MainWindow main) {
		
		this.setMain(main);		
		this.setHumanArray(this.main.getPlayer().getCurrentEnvironment().getHumanArray());
		
	}
	
	@Override
	public void run() {
		
		for(Human e: HumanArray) {
			
			if (e.getAnimationState().equals(AnimationState.WALKING_LEFT)||e.getAnimationState().equals(AnimationState.WALKING_RIGHT)||e.getAnimationState().equals(AnimationState.WALKING_UP)||e.getAnimationState().equals(AnimationState.WALKING_DOWN)) {
								
				events.add(new HumanAnimation(this.main, e, 200));
				
			}
		}
		
		for (EntityAnimationEvent e: events) {
			
			if (e.getDelay() <= 0) {				
				
				e.execute();
				//events.remove(e);
				e.setDelay(200);
				break;
				
			} else {
				
				e.setDelay(e.getDelay()-20);
				
			}
			
		}
		
	}
	
	public MainWindow getMain() {
		
		return main;
		
	}

	public void setMain(MainWindow main) {
		
		this.main = main;
		
	}

	public ArrayList<Human> getHumanArray() {
		
		return HumanArray;
		
	}

	public void setHumanArray(ArrayList<Human> humanArray) {
		
		HumanArray = humanArray;
		
	}

	public ArrayList<EntityAnimationEvent> getEvents() {
		
		return events;
		
	}

	public void setEvents(ArrayList<EntityAnimationEvent> events) {
		
		this.events = events;
		
	}
}
