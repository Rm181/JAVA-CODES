package com.inherit;

   public class TestMain {
	
	public static void main(String[] args) {
	Manager m1 = new Manager();  //object of manager
		Manager m = new Manager(101,"Pratik",25000,100,100,100); //call of para of manager
//		double incentive = m.calIncentive();
//		System.out.println("Incentive :"+incentive);
		//m.calIncentive();
		
		Manager R = new Manager(1, "Stark", 10000, 100, 100, 100);
		System.out.println(R.calSalary());
		//System.out.println(R.showName());
		
		
		
		
		
		
		
	}

}
