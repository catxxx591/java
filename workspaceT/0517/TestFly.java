public class TestFly{
	public static void main(String args[]){
		System.out.println(Fly.h);
		
		Fly f1 = new SuperMan();
		Fly f2 = new Airplane();
		f1.takeOff();
		f2.takeOff();
		
	}
}
class SuperMan implements Fly,Cloneable{
	public void takeOff(){
		System.out.println("�����_��");
	}
	public void landing(){
		System.out.println("��������");
	}
}
class Airplane implements Fly{
	public void takeOff(){
		System.out.println("�[�t�_��");
	}
	public void landing(){
		System.out.println("��t����");
	}	
}