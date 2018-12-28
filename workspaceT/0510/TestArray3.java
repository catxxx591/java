public class TestArray3{
	public static void main(String args[]){
		int[] arr1 = {1,2,3,4,5};
		
		int[] tmp1 = {1,2,3,4,5};
		int[] tmp2 = arr1;
		
		tmp1[2] = 30;
		
		for(int i =0;i<tmp2.length; i++){
			System.out.println(tmp2[i]);
		}
	}
}