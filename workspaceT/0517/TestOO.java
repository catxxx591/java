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
	//�@���h��
	static void test(Object o){
		if(o instanceof Integer){
			System.out.println("Integer���O�˴�...");
		s}
		else if(o instanceof String){
			System.out.println("String���O�˴�...");
			String s = (String)o;
			System.out.println(s.toUpperCase());
		}
		else if(o instanceof Double){
			System.out.println("Double���O�˴�...");
		}
		else{
			System.out.println("���O�˴�...");
		}
	}

}