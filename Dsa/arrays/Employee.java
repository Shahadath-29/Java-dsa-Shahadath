
package com.arrays;

public class Employee {
	int empid;
	String empname;
	
     public Employee(int empid, String empname) {
		this.empid = empid;
		this.empname = empname;
	}
	@Override
	public String toString() {
		return "Employee [empid = " + empid + ",empname = " + empname + "]";
	}
}


