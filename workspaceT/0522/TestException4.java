public class TestException4{
	public static void main(String args[]){
		try{
			int num = Integer.parseInt(args[0]);
			System.out.println(100/num);
			System.out.println("1.程式執行完畢...");
		}
		/*
		catch(Exception e){
			System.out.println("父類別的Exception");
		}
		catch(ArrayIndexOutOfBoundsException aie){
			System.out.println("2.發生例外...");
			//aie.printStackTrace();
			System.out.println(aie.toString());
			System.out.println(aie.getMessage());
			System.out.println(aie.getLocalizedMessage());
		}
		catch(NumberFormatException nfe){
			System.out.println("3.發生例外...");
			nfe.printStackTrace();
		}
		*/
		finally{
			System.out.println("4.一定會執行!!");
		}
		System.out.println("5.例外受控制...");

	}
}