import java.util.LinkedHashMap;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {

        LinkedHashMap  hp = new LinkedHashMap();
        hp.put(1,"apple");
        hp.put("green apple",1);
        hp.put(null,null);
        
        System.out.println(hp.get(1));
        Set s =hp.keySet();

        for(Object st :s)
        {
        	System.out.println(st);
        }
        System.out.println(s);
        System.out.println(hp.entrySet());
	}

}
