public class TestFor2{
	static int i = 0;
	public static void main(String args[]){
		
		
		for(System.out.println("��1�Ӱ϶��G"+i); test() && i<3;System.out.println("��4�Ӱ϶��G"+i)){

			System.out.println("��3�Ӱ϶��G"+i);
			i++;
			
		}
	}
	
	static boolean test(){
		System.out.println("��2�Ӱ϶��G"+i);
		return true;
	}
	
}