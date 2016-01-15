package org.jrue.poc.xyzproblem;

public abstract class Draw {

	private Draw type;
	protected int scale;
	protected Letter[] letters;
		
	public Draw(int scale, Letter... letters) {
		this.scale = scale;
		this.letters = letters;
	}	
	
	public Draw getType() {
		return type;
	}

	public void setType(Draw type) {
		this.type = type;
	}
	
	abstract void draw();
}
