public class Chicken extends Bird{
	String crest;
	
	void setCrest(String crest){
		this.crest = crest;
	}
	String getCrest(){
		return crest;
	}
	void wu(){
		System.out.println(getName()+"�B�B�s...");
	}
	
	void walk(){
		System.out.println(getName()+"�|����!!!");
	}
	
	String getName(){
		return "\"" + super.getName() + "\"";
		//           �����O��
	}
	
}