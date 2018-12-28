import java.io.File;

public class TestIO1{
	public static void main(String args[]){
		File f = new File("C:\\workspace\\Example.txt");
		
		System.out.println("可讀：" + f.canRead());
		System.out.println("可寫：" + f.canWrite());
		System.out.println("大小：" + f.length());
		
		File file_list = new File("C:\\");
		
		System.out.println(file_list.isFile());
		System.out.println(file_list.isDirectory());
		File[] files = file_list.listFiles();
		
		System.out.println("******檔案列表******");
		for(File file:files){
			if(file.isFile())
				System.out.println(file);
		}
		System.out.println("******資料夾列表******");
		for(File file:files){
			if(file.isDirectory())
				System.out.println(file);
		}
	}
}