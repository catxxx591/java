public class TestArray4{
	public static void main(String args[]){
		//int�@���}�C�O��int�Ҳզ�
		//int�G���}�C�O��int�@���}�C�Ҳզ�
		
		//int[]   �O�� int   �Ҳզ�
		//int[][] �O�� int[] �Ҳզ�
		
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