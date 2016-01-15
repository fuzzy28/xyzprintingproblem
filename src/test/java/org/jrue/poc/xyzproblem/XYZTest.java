package org.jrue.poc.xyzproblem;

public class XYZTest {

	public static void main(String[] args) {
		
		Draw draw = new Horizontal(5, new XClass(), new YClass(), new ZClass());
		draw.draw();
		draw = new Vertical(5, new XClass(), new YClass(), new ZClass());
		draw.draw();
	}
}