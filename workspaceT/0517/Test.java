public class Test{
	public static void main(String args[]){
		//B b = new B();
		C c = new C();
	}
}

class A{
	public A(){
		System.out.println("A�غc�l�Q�I�s...");
	}
}
class B extends A{
	public B(){//super();
		System.out.println("B�غc�l�Q�I�s...");
	}
}
class C extends B{
	//public C(){
	//	super();
	//}
}

