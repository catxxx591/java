public class TestGC{
	String name;
	TestGC(String name){
		this.name = name;
		System.out.println(name+"�Q�إ�...");
	}
	protected void finalize(){
		System.out.println(name+"�Q�^��...");
	}
	public static void main(String args[]){
		
		//System.gc();
		int count = 0;
		while(true){
			TestGC t = new TestGC("t"+ ++count );
			t = null;
		}
	}
}