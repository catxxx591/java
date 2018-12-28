public class TestMobile{
	public static void main(String args[]){
		Mobile m1 = new Apple();
		Mobile m2 = new Htc();
		
		m1.conn();
		m1.disconn();
		m1.input();
		
		m2.conn();
		m2.disconn();
		m2.input();
	}
}
abstract class Mobile{
	void conn(){
		System.out.println("�s�u");
	}
	void disconn(){
		System.out.println("�_�u");
	}
	abstract void input();
}
class Apple extends Mobile{
	void input(){
		System.out.println("�n����J");
	}
}
class Htc extends Mobile{
	void input(){
		System.out.println("Ĳ�I��J");
	}
}