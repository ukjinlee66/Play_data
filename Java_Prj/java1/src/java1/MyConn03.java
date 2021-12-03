package java1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MyConn03 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Connection conn = null;
		
		String jdbcDriver = "com.mysql.cj.jdbc.Driver";
		String jdbcUrl = "jdbc:mysql://localhost:3306/empdb?serverTimezone=UTC";
		String dbUser  = "root";
		String dbPwd   = "Dnrwls1414!!";
		
		String sqlSelect = "select * from dept10";
		PreparedStatement pstmt = null;
		ResultSet rs = null; 
		
		int iDeptno = 0; String sDname = null; //String sLoc = null;
		
		Scanner sc = new Scanner(System.in);
		
		iDeptno = sc.nextInt(); 
		sDname = sc.next();
		
		//sLoc = sc.next();
		sc.close();
		//String sqlInsert = "insert into dept10 values(?,?,?)"; 
		String sqlInsert = "Update dept10 Set loc=? where deptno=?";		
		try {
			Class.forName(jdbcDriver);
			
			conn = DriverManager.getConnection(jdbcUrl,dbUser,dbPwd );
			
			pstmt = conn.prepareStatement(sqlInsert);
			
						
			pstmt.setInt(2, iDeptno); 
			pstmt.setString(1, sDname);
			//pstmt.setString(3, sLoc);
			pstmt.executeUpdate();
			rs = pstmt.executeQuery(sqlSelect);
			//if(resultCount > 0 ) {System.out.println("���� �Է�"); }
				
			while(rs.next()) {
				System.out.printf("%d | %-10s | %-10s %n",rs.getInt("deptno"),rs.getString(2),rs.getString("loc"));
			}	
			
			System.out.println("Connection");
			pstmt.close();
			conn.close();
		}
		catch(SQLException e) {
			System.out.printf("Exception: \r\n %s", e);
		}
		catch(ClassNotFoundException e) {
			System.out.printf("Exception: \r\n %s", e);
		}	
	}

}
