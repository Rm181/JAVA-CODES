public class DemoException {

	public void divide(int nr, int dr) {
		int res = nr / dr;
		System.out.println(res);
		System.out.println("Division done...");
	}

	public static void main(String[] args) {

		DemoException d = new DemoException();
		try {
			d.divide(10,0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Back in main....");

	}

}
