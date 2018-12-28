public class TestGC{
	String name;
	TestGC(String name){
		this.name = name;
		System.out.println(name+"被建立...");
	}
	protected void finalize(){
		System.out.println(name+"被回收...");
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