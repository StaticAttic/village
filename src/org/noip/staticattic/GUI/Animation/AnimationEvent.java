package org.noip.staticattic.GUI.Animation;

import org.noip.staticattic.entities.Entity;
import org.noip.staticattic.entities.Entity.AnimationState;
import org.noip.staticattic.fileutils.TextureHandler;

public class AnimationEvent {
	
	private int delay = 200;
	private int count = 0;
	private Entity entity;
	private AnimationState animationstate = AnimationState.IDLE_DOWN;
	
	public AnimationEvent(Entity entity) {
		
		this.entity = entity;
		
	}

	public int getDelay() {
		
		return delay;
		
	}

	public void setDelay(int delay) {
		
		this.delay = delay;
		
	}
	
	public AnimationState getAnimationState() {
		
		return animationstate;
		
	}

	public void setAnimationState(AnimationState animationstate) {
		
		count = 0;
		this.animationstate = animationstate;
		
	}

	public void execute() {
		
		if (getAnimationState().equals(AnimationState.WALKING_DOWN)) {
			
			if (count == 0) {
				
				if (entity.getClass().getSimpleName().equals("Player")) {
					
					entity.setIcon(TextureHandler.getMPlayerDown2());
					
				}
				
			}
			
			else if (count == 1) {
				
				if (entity.getClass().getSimpleName().equals("Player")) {
					
					entity.setIcon(TextureHandler.getMPlayerDown());
					
				}
				
			}
			
			else if (count == 2) {
				
				if (entity.getClass().getSimpleName().equals("Player")) {
					
					entity.setIcon(TextureHandler.getMPlayerDown3());
					
				}
				
			}
			
			else if (count == 3) {
				
				if (entity.getClass().getSimpleName().equals("Player")) {
					
					entity.setIcon(TextureHandler.getMPlayerDown());				
					count = -1;
					
				}
				
			}
			
		}
		
		else if (getAnimationState().equals(AnimationState.WALKING_UP)) {
			
			if (count == 0) {
				
				if (entity.getClass().getSimpleName().equals("Player")) {
					
					entity.setIcon(TextureHandler.getMPlayerUp2());
					
				}
				
			}
			
			else if (count == 1) {
				
				if (entity.getClass().getSimpleName().equals("Player")) {
					
					entity.setIcon(TextureHandler.getMPlayerUp());
					
				}
				
			}
			
			else if (this.count == 2) {
				
				if (entity.getClass().getSimpleName().equals("Player")) {
					
					entity.setIcon(TextureHandler.getMPlayerUp3());
					
				}
				
			}
			
			else if (this.count == 3) {
				
				if (entity.getClass().getSimpleName().equals("Player")) {
					
					entity.setIcon(TextureHandler.getMPlayerUp());				
					count = -1;
					
				}
				
			}
			
		}
		
		else if (getAnimationState().equals(AnimationState.WALKING_LEFT)) {
			
			if (count == 0) {
				
				if (entity.getClass().getSimpleName().equals("Player")) {
					
					entity.setIcon(TextureHandler.getMPlayerLeft2());
					
				}
				
			}
			
			else if (count == 1) {
				
				if (entity.getClass().getSimpleName().equals("Player")) {
					
					entity.setIcon(TextureHandler.getMPlayerLeft());
					
				}
				
			}
			
			else if (count == 2) {
				
				if (entity.getClass().getSimpleName().equals("Player")) {
					
					entity.setIcon(TextureHandler.getMPlayerLeft3());
					
				}
				
			}
			
			else if (count == 3) {
				
				if (entity.getClass().getSimpleName().equals("Player")) {
					
					entity.setIcon(TextureHandler.getMPlayerLeft());				
					count = -1;
					
				}
				
			}
			
		}
		
		else if (getAnimationState().equals(AnimationState.WALKING_RIGHT)) {
			
			if (count == 0) {
						
				if (entity.getClass().getSimpleName().equals("Player")) {
					
					entity.setIcon(TextureHandler.getMPlayerRight2());
					
				}
				
			}
			
			else if (count == 1) {
				
				if (entity.getClass().getSimpleName().equals("Player")) {
					
					entity.setIcon(TextureHandler.getMPlayerRight());
					
				}
				
			}
			
			else if (count == 2) {
				
				if (entity.getClass().getSimpleName().equals("Player")) {
					
					entity.setIcon(TextureHandler.getMPlayerRight3());
					
				}
				
			}
			
			else if (count == 3) {
				
				if (entity.getClass().getSimpleName().equals("Player")) {
					
					entity.setIcon(TextureHandler.getMPlayerRight());
					count = -1;
					
				}
				
			}
		
		} else if (getAnimationState().equals(AnimationState.IDLE_RIGHT)) {
			
			if (entity.getClass().getSimpleName().equals("Player")) {
				
				entity.setIcon(TextureHandler.getMPlayerRight());
				count = -1;
				
			}
			
		} else if (getAnimationState().equals(AnimationState.IDLE_LEFT)) {
			
			if (entity.getClass().getSimpleName().equals("Player")) {
				
				entity.setIcon(TextureHandler.getMPlayerLeft());
				count = -1;
				
			}
			
		} else if (getAnimationState().equals(AnimationState.IDLE_UP)) {
			
			if (entity.getClass().getSimpleName().equals("Player")) {
				
				entity.setIcon(TextureHandler.getMPlayerUp());
				count = -1;
				
			}
			
		} else if (getAnimationState().equals(AnimationState.IDLE_DOWN)) {
			
			if (entity.getClass().getSimpleName().equals("Player")) {
				
				entity.setIcon(TextureHandler.getMPlayerDown());
				count = -1;
				
			}
			
		}
		
		count++;
		
	}

}
