package org.noip.staticattic.GUI;

import java.awt.KeyEventDispatcher;
import java.awt.event.KeyEvent;

import org.noip.staticattic.GUI.Events.ShowMenuScreen;
import org.noip.staticattic.entities.Entity.AnimationState;

public class KeyEventHandler implements KeyEventDispatcher {
	
	private MainWindow main;
	private boolean sprinting = false;
	
	public KeyEventHandler(MainWindow main) {
		
		this.main = main;
		
	}

	@Override
	public boolean dispatchKeyEvent(KeyEvent e) {
		
		if (e.getID() == KeyEvent.KEY_PRESSED) {
			
			if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				
				if (main.isInGame()) {
					
					if (main.getPlayer().getAnimationState().equals(AnimationState.IDLE_RIGHT) && !main.getENhandler().isMoving()) {
					
						if (sprinting) {
							
							main.getPlayer().setAnimationState(AnimationState.RUNNING_RIGHT);
							
						} else {
							
							main.getPlayer().setAnimationState(AnimationState.WALKING_RIGHT);
							
						}
						
					} else if (main.getPlayer().getAnimationState().equals(AnimationState.IDLE_UP) || main.getPlayer().getAnimationState().equals(AnimationState.IDLE_LEFT) || main.getPlayer().getAnimationState().equals(AnimationState.IDLE_DOWN)) {

						main.getPlayer().setAnimationState(AnimationState.IDLE_RIGHT);
					
					}
					
				}
				
				return true;
				
			} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				
				if (main.isInGame()) {
						
					if (main.getPlayer().getAnimationState().equals(AnimationState.IDLE_LEFT) && !main.getENhandler().isMoving()) {
						
						if (sprinting) {
							
							main.getPlayer().setAnimationState(AnimationState.RUNNING_LEFT);
							
						} else {
							
							main.getPlayer().setAnimationState(AnimationState.WALKING_LEFT);
							
						}
						
					} else if (main.getPlayer().getAnimationState().equals(AnimationState.IDLE_UP) || main.getPlayer().getAnimationState().equals(AnimationState.IDLE_RIGHT) || main.getPlayer().getAnimationState().equals(AnimationState.IDLE_DOWN)) {
			
						main.getPlayer().setAnimationState(AnimationState.IDLE_LEFT);
					
					}
						
				}
				
				return true;
				
			} else if (e.getKeyCode() == KeyEvent.VK_UP) {
				
				if (main.isInGame()) {
					
					if (main.getPlayer().getAnimationState().equals(AnimationState.IDLE_UP) && !main.getENhandler().isMoving()) {
						
						if (sprinting) {
							
							main.getPlayer().setAnimationState(AnimationState.RUNNING_UP);
							
						} else {
							
							main.getPlayer().setAnimationState(AnimationState.WALKING_UP);
							
						}
						
					} else if (main.getPlayer().getAnimationState().equals(AnimationState.IDLE_RIGHT) || main.getPlayer().getAnimationState().equals(AnimationState.IDLE_LEFT) || main.getPlayer().getAnimationState().equals(AnimationState.IDLE_DOWN)) {
					
						main.getPlayer().setAnimationState(AnimationState.IDLE_UP);
					
					}
					
				}
				
				return true;
				
			} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
				
				if (main.isInGame()) {
					
					if (main.getPlayer().getAnimationState().equals(AnimationState.IDLE_DOWN) && !main.getENhandler().isMoving()) {
						
						if (sprinting) {
							
							main.getPlayer().setAnimationState(AnimationState.RUNNING_DOWN);
							
						} else {
							
							main.getPlayer().setAnimationState(AnimationState.WALKING_DOWN);
							
						}
						
					} else if (main.getPlayer().getAnimationState().equals(AnimationState.IDLE_UP) || main.getPlayer().getAnimationState().equals(AnimationState.IDLE_LEFT) || main.getPlayer().getAnimationState().equals(AnimationState.IDLE_RIGHT)) {
					
						main.getPlayer().setAnimationState(AnimationState.IDLE_DOWN);
					
					}
				
				}
				
				return true;
				
			} else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
        		
        		main.getUIhandler().purgeQueue();
    			main.getUIhandler().addToQueue(new ShowMenuScreen(main, 0));
        		return true;
    			
        	} else if (e.getKeyCode() == KeyEvent.VK_SHIFT) {
        		
        		if (sprinting) {
        			
        			sprinting = false;
        			
        		} else {
        			
        			sprinting = true;
        			
        		}
        		
        	}
        
        } else if (e.getID() == KeyEvent.KEY_RELEASED) {
        	
        	
        } else if (e.getID() == KeyEvent.KEY_TYPED) {
 
        	
        }
		
        return false;
		
	}

}
