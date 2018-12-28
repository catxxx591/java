import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class TestCollection1{
	public static void main(String args[]){
		Set s = new HashSet();
		s.add(1);
		s.add("Hello");
		s.add(2.0);
		
		System.out.println(s);
		
		Iterator it = s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		//###################
		for(Object o : s){
			System.out.print(o + "\t:\t");
			System.out.println(o instanceof String);
		}
	}
}