package org.jrue.poc.xyzproblem;

public abstract class Draw {

	protected int scale;
	protected Letter[] letters;
		
	public Draw(int scale, Letter... letters) {
		this.scale = scale;
		this.letters = letters;
	}	

	abstract void draw();
}
