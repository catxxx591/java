public class Chicken extends Bird{
	String crest;
	
	void setCrest(String crest){
		this.crest = crest;
	}
	String getCrest(){
		return crest;
	}
	void wu(){
		System.out.println(getName()+"咕咕叫...");
	}
	
	void walk(){
		System.out.println(getName()+"會走路!!!");
	}
	
	String getName(){
		return "\"" + super.getName() + "\"";
		//           父類別的
	}
	
}