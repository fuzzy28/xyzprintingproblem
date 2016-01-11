package org.jrue.poc.xyzproblem;

public class YClass extends LetterClass {

	public YClass(int scale) {
		super(scale);
	}

	@Override
	public void draw() {
		int diag = 0;
		int antiDiag = board[0].length - 1;
		for (int i = 0; i < board.length; i++) {			
			if(i < (board.length / 2)) {
				while(diag < board[i].length) {
					board[i][diag++] = "*";
					break;
				}
				
				while(antiDiag < board[i].length) {
					board[i][antiDiag--] = "*";
					break;
				}
			} else {
				board[i][(board[i].length -1) / 2] = "*";
			}
		}
		super.draw();
	}
}