//http://192.168.10.228:8080/
public class Mom extends Thread{
	public void run(){
		Son s = new Son();
		
		System.out.println("�����ǳƪ��f�X����");
		System.out.println("�����o�{�S���f�X��");
		System.out.println("�Ш�l�R�f�X��");
		
		s.start();
		try{s.join();}catch(InterruptedException ie){}
		
		System.out.println("����f�X��");
		System.out.println("���������f�X����");
	}
	public static void main(String args[]){
		Mom m = new Mom();
		m.start();
	}
}
class Son extends Thread{
	public void run(){
		System.out.println("\t�X�o�R�f�X��");
		System.out.println("\t�R��f�X��");
	}
}