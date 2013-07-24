package org.noip.staticattic.GUI;

import java.awt.KeyEventDispatcher;
import java.awt.event.KeyEvent;

import org.noip.staticattic.GUI.Events.ShowMenuScreen;
import org.noip.staticattic.entities.Entity.AnimationState;
import org.noip.staticattic.fileutils.TextureHandler;

public class KeyEventHandler implements KeyEventDispatcher {
	
	private MainWindow main;
	
	public KeyEventHandler(MainWindow main) {
		
		this.main = main;
		
	}

	@Override
	public boolean dispatchKeyEvent(KeyEvent e) {
		
		if (e.getID() == KeyEvent.KEY_PRESSED) {
			
			if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				
				if (main.getPlayer().getAnimationState().equals(AnimationState.IDLE_RIGHT)) {
					
					main.getPlayer().setAnimationState(AnimationState.WALKING_RIGHT);
					main.getENhandler().moveLeft();
					
				} else if (main.getPlayer().getAnimationState().equals(AnimationState.IDLE_UP) || main.getPlayer().getAnimationState().equals(AnimationState.IDLE_LEFT) || main.getPlayer().getAnimationState().equals(AnimationState.IDLE_DOWN)) {
					
					main.getPlayer().setIcon(TextureHandler.getMPlayerRight());
					main.getPlayer().getLabel().setIcon(main.getPlayer().getIcon());
					
					main.getPlayer().setAnimationState(AnimationState.IDLE_RIGHT);
					
				} else if (main.getPlayer().getAnimationState().equals(AnimationState.WALKING_RIGHT)) {
					
					main.getENhandler().moveLeft();
					
				}
				
			} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				
				if (main.getPlayer().getAnimationState().equals(AnimationState.IDLE_LEFT)) {
					
					main.getPlayer().setAnimationState(AnimationState.WALKING_LEFT);
					main.getENhandler().moveRight();
					
				} else if (main.getPlayer().getAnimationState().equals(AnimationState.IDLE_UP) || main.getPlayer().getAnimationState().equals(AnimationState.IDLE_RIGHT) || main.getPlayer().getAnimationState().equals(AnimationState.IDLE_DOWN)) {
					
					main.getPlayer().setIcon(TextureHandler.getMPlayerLeft());
					main.getPlayer().getLabel().setIcon(main.getPlayer().getIcon());
					
					main.getPlayer().setAnimationState(AnimationState.IDLE_LEFT);
					
				} else if (main.getPlayer().getAnimationState().equals(AnimationState.WALKING_LEFT)) {
					
					main.getENhandler().moveRight();
					
				}
				
			} else if (e.getKeyCode() == KeyEvent.VK_UP) {
				
				if (main.getPlayer().getAnimationState().equals(AnimationState.IDLE_UP)) {
					
					main.getPlayer().setAnimationState(AnimationState.WALKING_UP);
					main.getENhandler().moveDown();
					
				} else if (main.getPlayer().getAnimationState().equals(AnimationState.IDLE_RIGHT) || main.getPlayer().getAnimationState().equals(AnimationState.IDLE_LEFT) || main.getPlayer().getAnimationState().equals(AnimationState.IDLE_DOWN)) {
					
					main.getPlayer().setIcon(TextureHandler.getMPlayerUp());
					main.getPlayer().getLabel().setIcon(main.getPlayer().getIcon());
					
					main.getPlayer().setAnimationState(AnimationState.IDLE_UP);
					
				} else if (main.getPlayer().getAnimationState().equals(AnimationState.WALKING_UP)) {
					
					main.getENhandler().moveDown();
					
				}
				
			} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
				
				if (main.getPlayer().getAnimationState().equals(AnimationState.IDLE_DOWN)) {
					
					main.getPlayer().setAnimationState(AnimationState.WALKING_DOWN);
					main.getENhandler().moveUp();
					
				} else if (main.getPlayer().getAnimationState().equals(AnimationState.IDLE_UP) || main.getPlayer().getAnimationState().equals(AnimationState.IDLE_LEFT) || main.getPlayer().getAnimationState().equals(AnimationState.IDLE_RIGHT)) {
					
					main.getPlayer().setIcon(TextureHandler.getMPlayerDown());
					main.getPlayer().getLabel().setIcon(main.getPlayer().getIcon());
					
					main.getPlayer().setAnimationState(AnimationState.IDLE_DOWN);
					
				} else if (main.getPlayer().getAnimationState().equals(AnimationState.WALKING_DOWN)) {
					
					main.getENhandler().moveUp();
					
				}
				
			} else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
        		
        		main.getUIhandler().purgeQueue();
    			main.getUIhandler().addToQueue(new ShowMenuScreen(main, 0));
        		
        	}
        
        } else if (e.getID() == KeyEvent.KEY_RELEASED) {
        	
        	if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
    			
    			main.getPlayer().setAnimationState(AnimationState.IDLE_RIGHT);
    			main.getPlayer().setIcon(TextureHandler.getMPlayerRight());
    			
    		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
    			
    			main.getPlayer().setAnimationState(AnimationState.IDLE_LEFT);
    			main.getPlayer().setIcon(TextureHandler.getMPlayerLeft());
    			
    		} else if (e.getKeyCode() == KeyEvent.VK_UP) {
    			
    			main.getPlayer().setAnimationState(AnimationState.IDLE_UP);
    			main.getPlayer().setIcon(TextureHandler.getMPlayerUp());
    			
    		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
    			
    			main.getPlayer().setAnimationState(AnimationState.IDLE_DOWN);
    			main.getPlayer().setIcon(TextureHandler.getMPlayerDown());
    			
    		}
        	
        } else if (e.getID() == KeyEvent.KEY_TYPED) {
 
        	
        }
		
		return false;
	}

}
