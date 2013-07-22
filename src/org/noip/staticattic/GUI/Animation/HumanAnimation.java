package org.noip.staticattic.GUI.Animation;

import org.noip.staticattic.GUI.MainWindow;
import org.noip.staticattic.entities.Human;
import org.noip.staticattic.entities.Human.AnimationState;
import org.noip.staticattic.fileutils.TextureHandler;

public class HumanAnimation extends EntityAnimationEvent {
	
	private int delay;
	private Human human;
	private int count = 0;
	private MainWindow main;

	public HumanAnimation(MainWindow main, Human human, int delay) {
		
		super(human, delay);		
		this.setDelay(delay);
		this.setHuman(human);		
		this.setMain(main);
		
	}
	
	@Override
	public void execute() {
		
		if(this.human.getAnimationState().equals(AnimationState.WALKING_DOWN)) {
			
			if(this.count == 0) {
				
				this.human.setIcon(TextureHandler.getPlayerDown2());
				
			}
			
			else if(this.count == 1) {
				
				this.human.setIcon(TextureHandler.getPlayerDown());
				
			}
			
			else if(this.count == 2) {
				
				this.human.setIcon(TextureHandler.getPlayerDown3());
				
			}
			
			else if(this.count == 3) {
				
				this.human.setIcon(TextureHandler.getPlayerDown());				
				this.count = 0;
				
			}
			
		}
		
		else if(this.human.getAnimationState().equals(AnimationState.WALKING_UP)) {
			
			if(this.count == 0) {
				
				this.human.setIcon(TextureHandler.getPlayerUp2());
				
			}
			
			else if(this.count == 1) {
				
				this.human.setIcon(TextureHandler.getPlayerUp());
				
			}
			
			else if(this.count == 2) {
				
				this.human.setIcon(TextureHandler.getPlayerUp3());
				
			}
			
			else if(this.count == 3) {
				
				this.human.setIcon(TextureHandler.getPlayerUp());				
				this.count = 0;
				
			}
			
		}
		
		else if(this.human.getAnimationState().equals(AnimationState.WALKING_LEFT)) {
			
			if(this.count == 0) {
				
				this.human.setIcon(TextureHandler.getPlayerLeft2());
				
			}
			
			else if(this.count == 1) {
				
				this.human.setIcon(TextureHandler.getPlayerLeft());
				
			}
			
			else if(this.count == 2) {
				
				this.human.setIcon(TextureHandler.getPlayerLeft3());
				
			}
			
			else if(this.count == 3) {
				
				this.human.setIcon(TextureHandler.getPlayerLeft());				
				this.count = 0;
				
			}
			
		}
		
		else if(this.human.getAnimationState().equals(AnimationState.WALKING_RIGHT)) {
			
			if(this.count == 0) {
								
				this.human.setIcon(TextureHandler.getPlayerRight2());
				
			}
			
			else if(this.count == 1) {
				
				this.human.setIcon(TextureHandler.getPlayerRight());
				
			}
			
			else if(this.count == 2) {
				
				this.human.setIcon(TextureHandler.getPlayerRight3());
				
			}
			
			else if(this.count == 3) {
				
				this.human.setIcon(TextureHandler.getPlayerRight());
				this.count = 0;
				
			}	
			
		}
		
		this.human.getLabel().setIcon(this.human.getIcon());
		this.count++;
		this.main.mainpanel.repaint();
		
	}	
	
	public int getDelay() {
		
		return this.delay;
		
	}
	
	public void setDelay(int delay) {
		
		this.delay = delay;
		
	}
	
	public Human getHuman() {
		
		return this.human;
		
	}
	
	public void setHuman(Human human) {
		
		this.human = human;
		
	}

	public int getCount() {
		
		return count;
		
	}

	public void setCount(int count) {
		
		this.count = count;
		
	}

	public MainWindow getMain() {
		
		return main;
		
	}

	public void setMain(MainWindow main) {
		
		this.main = main;
		
	}	
}
