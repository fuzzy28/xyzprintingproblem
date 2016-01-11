package org.jrue.poc.xyzproblem;

import java.util.ArrayList;
import java.util.List;

public class XYZTest {

	public static void main(String[] args) {
		
		int scale = 21;
		List<LetterClass> letters = new ArrayList<LetterClass>();
		letters.add(new XClass(scale));
		letters.add(new YClass(scale));
		letters.add(new ZClass(scale));
		
		System.out.println("Vertical");
		for (Drawable letterClass : letters) {
			letterClass.draw();
		}
		
		System.out.println("Horizontal");		
		HorizontalAdapter horizontal = new HorizontalAdapter(letters);
		horizontal.draw();
	}
}