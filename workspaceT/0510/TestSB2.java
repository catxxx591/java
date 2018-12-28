public class TestSB2{
	public static void main(String args[]){
		long bt = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder("");
		
		for(int i=0;i<10000;i++){
			sb.append(i);
		}
		System.out.println(sb.toString());
		long et = System.currentTimeMillis();
		System.out.println("°õ¦æ®É¶¡¡G"+(et-bt)+"ms");
		// "" -> "0" -> "01" -> "012" 
	}
}