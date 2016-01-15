package org.jrue.poc.xyzproblem;

public class YClass implements Letter {

	@Override
	public void print(int scale, int row, int col) {
		  if(((row == col || (row + col) == scale -1)
	                && (scale / 2 > row))
	                || (scale / 2 <= row && col == scale /2 )) {
	        	  System.out.print("*");
		  } else {
		          System.out.print(" ");
		  }
	}

}