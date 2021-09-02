package com.adobe.prj.client;

@FunctionalInterface
interface Computation {
	int compute(int x, int y);
}

public class AnonymousDemo {

	public static void main(String[] args) {
		
		Computation c1 = new Computation() {
			@Override
			public int compute(int x, int y) {
				return x + y;
			}
		};
		printResult(c1, 5, 4);
		
		// lambda expression
		Computation c2 = (int x, int y) -> {
				return x * y;
		};

		printResult(c2, 5, 4);
		
		// lambda expression with type inference and implict return
		Computation c3 =  (x, y) ->  x - y;
		printResult(c3, 5, 4);
	}

	private static void printResult(Computation c1, int x, int y) {
		System.out.println(c1.compute(x, y));
	}
 
	
}
