/* name: Owen Ma
 * date:4/7/2019
 * class: CS 211 (OAS)
 * Reason: Assignment 8, learn the concept of classes and objects
 */
import java.awt.Color;

public class Giant extends Critter{
	// field needed for counting steps
	private int count;
	public Giant () {
		count=0;
	}
	public Action getMove(CritterInfo info) {
		count++;
		if (info.getFront() == Neighbor.OTHER) {				// infect enemy in front
			return Action.INFECT;
		} else if (info.getFront()==Neighbor.EMPTY){
			return Action.HOP;
		} else {
			return Action.LEFT;
		}
	}

	public Color getColor() {
		return Color.GRAY;
	}

	public String toString() {
		String a="";
		if ( count>=0&&count<=5) {					// change "a" to designed name for each 6 steps
			a= "fee";
		} else if ( count>=6&&count<=11) {
			a= "fie";
		} else if (count>=12&&count<=17) {
			a= "foe";
		} else if (count>=18&&count<=23) {
			a= "fum";
		} else {
			a=a;
		}
		if(count>=23) {         //reset the counter back to zero after last "fum" move
			count=0;
		}
		return a;
	}
}
