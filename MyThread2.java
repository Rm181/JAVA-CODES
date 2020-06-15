public class MyThread2 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				
				if (i == 2) {
					Thread.yield();
				} else {
					Thread.sleep(200);
					System.out.println(i + " "
							+ Thread.currentThread().getName());
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {

		MyThread2 t1 = new MyThread2();
		MyThread2 t2 = new MyThread2();

		t1.start();
		t1.setName("T1");
		t1.interrupt();
		t2.start();
		t2.setName("T2");

	}

}
