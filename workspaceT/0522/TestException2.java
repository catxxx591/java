public class TestException2{
	public static void main(String args[]){
		try{
			int num = Integer.parseInt(args[0]);
			System.out.println(100/num);
			System.out.println("1.�{�����槹��...");
		}
		catch(ArrayIndexOutOfBoundsException aie){
			System.out.println("2.�o�ͨҥ~...");
		}
		catch(NumberFormatException nfe){
			System.out.println("3.�o�ͨҥ~...");
		}
		finally{
			System.out.println("4.�@�w�|����!!");
		}
		System.out.println("5.�ҥ~������...");

	}
}