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
					
					entity.setIcon(TextureHandler.getPlayerDown2());
					
				}
				
			}
			
			else if (count == 1) {
				
				if (entity.getClass().getSimpleName().equals("Player")) {
					
					entity.setIcon(TextureHandler.getPlayerDown());
					
				}
				
			}
			
			else if (count == 2) {
				
				if (entity.getClass().getSimpleName().equals("Player")) {
					
					entity.setIcon(TextureHandler.getPlayerDown3());
					
				}
				
			}
			
			else if (count == 3) {
				
				if (entity.getClass().getSimpleName().equals("Player")) {
					
					entity.setIcon(TextureHandler.getPlayerDown());				
					count = 0;
					
				}
				
			}
			
		}
		
		else if (getAnimationState().equals(AnimationState.WALKING_UP)) {
			
			if (count == 0) {
				
				if (entity.getClass().getSimpleName().equals("Player")) {
					
					entity.setIcon(TextureHandler.getPlayerUp2());
					
				}
				
			}
			
			else if (count == 1) {
				
				if (entity.getClass().getSimpleName().equals("Player")) {
					
					entity.setIcon(TextureHandler.getPlayerUp());
					
				}
				
			}
			
			else if (this.count == 2) {
				
				if (entity.getClass().getSimpleName().equals("Player")) {
					
					entity.setIcon(TextureHandler.getPlayerUp3());
					
				}
				
			}
			
			else if (this.count == 3) {
				
				if (entity.getClass().getSimpleName().equals("Player")) {
					
					entity.setIcon(TextureHandler.getPlayerUp());				
					count = 0;
					
				}
				
			}
			
		}
		
		else if (getAnimationState().equals(AnimationState.WALKING_LEFT)) {
			
			if (count == 0) {
				
				if (entity.getClass().getSimpleName().equals("Player")) {
					
					entity.setIcon(TextureHandler.getPlayerLeft2());
					
				}
				
			}
			
			else if (count == 1) {
				
				if (entity.getClass().getSimpleName().equals("Player")) {
					
					entity.setIcon(TextureHandler.getPlayerLeft());
					
				}
				
			}
			
			else if (count == 2) {
				
				if (entity.getClass().getSimpleName().equals("Player")) {
					
					entity.setIcon(TextureHandler.getPlayerLeft3());
					
				}
				
			}
			
			else if (count == 3) {
				
				if (entity.getClass().getSimpleName().equals("Player")) {
					
					entity.setIcon(TextureHandler.getPlayerLeft());				
					count = 0;
					
				}
				
			}
			
		}
		
		else if (getAnimationState().equals(AnimationState.WALKING_RIGHT)) {
			
			if (count == 0) {
						
				if (entity.getClass().getSimpleName().equals("Player")) {
					
					entity.setIcon(TextureHandler.getPlayerRight2());
					
				}
				
			}
			
			else if (count == 1) {
				
				if (entity.getClass().getSimpleName().equals("Player")) {
					
					entity.setIcon(TextureHandler.getPlayerRight());
					
				}
				
			}
			
			else if (count == 2) {
				
				if (entity.getClass().getSimpleName().equals("Player")) {
					
					entity.setIcon(TextureHandler.getPlayerRight3());
					
				}
				
			}
			
			else if (count == 3) {
				
				if (entity.getClass().getSimpleName().equals("Player")) {
					
					entity.setIcon(TextureHandler.getPlayerRight());
					count = 0;
					
				}
				
			}
		
		}
		
		count++;
		System.out.println(count);
		
	}

}
