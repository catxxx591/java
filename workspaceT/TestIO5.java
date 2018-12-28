import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException; 

public class TestIO5{
	public static void main(String args[]) throws IOException{
		FileInputStream  fis = new FileInputStream("C:\\workspace\\Java_logo.png");
		FileOutputStream fos = new FileOutputStream("C:\\workspace\\Java_logo_bk.png");
		int remain = 0;
		while( (remain = fis.read()) != -1 ){
			//System.out.print((char)remain);
			fos.write(remain);
		}
		fis.close();
		fos.close();
		
		FileReader fr = new FileReader("C:\\workspace\\Java_logo.png");
		FileWriter fw = new FileWriter("C:\\workspace\\Java_logo_bk2.png");
		int ch = 0;
		while( (ch =fr.read()) != -1 ){
			fw.write(ch);
		}
		fr.close();
		fw.close();
	}
}