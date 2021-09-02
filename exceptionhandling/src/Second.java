
public class Second {

	public static void main(String[] args) {
		
		Thread.currentThread().setUncaughtExceptionHandler( (thread,ex) -> {
			System.out.println("Boom:-( Problem " + ex.getMessage() +  " in " + thread.getName() + " thread");
		});
		
		System.out.println("Main Starts!!!");
			compute();
		System.out.println("Main ends!!!");
	}

	private static void compute() {
		int x = 10;
		int y = 0;
		int result = x / y;
		System.out.println(result);
	}

}
