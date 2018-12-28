public class TestOpt3{
	public static void main(String args[]){
		//  http://192.168.10.228:8080/
		int x = 3;
		int y = 7;
		System.out.println(x++ > 3 && --y <7);
		System.out.println(x);
		System.out.println(y);
		//邏輯運算子(短路運算子)
		//&& 一者為false，則全為false
		//|| 一者為true ，則全為true
		x = 3;
		y = 7;
		System.out.println(++x > 3 || y-- <7);
		System.out.println(x);
		System.out.println(y);
		
		x = 3;
		y = 7;
		System.out.println(x++ > 3 & --y <7);
		System.out.println(x);
		System.out.println(y);
		
		x = 3;
		y = 7;
		System.out.println(++x > 3 | y-- <7);
		System.out.println(x);
		System.out.println(y);
		
	}
}