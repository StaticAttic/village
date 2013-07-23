package org.noip.staticattic.entities;

import org.noip.staticattic.GUI.Animation.AnimationEvent;

public class NPC extends Human {

	public NPC(int xloc, int yloc) {
		
		super (xloc, yloc);
		
		this.setAnimationEvent(new AnimationEvent(this));
		
	}
	
}
