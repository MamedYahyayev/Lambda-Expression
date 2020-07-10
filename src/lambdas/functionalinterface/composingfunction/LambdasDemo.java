package lambdas.functionalinterface.composingfunction;

import java.util.function.Function;

public class LambdasDemo {

	public static void show() {
		Function<String, String> replaceColon = str -> str.replace(":", "=");
		Function<String, String> addBraces = str -> "{" + str + "}";		
		
		String result = replaceColon
							.andThen(addBraces)
							.apply("key:value");
					
		System.out.println("andThen: " + result);
		
		
		String result2 = addBraces.compose(replaceColon).apply("key:value");
		
		System.out.println("compose: " +result2);
	
	}

}
