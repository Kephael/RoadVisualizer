package com.sim.network.update;

import com.sim.geometries.Vector23f;


public class RoadCloseUpdate extends NetworkUpdate{
	
	/**
	 * Where the close update request was generated.
	 */
	private Vector23f point;
	public RoadCloseUpdate(Vector23f newPoint){
		this.point = newPoint;
	}
	
	@Override
	public NetworkUpdateType getType() {
		return NetworkUpdateType.ROAD_CLOSE;
	}
}
