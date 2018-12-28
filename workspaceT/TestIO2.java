import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;

public class TestIO2{
	public static void main(String args[]) {//throws IOException{
		try{
			FileInputStream  fis = new FileInputStream(new File("C:\\workspace\\Example.txt"));
			FileOutputStream fos = new FileOutputStream(new File("C:\\workspace\\Example_bk.txt"));

			int remain = 0;
			while( (remain = fis.read()) != -1 ){
				System.out.print((char)remain);
				fos.write(remain);
			}
			fis.close();
			fos.close();
		}
		catch(FileNotFoundException fnfe){
			System.out.println("找不到檔案...");
		}
		catch(IOException ioe){
			System.out.println("檔案處理異常...");
		}
	}
}