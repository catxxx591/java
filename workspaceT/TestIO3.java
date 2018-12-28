import java.util.Scanner;

public class TestIO3{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("請輸入數字：");
		int num = scan.nextInt();
		System.out.println("您輸入的數字："+num);
	}
}