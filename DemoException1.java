public class DemoException1 {

	public void method() {
		int res = 5 / 2;
		int ar[] = new int[5];
		ar[4] = 25;
		System.out.println(ar[4]);
	}

	public static void main(String[] args) {
		DemoException1 de = new DemoException1();
		try {
			de.method();
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			System.out.println("Finally block ");
		}

		System.out.println("Back in main...");

	}
}
