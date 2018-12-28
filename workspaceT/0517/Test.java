public class Test{
	public static void main(String args[]){
		//B b = new B();
		C c = new C();
	}
}

class A{
	public A(){
		System.out.println("A建構子被呼叫...");
	}
}
class B extends A{
	public B(){//super();
		System.out.println("B建構子被呼叫...");
	}
}
class C extends B{
	//public C(){
	//	super();
	//}
}

