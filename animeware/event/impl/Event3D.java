package animeware.event.impl;

import animeware.event.Event;

public class Event3D extends Event {
	private float partialTicks;
	
	public Event3D(float partialticks) {
		this.partialTicks = partialticks;
	}

	public float getPartialTicks() {
		return partialTicks;
	}

	public void setPartialTicks(float partialTicks) {
		this.partialTicks = partialTicks;
	}

}
