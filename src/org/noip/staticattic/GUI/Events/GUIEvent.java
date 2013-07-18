package org.noip.staticattic.GUI.Events;

import org.noip.staticattic.GUI.MainWindow;

public abstract class GUIEvent {
	
	private int delay;
	private MainWindow main;
	
	public GUIEvent(MainWindow main, int delay) {
		
		this.setDelay(delay);
		this.setMain(main);
		
	}

	public int getDelay() {
		
		return delay;
		
	}

	public void setDelay(int delay) {
		
		this.delay = delay;
		
	}

	public MainWindow getMain() {
		
		return main;
		
	}

	public void setMain(MainWindow main) {
		
		this.main = main;
		
	}
	
	public void execute() {
		
		
	}

}
