import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class TestCollection{
	public static void main(String args[]){
		Set s = new HashSet();
		s.add(new Integer(10));
		s.add(new Double(3.14));
		s.add(new Boolean(true));
		System.out.println(s);
		Iterator it = s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		List list = new ArrayList();
		list.add(new Integer(10));
		list.add(new Double(3.14));
		list.add(new Boolean(true));
		System.out.println(list);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		Map m = new HashMap();
		m.put("lang","Java");
		m.put("version",1.8);
		System.out.println(m);
		Iterator itm = m.keySet().iterator();
		while(itm.hasNext()){
			Object key = itm.next();
			System.out.print("key:"+key+",");
			System.out.println("value:"+ m.get(key) );
		}
	}
}