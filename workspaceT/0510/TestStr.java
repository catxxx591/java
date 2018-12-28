public class TestStr{
	public static void main(String args[]){
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		
		String s5 = "Hello";
		String s6 = "Java";
		String s7 = "HelloJava";
		String s8 = s5+s6;//  +隱含著new的行為
		System.out.println(s7==s8);
		
		int n = Integer.parseInt("123");
		System.out.println(n+1);
		System.out.println("Hello".charAt(0));
		System.out.println("Hello".indexOf('e'));
		System.out.println("Hello".indexOf(101));
		System.out.println("Hello".lastIndexOf('l'));
		System.out.println("Hello".substring(3));
	}
}