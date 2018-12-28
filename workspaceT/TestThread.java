public class TestThread extends Thread{
	public void run(){
		for(int i=0;i<50;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);

		}
	}
	TestThread(String name){
		super(name);
	}
	
	
	public static void main(String args[]){
		TestThread t1 = new TestThread("t1");
		TestThread t2 = new TestThread("t2");
		
		//t1.run();
		//t2.run();
		t1.start();
		t2.start();
	}
	
}