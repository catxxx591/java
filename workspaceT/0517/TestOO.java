public class TestOO{
	public static void main(String args[]){
		Object o = new String("Hello");
		System.out.println(o.toString());
		String s = (String)o;
		System.out.println(s.toUpperCase());

		test(new Integer(10));
		test(new String("Java"));
		test(new Double(10.0));
		test(new Float(20.0));
	}
	//一式多型
	static void test(Object o){
		if(o instanceof Integer){
			System.out.println("Integer類別檢測...");
		s}
		else if(o instanceof String){
			System.out.println("String類別檢測...");
			String s = (String)o;
			System.out.println(s.toUpperCase());
		}
		else if(o instanceof Double){
			System.out.println("Double類別檢測...");
		}
		else{
			System.out.println("類別檢測...");
		}
	}

}