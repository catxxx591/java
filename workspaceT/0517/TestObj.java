public class TestObj{
	public static void main(String args[]){
		TestObj obj = new TestObj();
		TestObj obj2 = new TestObj();
		
		System.out.println(obj.toString());
		
		String s = new String("Hello");
		System.out.println(s.toString());
		
		
		System.out.println(obj == obj2);
		System.out.println(obj.equals(obj2));
		System.out.println(obj.hashCode());
		System.out.println(obj2.hashCode());
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		String s3 = "Hello";
		String s4 = "Hello";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
	}
	
	public String toString(){
		return "Object物件被叫用...";
	}
}