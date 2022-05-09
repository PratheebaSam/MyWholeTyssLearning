package com.tyss.basicjava;

public class checking {
	int x=10;
	static int y=20;
	public static void main(String[] args) {
		checking checking = new checking();
		System.out.println(checking.x);//10
		System.out.println(checking.y);	//20
		
		
		checking checking1 = new checking();
		checking1.x=100;
		checking1.y=400;
		System.out.println(checking1.x+" "+checking.x);//100 10 because the variable is not bound to class so the value is stored in heap memory.
		System.out.println(checking1.y+" "+checking.y);//400 400 because the variable is bound with class so the value is stored in method area and the 
		//ref is present in heap memory.
		
		checking checking2 = new checking();
		checking2.x=1000;
		checking2.y=4000;
		System.out.println(checking1.x+" "+checking.x);//100 10 because the variable is not bound to class so the value is stored in heap memory.
		System.out.println(checking1.y+" "+checking.y);
	}
}
