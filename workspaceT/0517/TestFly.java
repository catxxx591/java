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
		System.out.println("垂直起飛");
	}
	public void landing(){
		System.out.println("垂直降落");
	}
}
class Airplane implements Fly{
	public void takeOff(){
		System.out.println("加速起飛");
	}
	public void landing(){
		System.out.println("減速降落");
	}	
}