import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException; 

public class TestIO4{
	public static void main(String args[]) throws IOException{
		FileReader fr = new FileReader("C:\\workspace\\Example.txt");
		FileWriter fw = new FileWriter("C:\\workspace\\Example_bk2.txt");
		int ch = 0;
		while( (ch =fr.read()) != -1 ){
			fw.write(ch);
		}
		
		fr.close();
		fw.close();
	}
}