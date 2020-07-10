package lambdas.functionalinterface;

import java.util.function.Function;

public class LambdasDemo {

	public static void show() {
		Function<String, Integer> map = str -> str.length();	
		int length = map.apply("String");
		System.out.println(length);
		
	}
}
