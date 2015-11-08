package com.sim.io.exporters;

import java.io.FileNotFoundException;


public abstract class IntersectionExporter {
	/**
	 * Used to export intersection(s). 
	 * 
	 * @param filename file name where to export the intersection model
	 * @throws FileNotFoundException
	 */
	public abstract void export(String filename) throws FileNotFoundException;
}
