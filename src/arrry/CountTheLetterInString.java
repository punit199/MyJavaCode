package arrry;

import java.util.HashMap;

public class CountTheLetterInString {
	static String str = "javaa";
	static HashMap<Character, Integer> map;
	static int i;

	public static int countLeter(char ch) {
		int count = 0;
		for (int j = 0; j <= str.length() - 1; j++) {
			if (ch == str.charAt(j)) {
				count++;
			}

		}
		return count;
	}

	public static void main(String[] args) {
		map = new HashMap<Character, Integer>();
		for (i = 0; i <= str.length() - 1; i++) {
			map.put(str.charAt(i), countLeter(str.charAt(i)));
		}
		System.out.println(map);

	}

}
