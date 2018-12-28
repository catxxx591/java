public class TestArray4{
	public static void main(String args[]){
		//int一維陣列是由int所組成
		//int二維陣列是由int一維陣列所組成
		
		//int[]   是由 int   所組成
		//int[][] 是由 int[] 所組成
		
		int[] nums = {1,2,3,4,5};
		
		for(int n:nums){
			System.out.println(n);
		}
		
		int[][] arr = {{1,2,3},{4,5,6}};
		
		for(int[] ar:arr){
			for(int a:ar){
				System.out.println(a);
			}
		}
	}
}