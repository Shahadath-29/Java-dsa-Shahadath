package com.arrays;
public class Arrays{
public static void main(String[] args) {
	Employee emp1 = new Employee(123,"Md");
	Employee emp2 = new Employee(345,"sameer");
	Employee emp3 = new Employee(123,"Shahadath");
	
	Employee emp[]= {emp1,emp2,emp3};
	
	for(Employee e:emp) {
		System.out.println(e);
	}
}
}
