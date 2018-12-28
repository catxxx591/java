public class TestException2{
	public static void main(String args[]){
		try{
			int num = Integer.parseInt(args[0]);
			System.out.println(100/num);
			System.out.println("1.程式執行完畢...");
		}
		catch(ArrayIndexOutOfBoundsException aie){
			System.out.println("2.發生例外...");
		}
		catch(NumberFormatException nfe){
			System.out.println("3.發生例外...");
		}
		finally{
			System.out.println("4.一定會執行!!");
		}
		System.out.println("5.例外受控制...");

	}
}