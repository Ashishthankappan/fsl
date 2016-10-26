package com.jnj.ihub.fsl.MyPackage;

public class Employee {
	
	public String Name,Designation;
	private int Age=20 ;
	double Salary;
	
	public void setAge(int empAge)
	{
		Age=empAge;
		
	}
	
	public Employee(String empName)
	{
		Name=empName;
		
	}
	
	public void setDesignation(String empDesignation)
	{
		Designation=empDesignation;
		
	}
	
	public void setSalary(double empSalary)
	{
		Salary=empSalary;
		
	}
	
	public void printEmpdetails()
	{
		System.out.println("The details of the employee is printed below\n as");
		System.out.println("Name: " + Name);
		System.out.println("Age: " + Age);
		System.out.println("Desgination: " + Designation);
		System.out.println("Salary: $" + Salary);
	}
	

}
