public class TestOpt2{
	public static void main(String args[]){
		int i = 5;
		System.out.println(i++); // System.out.println(i); i = i+1;
		System.out.println(i);
		
		int j = 5;
		System.out.println(++j); // j = j+1; System.out.println(j);
		System.out.println(j);
		
		int m = 5;
		System.out.println(m--); 
		System.out.println(m);
		
		int n = 5;
		System.out.println(--n); 
		System.out.println(n);
		
		int a = 5;
		System.out.println(a++ + --a + a-- + ++a);
		//       取得的a值 5     5     5     5
		//       真實的a值 6     5     4     5
	}
}