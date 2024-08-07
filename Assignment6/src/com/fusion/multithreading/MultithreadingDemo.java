package com.fusion.multithreading;


class Test extends Thread{
	
 public void run() {
		 System.out.println("In child Thread:");
		
	}
}

public class MultithreadingDemo {
	public static void main(String[]args) {
		
		Test obj=new Test();
		obj.start();
		System.out.println("In Main Thread");
	}

}
