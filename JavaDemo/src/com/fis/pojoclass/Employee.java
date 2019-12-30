package com.fis.pojoclass;

public class Employee implements Comparable<Employee>{
	
	String name;
	int empNo;
	
	public Employee(String name, int empNo) {
		
		this.name = name;
		this.empNo = empNo;
	}

	@Override
	public int compareTo(Employee empObj) {
		
		if(empNo < empObj.empNo)
		return -1;
		else if(empNo > empObj.empNo)
		return 1;
		else;
		return 0;
	}
	
	public String toString() {
		return "Name is:::"+this.name+"::::empNo is::::"+this.empNo;
	}

}
