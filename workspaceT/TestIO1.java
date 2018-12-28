import java.io.File;

public class TestIO1{
	public static void main(String args[]){
		File f = new File("C:\\workspace\\Example.txt");
		
		System.out.println("�iŪ�G" + f.canRead());
		System.out.println("�i�g�G" + f.canWrite());
		System.out.println("�j�p�G" + f.length());
		
		File file_list = new File("C:\\");
		
		System.out.println(file_list.isFile());
		System.out.println(file_list.isDirectory());
		File[] files = file_list.listFiles();
		
		System.out.println("******�ɮצC��******");
		for(File file:files){
			if(file.isFile())
				System.out.println(file);
		}
		System.out.println("******��Ƨ��C��******");
		for(File file:files){
			if(file.isDirectory())
				System.out.println(file);
		}
	}
}