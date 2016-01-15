package org.jrue.poc.xyzproblem;

public class Vertical extends Draw {

	public Vertical(int scale, Letter... letters) {
		super(scale, letters);
	}
	
	public void draw() {		
		
		for (Letter character : letters) {
			for (int row = 0; row < scale; row++) {	
	            for (int col = 0; col < scale; col++) {
	            	character.print(scale, row, col);
	            }
	            System.out.println();
			}		
		}
	}

}
