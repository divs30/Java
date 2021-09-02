import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Checked1 {

	public static void main(String[] args) {
		System.out.println("Main Starts!!!");
		try {
			compute();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println("Main ends!!!");
	}

	private static void compute() throws FileNotFoundException, SQLException {
		FileInputStream fs = new FileInputStream("a.txt");
		Connection con = DriverManager.getConnection("");
	}

}
