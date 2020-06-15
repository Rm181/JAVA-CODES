

public class MyThread1 implements Runnable {

	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i + " " + Thread.currentThread().getName());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		MyThread1 mythread1 = new MyThread1();

		Thread t1 = new Thread(mythread1, "T1");
		t1.start();
		t1.setPriority(10);

		Thread t2 = new Thread(new MyThread1(), "T2");
		t2.start();

	}

}
