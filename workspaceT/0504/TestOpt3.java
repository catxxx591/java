public class TestOpt3{
	public static void main(String args[]){
		//  http://192.168.10.228:8080/
		int x = 3;
		int y = 7;
		System.out.println(x++ > 3 && --y <7);
		System.out.println(x);
		System.out.println(y);
		//�޿�B��l(�u���B��l)
		//&& �@�̬�false�A�h����false
		//|| �@�̬�true �A�h����true
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