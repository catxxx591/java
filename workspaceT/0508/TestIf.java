public class TestIf{
	public static void main(String args[]){
		int score = 95;
		
		if(score > 100 || score < 0){
			System.out.println("���Z�ƭȽd����~�I");
		}
		else if(score>=90){
			System.out.println("���Z�ή�A����A");
		}
		else if(score>=80){
			System.out.println("���Z�ή�A����B");
		}
		else if(score>=70){
			System.out.println("���Z�ή�A����C");
		}
		else if(score>=60){
			System.out.println("���Z�ή�A����D");
		}
		else{
			System.out.println("���Z���ή�A����F");
		}
	}
}