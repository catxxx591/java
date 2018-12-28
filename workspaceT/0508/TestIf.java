public class TestIf{
	public static void main(String args[]){
		int score = 95;
		
		if(score > 100 || score < 0){
			System.out.println("Θ罿计絛瞅岿粇");
		}
		else if(score>=90){
			System.out.println("Θ罿の单A");
		}
		else if(score>=80){
			System.out.println("Θ罿の单B");
		}
		else if(score>=70){
			System.out.println("Θ罿の单C");
		}
		else if(score>=60){
			System.out.println("Θ罿の单D");
		}
		else{
			System.out.println("Θ罿ぃの单F");
		}
	}
}