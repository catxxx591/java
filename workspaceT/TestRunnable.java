public class TestRunnable implements Runnable{
	public void run(){
		for(int i=0;i<50;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
			try{Thread.sleep(1000);}catch(InterruptedException ie){System.out.println("³Q¤¤Â_¤F...");}
		}
	}
	
	public static void main(String args[]){
		TestRunnable r1 = new TestRunnable();
		Thread t1 = new Thread(r1,"t1");
		t1.start();
		//t1.interrupt();
		
		TestRunnable r2 = new TestRunnable();
		Thread t2 = new Thread(r2,"t2");
		t2.start();
	}
}