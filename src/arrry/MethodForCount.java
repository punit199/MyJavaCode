package arrry;

import java.util.HashMap;

public class MethodForCount {
	HashMap<Character,Integer> map = new HashMap<Character,Integer>();
	String word;
	public MethodForCount(String word) {
		this.word = word;
		for(int i=0;i<=word.length()-1;i++)
		{
			map.put(word.charAt(i),countLeter(word.charAt(i)));
		}
		System.out.println(map);
	}
	public  int countLeter(char ch) {
		int count = 0;
		for (int j = 0; j <= word.length() - 1; j++) {
			if (ch == word.charAt(j)) {
				count++;
			}

		}
		return count;
	}
}
