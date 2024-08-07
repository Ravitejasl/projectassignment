package com.fusion.multithreading;

class Company {
	int n;
	boolean f=false;
	synchronized public void produce_item(int n){
		if(f) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			
			}
		this.n=n;
		System.out.println("Producer:"+this.n);
		f=true;
		notify();
		}
		

}

synchronized public void consume_item() {
	if(!f) {
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	System.out.println("Consumer:" +this.n);
	f=false;
	notify();
}
}

class Producer extends Thread{
	Company c;

	public Producer(Company c) {
		this.c = c;
	}

	public void run() {
		int i = 1;
		while (true) {
			c.produce_item(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			i++;
		}
	}
	
	
}

class Consumer extends Thread{

	Company c;

	public Consumer(Company c) {
		this.c = c;
	}

	public void run() {
		int i = 1;
		while (true) {
			c.consume_item();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			i++;
		}
	}
	
	
}
    public class CustomerProducer {
	public static void main(String[] args) {
	Company com=new Company();
	Producer p1=new Producer(com);
	Consumer c1=new Consumer(com);
	p1.start();
	c1.start();

	}

    }

