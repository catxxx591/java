public class TestSB{
	public static void main(String args[]){
		long bt = System.currentTimeMillis();
		String tmp = "";
		
		for(int i=0;i<100000;i++){
			tmp = tmp + i;
		}
		long et = System.currentTimeMillis();
		
		System.out.println("����ɶ��G"+(et-bt)+"ms");
		// "" -> "0" -> "01" -> "012" 
	}
}