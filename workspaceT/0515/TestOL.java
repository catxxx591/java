public class TestOL{
	public static void main(String args[]){
		
		test("");
		test(0);
		test(false);
		System.out.println(sum(10,20,30,40,50));
	}
	
	static void test(boolean b){
		System.out.println("test(boolean)被叫用...");
	}
	static void test(int     i){
		System.out.println("test(int)被叫用...");
	}
	static void test(String  s){
		System.out.println("test(String)被叫用...");
	}
	
	static int sum(int... ns){
		int s = 0;
		//for(int n : ns){
		//	s+= n;
		//}
		for(int i=0;i<ns.length;i++){
			s+=ns[i];	
		}
		return s;
	}

}