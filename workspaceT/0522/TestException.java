public class TestException{
	public static void main(String args[]){
		try{
			int num = Integer.parseInt(args[0]);
			System.out.println(100/num);
		}
		catch(ArrayIndexOutOfBoundsException aie){
			System.out.println("�п�J�Ѽ�...");
		}
		catch(NumberFormatException nfe){
			System.out.println("�п�J�Ʀr���A���Ѽ�...");
		}
		catch(ArithmeticException ae){
			System.out.println("�п�J�D�s���Ʀr�Ѽ�...");
		}

	}
}
//java TestException
//ArrayIndexOutOfBoundsException

//java TestException aaa
//NumberFormatException

//java TestException 0
//ArithmeticException

//java TestException 5
//���`���G