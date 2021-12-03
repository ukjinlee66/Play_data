package java1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.io.*;
import java.sql.*;

public class MyConn01 
{
	public static void main(String[] args) 
	{
		String jdbcDriver = "com.mysql.cj.jdbc.Driver";
		String jdbcUrl = "jdbc:mysql://localhost/empdb";
		
		try 
		{
			Class.forName(jdbcDriver);
			// Database Connection 연결
			Connection conn = DriverManager.getConnection(jdbcUrl,"root","Dnrwls1414!!");
			// Statement 생성
			String sql = "select * from dept";
			Statement stmt = conn.createStatement();
			// SQL 전송 --> executeQuery(), executeUpdate()
			// ResultSet(결과) 받기
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
//				System.out.printf(" %d ",rs.getInt("deptno"));
//				System.out.printf(" %-10s ",rs.getString(2));
//				System.out.printf(" %-10s %n",rs.getString("loc"));
				System.out.printf("%d | %-10s | %-10s \n",rs.getInt("deptno"),rs.getString(2),rs.getString("loc"));
				//System.out.println();
			}
			// Database Connection 해제
			stmt.close();
			conn.close();
		}
		catch (Exception e) {
			System.out.println("연결 안됨");
		}	
	}

}
