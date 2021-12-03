package com.my;

import java.sql.*;

public class DBConn 
{
	public static Connection getConnection() throws SQLException 
	{
		Connection conn = null;
		//1. JDBC 드라이버 로드
		String jdbcDriver = "com.mysql.cj.jdbc.Driver";
		String jdbcUrl = "jdbc:mysql://localhost:3306/empdb";
		String dbUser  = "root";
		String dbPwd   = "Dnrwls1414!!";
		
		conn = DriverManager.getConnection(jdbcUrl,dbUser,dbPwd );
		return conn;
	}
	//2.Database Connection 연결
	
	//6. Database Connection 해제
}
