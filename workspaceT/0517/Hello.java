package org.tcfst;

public class Hello{
	public static void main(String args[]){
		System.out.println("Hello!!!");
		
		com.oracle.Hi hi = new com.oracle.Hi();
		hi.sayHi();
	}
}
//javac -d . Hi.java
//javac -d . Hello.java
//java org.tcfst.Hello