package com.cg.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EmployeeSorting {

	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<>();
		
		emp.add(new Employee (101,"Anjana",30000.0));
		emp.add(new Employee(102,"Anushree",33333.0));
		emp.add(new Employee(103,"Saagar",50000.0));
		emp.add(new Employee(104,"Monika",38000.0));
		emp.add(new Employee(105,"Smitha",65432.0));
		emp.add(new Employee(106,"Sannidhi",35000.0));
		
		
		
		Iterator<Employee> it = emp.iterator(); //To iterate and show each element present in employee class
		  while (it.hasNext()) {
		   System.out.println(it.next());
		  }
		  Collections.sort(emp);
		  
		  System.out.println("----------------------------------------------------");
		  
		  it = emp.iterator();  //iterating every element in employee and then sorting as per name
		  while (it.hasNext()) {
		   System.out.println(it.next());
		  }
		  Collections.sort((List<T>) emp);
	}
}