package lambdas.unaryoperator;

import java.util.function.UnaryOperator;

public class LambdasDemo {

	public static void show() {
		UnaryOperator<Integer> square = n -> n * n;
		UnaryOperator<Integer> increment = n -> n + 1;

		Integer result = increment.andThen(square).apply(2);
		System.out.println(result);
	}

}
