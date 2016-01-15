package org.jrue.poc.xyzproblem;

public class XClass implements Letter {

	@Override
	public void print(int scale, int row, int col) {
		if(row == col || (row + col) == scale -1) {
			System.out.print("*");
		} else {
			System.out.print(" ");
		}
	}

}