package com.my;

public class DeptVO 
{
	// 멤버 필드
	private int deptno;
	private String dname;
	private String loc;
	
	DeptVO(int deptno, String dname, String loc)
	{
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	public int getDeptno() {return deptno;}

	public String getDname() {return dname;}

	public String getLoc() {return loc;}

	@Override
	public String toString() {
		return "DeptVO [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc;
	}

	
}
