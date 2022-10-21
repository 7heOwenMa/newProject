/* name: Owen Ma
 * date:4/7/2019
 * class: CS 211 (OAS)
 * Reason: Assignment 8, learn the concept of classes and objects
 */

import java.awt.*;


public class Bear extends Critter {
	// fields needed for bear types and to String
	private boolean polar;
	private String toStr;

	public Bear (boolean polar){

		this.polar=polar;							
		this.toStr="/";
	}

	public Action getMove(CritterInfo info) {

		if (this.toStr.equals("/")) {					// half polar bear and half black bear
			this.toStr="\\";
		} else {
			this.toStr="/";
		}
		if (info.getFront() == Neighbor.OTHER) {		// infect if an enemy in front
			return Action.INFECT;
		} else if( info.getFront()== Neighbor.EMPTY && info.getFront() != Neighbor.WALL) {		// hop if possible
			return Action.HOP;
		} else {										// otherwise turn left
			return Action.LEFT;
		}
	}

	public Color getColor() {						

		if( this.polar) {								// determine if a bear is polar or not
			return Color.WHITE;	
		} else {
			return Color.BLACK;
		}
	}

	public String toString() {
		return this.toStr;
	}
}
