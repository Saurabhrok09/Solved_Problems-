
public class FiboUsingmultiThreading {
	public static void main(String[] args) {
		Thread t1 = new FiboByTread(10);
		t1.start();
	}

}

class FiboByTread extends Thread {
	int end;

	FiboByTread(int end) {
		this.end = end;
	}

	@Override
	public void run() {
		int a, b, c;
		a = 0;
		b = 1;
		c = 1;
		System.out.println("runnn");
		System.out.println(a);
		// System.out.println(b);
		for (int i = 2; i < end; i++) {

			System.out.println(c);// 1;2
			c = a + b; // 1+1=2;3
			a = b; // 0=>1;
			b = c; // 1=>2
		}

	}

}