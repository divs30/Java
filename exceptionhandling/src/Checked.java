import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Checked {

	public static void main(String[] args) {
		System.out.println("Main Starts!!!");
			compute();
		System.out.println("Main ends!!!");
	}

	private static void compute() {
		 try {
			FileInputStream fs = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
