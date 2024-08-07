package com.fusion.multithreading;
 class Test1 {
	 int n;
	 
	 boolean f=false ;
	synchronized void printEven(int n) {
		 if(f) {
			 try {
				 wait();
				 
			 }catch(InterruptedException e) {
				 e.printStackTrace();
			 }
		 }
		 this.n=n;
		 System.out.println("Even number:"+this.n);
		 f=true;
		 notify();
		 
 }
	 
	 synchronized void printOdd(int n) {
		 if(!f) {
				try {
					wait();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				}
				this.n=n;
				System.out.println("Odd Number: "+this.n);
				f=false;
				notify();
	 }
 }

class EvenThread extends  Thread{
	
	Test1 t;
	public EvenThread(Test1 t) {
		this.t=t;
		
	}
	
	
	public void run() {
		for(int i=0;i<=8;i+=2) {
			t.printEven(i);
		}
	}
}

class OddThread extends Thread{
	Test1 t;
	public OddThread(Test1 t) {
		this.t=t;
	}
	public void run() {
		
		for(int i=1;i<=8;i+=2) {
			t.printOdd(i);
		}
	}
}



public class Assign2 {
	public static void main(String[]args) {
		Test1 t1=new Test1();
		EvenThread et=new EvenThread(t1);
		OddThread ot=new OddThread(t1);
		et.start();
		ot.start();

	}
	
}

 
