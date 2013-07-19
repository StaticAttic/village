package org.noip.staticattic.entities;

import java.util.UUID;

import org.noip.staticattic.location.Location;

public abstract class Entity {
	
	private Location location;
	private final UUID entityID;

	public UUID getID() {
		
		return this.entityID;
		
	}
	
	public Location getLocation() {
		
		return this.location;
		
	}
	
	public Entity(int xloc, int yloc) {
		
		this.location = new Location(xloc, yloc);
		this.entityID = UUID.randomUUID();
		
	}

}
