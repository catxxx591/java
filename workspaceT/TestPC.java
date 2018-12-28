public class TestPC extends Thread{
	public void run(){
		String str="";
		for(int i=0;i>=0;i++){
			str+=i;
			System.out.println(Thread.currentThread().getName()+":"+str);

		}
	}
	TestPC(String name){
		super(name);
	}
	public static void main(String args[]){
		int count=0;
		while(true){
			TestPC t = new TestPC("t" + ++count);
			t.start();
		}
	}
	
}