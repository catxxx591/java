public class TestObj{
	public static void main(String args[]){
		//                 ��O����n�Ŷ�
		java.util.Date date = new java.util.Date();
		//        ���O ����                 �غc�l
		System.out.println(date.toString());
		
		String str = "Java";
		//���O ����
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.length());
		System.out.println(str.replace("J","L"));
		System.out.println(str.substring(2));
	}
}