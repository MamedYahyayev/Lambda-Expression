package lambdas.predicateinterface.combiningpredicate;

import java.util.function.Predicate;

public class LambdasDemo {

	public static void show() {
		Predicate<String> hasLeftBrace = str -> str.startsWith("{");
		Predicate<String> hasRightBrace = str -> str.endsWith("}");

		Predicate<String> hasLeftAndRightBrace = hasLeftBrace.and(hasRightBrace);
		Predicate<String> hasLeftOrRightBrace = hasLeftBrace.and(hasRightBrace);
		Predicate<String> negate = hasLeftBrace.negate();
		boolean result = hasLeftAndRightBrace.test("{key:value}");
		boolean resultOr = hasLeftOrRightBrace.test("{key:value}");
		boolean resultNegate = negate.test("key:value");
		System.out.println(result);
		System.out.println(resultOr);
		System.out.println(resultNegate);

	}

}
