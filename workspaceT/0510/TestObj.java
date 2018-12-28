public class TestObj{
	public static void main(String args[]){
		//                 跟記憶體要空間
		java.util.Date date = new java.util.Date();
		//        類別 物件                 建構子
		System.out.println(date.toString());
		
		String str = "Java";
		//類別 物件
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.length());
		System.out.println(str.replace("J","L"));
		System.out.println(str.substring(2));
	}
}