import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

import com.mysql.jdbc.Statement;

// Notice, do not import com.mysql.jdbc.*
// or you will have problems!
	
public class connectToSQL {
	
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) {
		
		try {//Try this section of code
			//1.Get a connection to the database 
		//verifyServerCertificate=false&useSSL=true" Allowed me to remove SSL certificate
		Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Devonte?verifyServerCertificate=false&useSSL=true", "root", "devonte1");
		System.out.println("Connected");
		
		 String institutename, institute_type, year_completed; 
		 institutename = JOptionPane.showInputDialog("Please enter institute name ");
		 institute_type = JOptionPane.showInputDialog("Please enter institute type ");
		 year_completed = JOptionPane.showInputDialog("Please enter year completed");
		
		
		
		 //2.Create a statement object 
		java.sql.Statement myStat = myConn.createStatement();
		
		//3.Execute a SQL query 
		//ResultSet myResults = myStat.executeQuery("select * from education");
		ResultSet Insert = myStat.executeQuery("INSERT INTO `devonte`.`education` + (institutename, `institute_name`, `institute_name`) VALUES (institutename, institute_name, institute_name);\n" + 
				"");
		ResultSet myResults = myStat.executeQuery("select * from education");
		
		
		//String sql = "insert into "
		
		
		
		//4. Process the result set
		while(myResults.next()) {//While there are still rows in the table do something
			System.out.println(myResults.getInt("education_id")+" "+ myResults.getString("institute_name") +"" +myResults.getString("institute_type"));
		}
		//while(myResults1.next()) {//While there are still rows in the table do something
		//	System.out.println(myResults.getString("institute_name")+" "+ myResults.getString("institute_name") +"" +myResults.getString("institute_name"));
		//}
		
		//5.Retrieve the data 
	
		//Catch error
		}catch (Exception exc){
			System.out.print("Could not connect");
			exc.printStackTrace();
		}
		
		
	}

}