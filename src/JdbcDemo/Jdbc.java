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

	/**This is practical for Database Connectivity
	 * 
	 */
//	public Jdbc(int i) {
//		// TODO Auto-generated constructor stub
//		int j=i;
//		System.out.println("j="+i);
//	}
    public void display()
    {
    	System.out.println("This is my first practical");
    }
	/**
	 * @param args
	 */
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello World");
		//Jdbc j=new Jdbc(10);
		//j.display();
		
		 try {
	            // The newInstance() call is a work around for some
	            // broken Java implementations
               //https://www.javatpoint.com/example-to-connect-to-the-mysql-database
			 
			 Class.forName("com.mysql.jdbc.Driver").newInstance();
	           
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
	        "jdbc:mysql://localhost:3306/demo","root","root"); 
			
	               //here demo is database name, root is username and password  
			
			
//	        		Statement stmt=con.createStatement(); 
//	        		ResultSet rs=stmt.executeQuery("select * from emp where emp_name='neha'");  
//	        		while(rs.next())  
//	        		System.out.println(rs.getString(1)+"  "+rs.getInt(2)); 
			
			//Statement stmt=con.createStatement();
			//stmt.executeUpdate("Create table StudentInfo(name varchar(50),roll_no int,sub varchar(50));");
			PreparedStatement pstmt=con.prepareStatement("insert into student values(?,?,?);");
			pstmt.setString(1, "Neha");
			//pstmt.setInt(2, 25);
			//pstmt.setString(3, "Math");
			con.close();  
	        		}
	        	catch(Exception e)
		 		{ 
	        		System.out.println(e);
	        	}  
	        	
		
	
	}
}

	


