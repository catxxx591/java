public class TestStr{
	public static void main(String args[]){
		String Answer = "A,B,A,C,D,A";
		String[] Ans  = Answer.split(",");
		int count = 0;
		for(String A:Ans){
			System.out.println("��" + ++count +"�D�����׬O"+A);
		}
	}
}

//  http://192.168.10.228:8080/