public class TestException3{
	public static void main(String args[]) throws Exception{
		int money = -1000;
		//....
		if(money < 0){
			throw new Exception("�����p�⦳���~...");
		}
		System.out.println("�~���G"+money);
	}
}