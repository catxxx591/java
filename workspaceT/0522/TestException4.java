public class TestException4{
	public static void main(String args[]){
		try{
			int num = Integer.parseInt(args[0]);
			System.out.println(100/num);
			System.out.println("1.�{�����槹��...");
		}
		/*
		catch(Exception e){
			System.out.println("�����O��Exception");
		}
		catch(ArrayIndexOutOfBoundsException aie){
			System.out.println("2.�o�ͨҥ~...");
			//aie.printStackTrace();
			System.out.println(aie.toString());
			System.out.println(aie.getMessage());
			System.out.println(aie.getLocalizedMessage());
		}
		catch(NumberFormatException nfe){
			System.out.println("3.�o�ͨҥ~...");
			nfe.printStackTrace();
		}
		*/
		finally{
			System.out.println("4.�@�w�|����!!");
		}
		System.out.println("5.�ҥ~������...");

	}
}