/**
 * 
 */
package JdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author Neha
 *
 */
public class Jdbc {

	/**
	 * This is practical for Database Connectivity
	 * 
	 */
	// public Jdbc(int i) {
	// // TODO Auto-generated constructor stub
	// int j=i;
	// System.out.println("j="+i);
	// }
	public void display() {
		System.out.println("This is my first practical");
	}

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		String Step_Description;
		String Step_Prerequisites;
		String Step_InputData;
		String Step_ExpectedResult;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/smcdb", "root",
					"mysqldb");
			Statement statement = (Statement) conn.createStatement();

			String sql = "select Step_Description,Step_Prerequisites,Step_InputData,Step_ExpectedResult from testcaseevaluationdata where TestCaseID='TCID_01';";
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				Step_Description = rs.getString("Step_Description");
				System.out.println(Step_Description);
				Step_Prerequisites = rs.getString("Step_Prerequisites");
				System.out.println(Step_Prerequisites);
				Step_InputData = rs.getString("Step_Description");
				System.out.println(Step_InputData);
				Step_ExpectedResult = rs.getString("Step_Description");
				System.out.println(Step_ExpectedResult);
			}

			System.out.println("Database is connected.");
		} catch (Exception e) {
			System.out.println("Could not initialize the database.");
			e.printStackTrace();
		}

		/*
		 * try { //
		 * https://www.javatpoint.com/example-to-connect-to-the-mysql-database
		 * 
		 * Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		 * 
		 * Connection con =
		 * DriverManager.getConnection("jdbc:mysql://localhost:3306/practice",
		 * "root", "mysqldb"); Statement stmt = con.createStatement(); //
		 * stmt.executeUpdate(
		 * "Create table StudentInfo(name varchar(50),roll_no int(50),sub varchar(50));"
		 * ); // System.out.println("Create table"); PreparedStatement pstmt =
		 * con.prepareStatement("insert into StudentInfo values(?,?,?);");
		 * 
		 * pstmt.setString(1,"Neha"); pstmt.setInt(2, 25); pstmt.setString(3,
		 * "Math");
		 * 
		 * pstmt.executeUpdate();
		 * 
		 * System.out.println("Insert Record");
		 * 
		 * ResultSet rs = stmt.executeQuery("select * from StudentInfo"); while
		 * (rs.next()) System.out.println(rs.getString(1) + " " + rs.getInt(2)+
		 * " "+rs.getString(1));
		 * 
		 * con.close();
		 * 
		 * } catch (Exception e) { System.out.println(e); }
		 */
	}
}
