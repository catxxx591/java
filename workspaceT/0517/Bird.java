public class Bird{
	private String name;
	
	void walk(){
		System.out.println(getName()+"�|����...");
	}
	
	String getName(){
		return ""+name+"";
	}
	
	void setName(String name){
		this.name = name;
	}
	
	public String toString(){
		return "Bird��toString()�мg...";
	}
}