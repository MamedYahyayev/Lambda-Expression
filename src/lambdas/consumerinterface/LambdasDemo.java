package lambdas.consumerinterface;

import java.util.ArrayList;
import java.util.List;

public class LambdasDemo {

	public static void show() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);

		for (Integer item : list)
			System.out.println(item);

		// Lambda Expression
		list.forEach(item -> System.out.println(item));

	}

}
