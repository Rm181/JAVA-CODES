package com.abstraction;

interface Iworker{
	void work();
}

interface Printable{
	void print();
}

public class Manager {
	
	Iworker iw;
	
	public Manager(Iworker iw) {
		this.iw = iw; 
	}
	
	public void ManageWork() {
		iw.work();
	}
	
	public static void main(String[] args) {
		LazyWorker Rohit = new LazyWorker();
		SmartWorker Amar = new SmartWorker();
		ExtraOrdinaryWorker Abhishek = new ExtraOrdinaryWorker();
		
		Manager Rupesh = new Manager(Amar);
		Rupesh.ManageWork();
		
	}
	
	

}

class LazyWorker implements Iworker,Printable {

	public void work() {
		System.out.println("Lazy Worker working");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
}

class SmartWorker implements Iworker,Printable{
	public void work() {
		System.out.println("Smart Worker working");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}  
}

class ExtraOrdinaryWorker implements Iworker{
	public void work() {
		System.out.println("ExtraOrdinary Worker working");

	}
}

class OverSmartWorker implements Iworker{

	@Override
	public void work() {
		System.out.println("OverSmart Worker working");
		
	}
	
}
 