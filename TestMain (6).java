package com.rtp;

public class TestMain {

	public void displaySalary(Employee e) {
		System.out.println(e.calSalary());
	}
	
	
	public Employee getEmployee(){
		return new SalesManager(101,"Captian",10000,100,100);
	}

	public static void main(String[] args) {

//		Employee e = new Manager(1, "Dr Banner", 10000,100,100,100);
//		Manager m = (Manager) e;
//		if(m instanceof Employee){
//			System.out.println(m.calIncentive());	
//		}
		
		TestMain t = new TestMain();
		Employee e = t.getEmployee();
		System.out.println(e);
		

	}

}

// public static void main(String[] args) {
//
// TestMain t = new TestMain();
// Employee ref = new Manager(105, "Tony", 10000, 100, 100, 100);
// Employee ref1 = new SalesManager(111, "Steve Rogers", 15000, 500, 500);
// t.displaySalary(ref1);
// if(ref instanceof SalesManager){
// System.out.println(true);
// }else{
// System.out.println(false);
// }
//
//
// }
