package com.my;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.util.Scanner;
public class DeptDAO 
{
	// Singleton
	
	private static DeptDAO dao = new DeptDAO();
	private DeptDAO() {}
	public static DeptDAO getInstance() {return dao;}
	
	/////////////
	
	
	DeptVO selectDept( int deptno, Connection conn ) 
	{
		DeptVO dept= null;
		try 
		{
			// Statement 생성
			String sql = "select * from dept10 where deptno = " + deptno;
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				dept = new DeptVO(rs.getInt(1), rs.getString(2), rs.getString(3));
				System.out.printf("%d | %-10s | %-10s \n",rs.getInt("deptno"),rs.getString(2),rs.getString("loc"));
			}
			// Database Connection 해제
			stmt.close();
			conn.close();
		}
		catch (Exception e) {
			System.out.println("연결 안됨");
		}
		return dept;
	}
	int insertDept(DeptVO deptObj, Connection conn) 
	{
		
		int resultCount = 0;
		
		try {
			String sql = "insert into dept10 values(?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptObj.getDeptno()); 
			pstmt.setString(2, deptObj.getDname());
			pstmt.setString(3, deptObj.getLoc());
			
			resultCount = pstmt.executeUpdate();
			
			pstmt.close();
		}
		catch (SQLException e) {
			System.out.println("연결 안됨");
		}
		return resultCount;
	}
	int updateDept(DeptVO deptObj, Connection conn) 
	{
		
		int resultCount = 0;
		
		try {
			String sql = "update dept10 set loc = ? where deptno = ? and dname = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(2, deptObj.getDeptno());
			pstmt.setString(1, deptObj.getLoc());
			pstmt.setString(3, deptObj.getDname());
			resultCount = pstmt.executeUpdate();
			
			pstmt.close();
		}
		catch (SQLException e) {
			System.out.println("연결 안됨");
		}
		return resultCount;
	}
	int deleteDept(DeptVO deptObj, Connection conn) 
	{
		
		int resultCount = 0;
		
		try {
			String sql = "delete from dept10 where(deptno = ?) and loc = ? and dname = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptObj.getDeptno()); 
			pstmt.setString(3, deptObj.getDname());
			pstmt.setString(2, deptObj.getLoc());
			
			resultCount = pstmt.executeUpdate();
			
			pstmt.close();
		}
		catch (SQLException e) {
			System.out.println("연결 안됨");
		}
		return resultCount;
	}
//	부서명 -> 부서번호, 부서명, 부서위치 
//	insertDept( ) { }
//	updateDept( ) { }
//	deleteDept( ) { }
//	listDept() { } 	부서명 
}
