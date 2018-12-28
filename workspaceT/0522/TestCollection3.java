import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;

public class TestCollection3{
	public static void main(String args[]){
		Map m = new HashMap();
		m.put("lang", "Java");
		m.put("version", 1.7);
		
		System.out.println(m);
		
		Iterator it = m.keySet().iterator();
		
		while(it.hasNext()){
			Object key = it.next();
			System.out.print( "Key:" + key +"\t,\t" );
			System.out.println("Value:" + m.get(key));
		}
		// Key: lang, Value: Java
		// Key: version, Value: 1.7
		
		//#############
		Properties ps = System.getProperties();
		Iterator it_ps = ps.keySet().iterator();
		while(it_ps.hasNext()){
			System.out.println( System.getProperty((String)(it_ps.next())));
		}
	}
}