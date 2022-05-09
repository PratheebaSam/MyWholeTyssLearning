package com.tyss.javalearning;

/* if we extends one class with another class the things present in that class will be accessible by this class
 */

/*Sub class*/

public class SmartPhone extends Phone{
	int camera;
	int cameraCount;
	
	public SmartPhone(int price,int ram,int c,int d) {
		super(price,ram);
		camera=c;
		cameraCount=d;
		System.out.println("subclass loaded.........");
	}

	
	public SmartPhone(int price,int ram) {
		super(price,ram);
		//camera=camera;
		//cameraCount=cameraCount;
		System.out.println("subclass loaded");
		
	} 
	
	public void play() {
		System.out.println("playing chess");
	}
	public void selfie() {
		System.out.println("taking selfie with my dude");
	}

}
