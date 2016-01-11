package org.jrue.poc.xyzproblem;

public class ZClass extends LetterClass {

	public ZClass(int scale) {
		super(scale);		
	}

	@Override
	public void draw() {	
		int antiDiag = board[0].length - 1;		
		for (int i = 0; i < board.length; i++) {
			while(antiDiag < board[i].length) {
				board[i][antiDiag--] = "*";
				break;
			}
			if(i == 0 || i == (board[0].length - 1)) {
				for (int j = 0; j < board[i].length; j++) {
					board[i][j] = "*";
				}
			}
		}
		super.draw();
	}
	
}