package com.sim.gui;
import java.awt.Graphics;

import javax.swing.JPanel;

import com.sim.central.RoadDesign;


/**
 * This panel is for viewing set of 3D points, whose span on the z axis
 * is much less than the one on either x or y axis.
 *  
 * @author Owner
 *
 */
public class JRoadDesignPanel extends JPanel{
	
	protected void paintComponent(Graphics g){
		g.clearRect(0, 0, this.getWidth(), this.getHeight());
		RoadDesign.draw(g);
	}
}
