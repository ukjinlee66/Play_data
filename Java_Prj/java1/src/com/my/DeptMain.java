package com.my;

import java.sql.Connection;
import java.util.Scanner;

public class DeptMain {

	static String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	static DeptDAO dDao = DeptDAO.getInstance();
	
	static void selectD(int deptno,Connection conn) {
		
		DeptVO dSel = dDao.selectDept(deptno, conn);
		System.out.println(dSel.toString());
	}
	static void insertD(DeptVO dept, Connection conn) 
	{
		
		int res = dDao.insertDept(dept, conn);
		if (res > 0) System.out.println("정상입력");
		else System.out.println("에러");
	}
	static void updateD(DeptVO dept, Connection conn) 
	{
		
		int res = dDao.updateDept(dept, conn);
		if (res > 0) System.out.println("정상입력");
		else System.out.println("에러");
	}
	static void deleteD(DeptVO dept, Connection conn) 
	{
		
		int res = dDao.deleteDept(dept, conn);
		if (res > 0) System.out.println("정상입력");
		else System.out.println("에러");
	}
	public static void main(String[] args) {
		
		System.out.println("== 부서 관리 시스템 시작 ==");
		System.out.println("1. 조회, 2.입력, 3. 수정, 4. 삭제,,, ==> ");
		Scanner sc = new Scanner(System.in);
		int choiceNum = sc.nextInt();
		try {
			Class.forName(jdbcDriver);
			Connection conn = DBConn.getConnection();
			
			switch (choiceNum) 
			{
				case 1:
					System.out.println("-- 검색할 부서번호 입력 => ");
					int deptno = sc.nextInt();
					selectD(deptno,conn);
					break;
				case 2:
					System.out.println("-- 입력할 부서정보 입력 => ");
					int deptno2 = sc.nextInt();
					String dname = sc.next();
					String loc = sc.next();
					DeptVO idept = new DeptVO(deptno2,dname,loc);
					insertD(idept,conn);
					break;
				case 3:
					System.out.println("-- 입력할 부서정보 입력 => ");
					int deptno3 = sc.nextInt();
					String dname3 = sc.next();
					String loc3 = sc.next();
					DeptVO idept3 = new DeptVO(deptno3,dname3,loc3);
					updateD(idept3,conn);
					break;
				case 4:
					System.out.println("-- 입력할 부서정보 입력 => ");
					int deptno4 = sc.nextInt();
					String dname4 = sc.next();
					String loc4 = sc.next();
					DeptVO idept4 = new DeptVO(deptno4,dname4,loc4);
					deleteD(idept4,conn);
					break;
				default:
					System.out.println("잘못된 번호 입력");
			}
		}
		catch(Exception e) {
			System.out.println("문제 일어남");
		}
		
		sc.close();
	}

}