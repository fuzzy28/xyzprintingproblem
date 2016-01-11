package org.jrue.poc.xyzproblem;

public abstract class LetterClass implements Drawable {

	protected int scale;
	protected String[][] board;
	
	
	public LetterClass(int scale) {
		if((scale < 3 || (scale % 2 == 0))) {
			System.out.println("Invalid scale, default scale will be used (3)");
			this.scale = 3;
		} else {
			this.scale = scale;
		}
		
		this.board = new String[this.scale][this.scale];
		initialzeArray();
	}
	
	private void initialzeArray() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = " ";
			}
		}
	}
	
	protected int getScale() {
		return scale;
	}
	protected void setScale(int scale) {
		this.scale = scale;
	}
	public String[][] getBoard() {
		return board;
	}
	public void setBoard(String[][] board) {
		this.board = board;
	}
	
	public void draw() {
		for (String[] str : board) {
			for (String string : str) {
				System.out.print(string);
			}
			System.out.println("");
		}
	}
	
}
