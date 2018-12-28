public class TestArgs{
	public static void main(String args[]){
		//System.out.println(args[0]);
		//java TestArgs 123
		//java TestArgs 123 456 789
		
		String Answer = "A,B,A,D,C";
		
		String[] Ans  = Answer.split(",");

		for(String A:Ans){
			System.out.println(A);
		}
	}
}