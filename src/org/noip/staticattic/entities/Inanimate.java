package org.noip.staticattic.entities;

import org.noip.staticattic.GUI.Animation.AnimationEvent;

public abstract class Inanimate extends Entity {
	
	public Inanimate(int xloc, int yloc) {
		
		super(xloc, yloc);
		
		this.setAnimationEvent(new AnimationEvent(this));
		
	}
	
}
