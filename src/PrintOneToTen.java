
public class PrintOneToTen {
	static int n = 1;

	public static void run() {
		if (n <= 10) {
			System.out.println(n++);
			run();

		}

	}

	public static void main(String[] args) {

		run();

	}

}
