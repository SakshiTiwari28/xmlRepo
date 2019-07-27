package com.jdbc;
import java.sql.*;
import java.sql.DriverManager;
import java.util.Scanner;

public class TestJdbc {
	public static void main(String args[]){
		
	try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded...");
		    Connection conn =	DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root","root");
		    
		    System.out.println("Connected to Database.....");
		    int id;
		    Scanner sc =new Scanner (System.in);
		    System.out.println("Enter id for which you need Salary ");
		    id=sc.nextInt();
		    String Procedure="{call getSalary(?,?)}";
		    CallableStatement cstmt =conn.prepareCall(Procedure);
		    cstmt.setInt(1, id);
		    cstmt.registerOutParameter(2, java.sql.Types.INTEGER);
		    cstmt.execute();
		    System.out.println("Salary is "+ cstmt.getInt(2));
		    
		    
		    
//		    int id;
//		    String n;
//		    double sal;
//		    System.out.println("Enter Employee Details ");
//		    Scanner sc = new Scanner(System.in);
//		    id = sc.nextInt();
//		    n= sc.next();
//		    sal=sc.nextDouble();
//		    Statement stmt =conn.createStatement();
////		    ResultSet rs = stmt.executeQuery("select * from Employee");
//		    while(rs.next()){
//		    	System.out.println(rs.getInt(1)+ "\t" + rs.getString(2)+ "\t" +rs.getDouble(3));
//		    }
//		    PreparedStatement pstmt =  conn.prepareStatement("Insert into Employee values(?,?,?)");
//		     pstmt.setInt(1, id);
//		     pstmt.setString(2, n);
//		     pstmt.setDouble(3, sal);
//		     pstmt.executeUpdate();
		    
		    
		    
		    conn.close();
		} 
	 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
