public class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " " + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {

		MyThread t1 = new MyThread();
		t1.start();
		t1.setName("T1");
		MyThread t2 = new MyThread();
		t2.start();
		t2.setName("T2");
		System.out.println("Main Thread..");
		System.out.println("Main Method..");
		System.out.println("Main Callinmg..");

	}

}
