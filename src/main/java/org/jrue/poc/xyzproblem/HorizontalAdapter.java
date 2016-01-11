package org.jrue.poc.xyzproblem;

import java.util.List;

public class HorizontalAdapter implements Drawable{

		
	private List<LetterClass> letters;
	
	public HorizontalAdapter(List<LetterClass> letters) {
		this.letters = letters;
	}

	@Override
	public void draw() {
		int scale = letters.get(0).getScale();
		int rowCtr = 0;
		for (int i = 0; i < scale; i++) {
			for (int letter = 0; letter < letters.size(); letter++) {
				String[][] arrayLetter = letters.get(letter).getBoard();				
				for (int cols = 0; cols < arrayLetter[rowCtr].length; cols++) {
					System.out.print(arrayLetter[rowCtr][cols] + "");
				}			
			}
			rowCtr++;
			System.out.println("");
		}
	}
}