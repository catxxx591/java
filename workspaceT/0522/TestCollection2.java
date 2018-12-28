import java.util.List;
import java.util.ArrayList;

public class TestCollection2{
	public static void main(String args[]){
		List s = new ArrayList();
		
		s.add(1);
		s.add("Hello");
		s.add(2.0);
		
		s.add(1);
		
		System.out.println(s);
		for(int i=0;i<s.size();i++){
			System.out.println(s.get(i));
		}
		//###################
		for(Object o : s){
			System.out.print(o + "\t:\t");
			System.out.println(o instanceof String);
		}
	}
}