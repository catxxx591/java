package org.tcfst;
import com.oracle.Hi;
import java.util.*;

import static java.lang.System.out;
import static java.lang.Integer.parseInt;

public class Hello{
	public static void main(String args[]){
		System.out.println("Hello");
		
		Hi hi = new Hi();
		hi.sayHi();
		Date date = new Date();
		System.out.println(date.toString());
		
		out.println("import static!!!");
		out.println(parseInt("123")+1);
		
	}
}
//Fully class name
//package¦WºÙ + class¦WºÙ

//javac -d . Hi.java
//javac -d . Hello.java
//java  org.tcfst.Hello