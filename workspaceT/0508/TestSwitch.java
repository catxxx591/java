public class TestSwitch{
	public static void main(String args[]){
		
		int score = 89;
		int lv = score / 10;
		//byte short int char String
		switch(lv){
			case 10:
			case 9:
				System.out.println("���Z�ή�A����A");
				break;
			case 8:
				System.out.println("���Z�ή�A����B");
				break;
			case 7:
				System.out.println("���Z�ή�A����C");
				break;
			case 6:
				System.out.println("���Z�ή�A����D");
				break;
			default:
				System.out.println("���Z���ή�A����F");
		}
		
	}
}