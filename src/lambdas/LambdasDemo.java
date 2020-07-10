package lambdas;

public class LambdasDemo {

	public static String suffix = "-";

	public static void print(String message) {
	}

	public LambdasDemo(String message) {

	}

	public static void show() {
		String prefix = "-";

		// lambda expression with static field and local variable
		greet(message -> System.out.println(prefix + message + suffix));
		greet(System.out::println);

		// method reference
		greet(message -> LambdasDemo.print(message));
		greet(LambdasDemo::print);

		// Lambda Expression : Method Reference with Constructor
		greet(message -> new LambdasDemo(message));
		greet(LambdasDemo::new);

	}

	public static void greet(Printer printer) {
		printer.print("Hello World");
	}

}
