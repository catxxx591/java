public class TestFor2{
	static int i = 0;
	public static void main(String args[]){
		
		
		for(System.out.println("第1個區塊："+i); test() && i<3;System.out.println("第4個區塊："+i)){

			System.out.println("第3個區塊："+i);
			i++;
			
		}
	}
	
	static boolean test(){
		System.out.println("第2個區塊："+i);
		return true;
	}
	
}