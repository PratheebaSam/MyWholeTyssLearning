package com.tyss.javalearning;

public class ControlFlowSwitch {
	
	/*switch takes the direct values given in the brace
	 it might be integer,string,enum
	 */
	public static void main(String[] args) {
		int x=3;
		switch(x) {
		case 1:
			System.out.println("go to ooty");
			break;
		case 2:
			System.out.println("go to shimla");
			break;
		case 3:
			System.out.println("go to darzling");
			break;
		default:
			System.out.println("go to home and enjoy with your family");
		}
		System.out.println("program end");
	}
	
	
	
}
