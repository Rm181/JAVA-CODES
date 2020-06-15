import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo1 {

	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Class Loaded");

			// connection string
			Connection con = DriverManager.getConnection( 
					"jdbc:oracle:thin:@maruti:1521:hero", "scott", "tiger");
			System.out.println("Connection established");

			String str = "select empname from emp01";

			Statement st = con.createStatement();

			ResultSet rs = st.executeQuery(str);

			while (rs.next()) {
				System.out.println(rs.getString(1));
			}
			
			con.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
