package org.jrue.poc.xyzproblem;

public class XClass extends LetterClass {

	public XClass(int scale) {
		super(scale);
	}

	@Override
	public void draw() {
		int diag = 0;
		int antiDiag = board[0].length - 1;		
		for (int i = 0; i < board.length; i++) {
			while(diag < board[i].length) {
				board[i][diag++] = "*";
				break;
			}
			
			while(antiDiag < board[i].length) {
				board[i][antiDiag--] = "*";
				break;
			}
		}
		super.draw();
	}
}