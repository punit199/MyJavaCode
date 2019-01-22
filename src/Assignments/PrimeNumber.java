package Assignments;

public class PrimeNumber {
	static int n = 2;

	public static void getNumber() {
		int count = 0;
		if (n < 100) {
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(n + "  not a prime number");
			}
			n++;
			getNumber();
		}
	}

	public static void main(String[] args) {
		getNumber();

	}

}