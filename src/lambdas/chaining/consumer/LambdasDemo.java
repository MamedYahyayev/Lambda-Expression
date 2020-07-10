package lambdas.chaining.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdasDemo {

	public static void show() {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		Consumer<String> print = item -> System.out.println(item);	
		Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());	
		
		list.forEach(print.andThen(printUpperCase));
		
	}
	
}
