import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class TestCollection2{
	public static void main(String args[]){
		/*
		Set s = new HashSet();
		s.add("Hello");
		s.add("Hi");
		s.add("Java");
		
		Iterator it = s.iterator();
		while(it.hasNext()){
			System.out.println(((String)(it.next())).toUpperCase());
		}
		*/
		Set<String> s2 = new HashSet<String>();
		s2.add("Hello");
		s2.add("Hi");
		s2.add("Java");
		//s2.add(123);
		Iterator<String> it2 = s2.iterator();
		while(it2.hasNext()){
			System.out.println(it2.next().toUpperCase());
		}
	}
}