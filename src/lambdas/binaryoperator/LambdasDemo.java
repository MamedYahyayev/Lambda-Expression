package lambdas.binaryoperator;

import java.util.function.BinaryOperator;

public class LambdasDemo {

	public static void show() {
		BinaryOperator<Integer> add = (a , b) -> a + b;
		int result = add.apply(1, 2);
		System.out.println(result);
		
		
	}
	
}
