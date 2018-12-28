public class TestException3{
	public static void main(String args[]) throws Exception{
		int money = -1000;
		//....
		if(money < 0){
			throw new Exception("錢的計算有錯誤...");
		}
		System.out.println("薪水："+money);
	}
}