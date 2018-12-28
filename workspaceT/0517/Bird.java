public class Bird{
	private String name;
	
	void walk(){
		System.out.println(getName()+"會走路...");
	}
	
	String getName(){
		return ""+name+"";
	}
	
	void setName(String name){
		this.name = name;
	}
	
	public String toString(){
		return "Bird的toString()覆寫...";
	}
}