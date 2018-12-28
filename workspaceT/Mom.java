//http://192.168.10.228:8080/
public class Mom extends Thread{
	public void run(){
		Son s = new Son();
		
		System.out.println("媽媽準備炒番茄炒飯");
		System.out.println("媽媽發現沒有番茄醬");
		System.out.println("請兒子買番茄醬");
		
		s.start();
		try{s.join();}catch(InterruptedException ie){}
		
		System.out.println("拿到番茄醬");
		System.out.println("媽媽完成番茄炒飯");
	}
	public static void main(String args[]){
		Mom m = new Mom();
		m.start();
	}
}
class Son extends Thread{
	public void run(){
		System.out.println("\t出發買番茄醬");
		System.out.println("\t買到番茄醬");
	}
}