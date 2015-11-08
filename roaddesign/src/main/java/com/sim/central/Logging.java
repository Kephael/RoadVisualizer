package com.sim.central;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/** 
 * This class is used to statically access a {@link java.util.logging.Logger}. 
 * The logger uses a {@link java.util.logging.FileHandler} as a handler to write the log messages to a file. 
 * After displaying the log to the console, it is logged to the file specified by the {@link java.util.logging.FileHandler}.
 * @author Dahai Guo
 */

public class Logging {
	private static Logger logger = null; 
	
	public static boolean init(){
		FileHandler fh = null;
		SimpleFormatter formatterTxt = new SimpleFormatter();
		try {
			 fh = new FileHandler(
					RoadDesign.getProperty(RoadDesign.LOG_FILE_NAME)); // specifies the FileHandler write to the log file specified in the properties file 
				
			 fh.setFormatter(formatterTxt);
		} catch (SecurityException e) {
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		
		logger = Logger.getLogger("sim"); // Creates a new logger with the name "sim".
		logger.setLevel(Level.ALL);
		logger.addHandler(fh); // logs to the file specified by the FileHandler
		
		return true; // initialization was successful
	}
	
	/**
	 * @return a reference to the static logger.
	 */		
	public static Logger getLogger(){ 
		return logger;
	}
}
