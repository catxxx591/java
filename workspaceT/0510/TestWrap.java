public class TestWrap{
	public static void main(String args[]){
		Integer i1 = new Integer(127);
		Integer i2 = new Integer(127);
		//類別  物件       建構子
		int     i3 = 10;
		int     i4 = 20;
		
		System.out.println(i1);
		System.out.println(i2);
		
		System.out.println(i1.compareTo(i2));
		System.out.println(i1.MAX_VALUE);
		System.out.println(i1.MIN_VALUE);
		
		System.out.println(i1.doubleValue());
		System.out.println(i1.intValue()+i2.intValue());
		
		Integer i5 = 127;
		Integer i6 = 127;
		System.out.println(i5==i6); //-128~127
		System.out.println(i1==i2);
		
		//http://192.168.10.228:8080/
	}
}