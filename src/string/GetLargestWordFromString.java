package string;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class GetLargestWordFromString {

	public static void main(String[] args) {
		String str ="welcome to new world";
		String s []= str.split(" ");
		HashMap<Object, Object> map = new HashMap<>();
		for(int i=0;i<=s.length-1;i++)
		{
		map.put(s[i].length(),s[i]);
		}
		Collection<Object> col =map.keySet();
		Iterator<Object> it =col.iterator();
		int big = (int)it.next();
		while(it.hasNext())
		{
			int n=(int)it.next();
			if(big<n)
			{
				big=n;
			}
		}
		System.out.println(big);
		System.out.println(map.get(big));
		

	}

}
