public class TestOpt{
	public static void main(String args[]){
		System.out.println(7+3);
		System.out.println(7-3);
		System.out.println(7*3);
		System.out.println(7/3);
		System.out.println(7%3);
		
		System.out.println(10/3);
		System.out.println(10/3.0);
		System.out.println((double) 10/3 );
		System.out.println((double)(10/3));
		
		byte b = (byte)129;
		System.out.println(b);
		
		System.out.println( (char)('A' + 1) );
		System.out.println( (int)'a' );
		
		long l = 3123456789L;
		System.out.println(l);
		
		
		System.out.println(10 >  5);
		System.out.println(10 >= 5);
		System.out.println(10 <  5);
		System.out.println(10 <= 5);
		System.out.println(10 == 5);
		System.out.println(10 != 5);
		
		int nums = 10;
		System.out.println(nums =  5);
		System.out.println(nums == 5);
		
		int number = 75;
		System.out.println(number > 70 && number <80);
		System.out.println(number > 80 || number <75);
		System.out.println(number > 75 || number <80);
		System.out.println(!(number > 75 || number <80));
		
		System.out.println(3 & 7);
		System.out.println(3 | 7);
		System.out.println(6 & 9);
		System.out.println(6 | 9);
		System.out.println(3 ^ 7);
		System.out.println(6 ^ 9);
		System.out.println( ~3 );
		System.out.println( Integer.toBinaryString(~3) );
		System.out.println( "000000000000000000000000000000"+Integer.toBinaryString(3) );
		//  3       00000000000000000000000000000011
		// ~3       11111111111111111111111111111100  -4
		
		//  4       0100
		System.out.println(4 << 2); //  0100 00
		System.out.println(4 >> 2); //    01 00
		
		System.out.println(-4 >>> 2);
		System.out.println(-4 >>  2);
		//  11111111111111111111111111111100
		//    111111111111111111111111111111
	}
}