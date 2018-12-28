public class TestException{
	public static void main(String args[]){
		try{
			int num = Integer.parseInt(args[0]);
			System.out.println(100/num);
		}
		catch(ArrayIndexOutOfBoundsException aie){
			System.out.println("叫块把计...");
		}
		catch(NumberFormatException nfe){
			System.out.println("叫块计篈把计...");
		}
		catch(ArithmeticException ae){
			System.out.println("叫块獶箂计把计...");
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
//タ盽挡狦