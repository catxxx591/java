public class TestSwitch{
	public static void main(String args[]){
		
		int score = 89;
		int lv = score / 10;
		//byte short int char String
		switch(lv){
			case 10:
			case 9:
				System.out.println("Θ罿の单A");
				break;
			case 8:
				System.out.println("Θ罿の单B");
				break;
			case 7:
				System.out.println("Θ罿の单C");
				break;
			case 6:
				System.out.println("Θ罿の单D");
				break;
			default:
				System.out.println("Θ罿ぃの单F");
		}
		
	}
}