package com.yash.pojo;

public class Department 
{
	private int dept_Id;
	String dept_Name;
	
	public Department() {
		super();
	}

	public Department(int dept_Id, String dept_Name) {
		super();
		this.dept_Id = dept_Id;
		this.dept_Name = dept_Name;
	}

	public int getDept_Id() {
		return dept_Id;
	}

	public void setDept_Id(int dept_Id) {
		this.dept_Id = dept_Id;
	}

	public String getDept_Name() {
		return dept_Name;
	}

	public void setDept_Name(String dept_Name) {
		this.dept_Name = dept_Name;
	}
	
	
}
