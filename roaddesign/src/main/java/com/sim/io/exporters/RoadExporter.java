package com.sim.io.exporters;

import java.io.FileNotFoundException;


public abstract class RoadExporter {
	/**
	 * Used to export road(s).
	 * 
	 * @param filename file name where to export the road model.
	 * @throws FileNotFoundException
	 */
	public abstract void export(String filename) throws FileNotFoundException;
}
