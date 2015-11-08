package com.sim.network.update;


import com.sim.network.RoadNetwork;

public abstract class NetworkUpdateHandler {
	public static final int FAIL = -1;
	public static final int SUCCESS = 0;

	protected RoadNetwork network;
	
	public abstract boolean handle(NetworkUpdate update, RoadNetwork network);
	public abstract void cancel();

}
