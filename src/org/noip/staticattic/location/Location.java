package org.noip.staticattic.location;

public class Location {

	private int x;
	private int y;
	private String loc;
	
	public Location(int xloc,int yloc) {
		
		x = xloc;
		y = yloc;
		
	}
	
	public String getLocation() {
		
		int currx = this.getX();
		int curry = this.getY();
		loc = "("+currx+","+curry+")";
		return loc;
		
	}
	
	public int getX() {
		
		return this.x;
		
	}
	
	public int getY() {
		
		return this.y;
		
	}
	
	public void setX(int xloc) {
		
		this.x = xloc;
		
	}
	
	public void setY(int yloc) {
		
		this.y = yloc;
		
	}
	
	public void setLocation(int xloc, int yloc) {
		
		this.setX(xloc);
		this.setY(yloc);
		
	}
	
	
}
