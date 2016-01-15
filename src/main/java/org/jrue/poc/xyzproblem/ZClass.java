package org.jrue.poc.xyzproblem;

public class ZClass implements Letter{

	@Override
	public void print(int scale, int row, int col) {
		  if((row + col) == scale -1
                  || row == 0 
                  || row == scale - 1) {
			    System.out.print("*");
	      } else {
	            System.out.print(" ");
	      }
	}
}