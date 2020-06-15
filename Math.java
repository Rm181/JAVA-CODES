public class Math {

	public void add(int x, int y) {
		System.out.println(x + y);
	}

	public void add(float x, float y) {
		System.out.println(x + y);
	}

	public void add(String x, String y) {
		System.out.println(x + "-" + y);
	}

	public void add(int x, float y) {
		System.out.println(x + y);
	}

	public void add(float x, int y) {
		System.out.println(x + y);
	}

	public int add(int x, int y, int z) {
		System.out.println(x + y + z);
		return x + y + z;
	}

//	public int add(int x, int y) {
//		return x + y;
//	}

	public static void main(String[] args) {
		Math m1 = new Math();
		m1.add(2.5f, 3.9f);
		m1.add(2.5f, 3);
		m1.add("Hello", "World");
	}

}
