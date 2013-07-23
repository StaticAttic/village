package org.noip.staticattic.GUI.Animation;

import org.noip.staticattic.entities.Entity;

public abstract class EntityAnimationEvent extends Thread {
	
	private int delay;
	private Entity entity;
	
	public EntityAnimationEvent(Entity entity, int delay) {
		
		this.setDelay(delay);
		this.setEntity(entity);
		
	}

	public int getDelay() {
		
		return delay;
		
	}

	public void setDelay(int delay) {
		
		this.delay = delay;
		
	}
	
	public void execute() {
		
		
		
	}

	public Entity getEntity() {
		
		return entity;
		
	}

	public void setEntity(Entity entity) {
		
		this.entity = entity;
		
	}	
}
