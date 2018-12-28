public class TestArray{
	public static void main(String args[]){
		//1.宣告   2.放值
		int age1 = 18;
		int age2 = 25;
		int age3 = 20;
		int age4 = 33;
		int age5 = 38;
		//3.使用
		System.out.println(age1);
		System.out.println(age2);
		System.out.println(age3);
		System.out.println(age4);
		System.out.println(age5);
		
		//*******************************
	//      陣列名稱
		int[] ages = new int[10];
	//int一維陣列        5個int的陣列空間
		ages[0] = 18;
		ages[1] = 25;
		ages[2] = 20;
		ages[3] = 33;
		ages[4] = 38;
		
		for(int i=0;i< ages.length ;i++){
			System.out.println(ages[i]);
		}
		
		//*******************************
		int[] agess = {118,125,120,133,138};
		for(int i=0;i< agess.length ;i++){
			System.out.println(agess[i]);
		}
		//System.out.println(agess[5]);
		
		//*******************************
		int[] agesss = new int[]{18,25,20,33,38};
		for(int i=0;i< agesss.length ;i++){
			System.out.println(agesss[i]);
		}
		
		//*******************************
		System.out.println(ages[0]);
		System.out.println(ages[1]);
		System.out.println(ages[2]);
		System.out.println(ages);
	}
}