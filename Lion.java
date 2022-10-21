/* name: Owen Ma
 * date:4/7/2019
 * class: CS 211 (OAS)
 * Reason: Assignment 8, learn the concept of classes and objects
 */
import java.awt.Color;
import java.util.*;

public class Lion extends Critter{
	// fields needed for random calculations, counting steps for color change
	private Random r= new Random();
	private int count;
	private Color currentColor;
	
	public Lion () {
		count=0;
	}
	public Action getMove(CritterInfo info) {
		count++;
		if (info.getFront() == Neighbor.OTHER) {				// infect if an enemy in front
			return Action.INFECT;
		} else if ( info.getFront()==Neighbor.WALL || info.getRight()==Neighbor.WALL){ //turn right if a wall is in front or to the right 
			return Action.LEFT;
		} else if(info.getFront()==Neighbor.SAME) {				// turn right if a fellow lion is in front
			return Action.RIGHT;
		} else {												// else hop
			return Action.HOP;
		}
	}

	public Color getColor() {
		int a=r.nextInt(3);
		if (count%3==0) {							// randomly change color every three steps
			if (a==0) {
				currentColor= Color.RED;
				return currentColor;
			} else if(a==1) {
				currentColor= Color.BLUE;
				return currentColor;
			} else {
				currentColor= Color.GREEN;
				return currentColor;
			}
		} else {									// return current color if not a third step
			return currentColor;
		}
	}

	public String toString() {
		return "L";
	}
}
