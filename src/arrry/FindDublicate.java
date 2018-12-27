package arrry;
public class FindDublicate {
	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50 };
		int[] b = { 20, 30, 741, 10, 65 };

		for (int i = 0; i <= a.length - 1; i++) {
			int count = 0;
			for (int j = 0; j <= b.length - 1; j++) {
				if (a[i] == b[j]) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(a[i] + " not present in arry 'b'");
			}
		}

	}

}
