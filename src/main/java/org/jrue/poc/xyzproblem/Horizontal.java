package org.jrue.poc.xyzproblem;

public class Horizontal extends Draw {

	public Horizontal(int scale, Letter... letters) {
		super(scale, letters);		
	}

	public void draw() {
		for (int row = 0; row < scale; row++) {
			for (Letter letter : letters) {
	            for (int col = 0; col < scale; col++) {
	                  letter.print(scale, row, col);                 
	            }
			}
			System.out.println();
		}
	}
}