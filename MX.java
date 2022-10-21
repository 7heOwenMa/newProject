/* name: Owen Ma
 * date:4/7/2019
 * class: CS 211 (OAS)
 * Reason: Assignment 8, learn the concept of classes and objects
 */
import java.awt.Color;

public class MX extends Critter{
	public Action getMove(CritterInfo info) {
		if (info.getFront() == Neighbor.OTHER) {		// infect if an enemy is in front
			return Action.INFECT;
		} else {										// otherwise turn left
			return Action.LEFT;
		}
	}

	public Color getColor() {
		return Color.BLACK;
	}

	public String toString() {	
		return "MX";
	}
}
