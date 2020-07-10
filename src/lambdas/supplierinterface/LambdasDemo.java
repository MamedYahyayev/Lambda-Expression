package lambdas.supplierinterface;

import java.util.function.Supplier;

public class LambdasDemo {

	public static void show() {
		Supplier<Double> getRandom = () -> Math.random();
		double random = getRandom.get();
		System.out.println(random);
	}

}
