package com.springcoreb;

public class Employee 
{
  private int employeeId;
  private String employeeName;
  private String employeCity;
  private String employeeAddress;
public int getEmployeeId()
{
	return employeeId;
}
public void setEmployeeId(int employeeId) 
{
	this.employeeId = employeeId;
}
public String getEmployeeName()
{
	return employeeName;
}
public void setEmployeeName(String employeeName)
{
	this.employeeName = employeeName;
}
public String getEmployeCity() 
{
	return employeCity;
}
public void setEmployeCity(String employeCity) 
{
	this.employeCity = employeCity;
}
public String getEmployeeAddress()
{
	return employeeAddress;
}
public void setEmployeeAddress(String employeeAddress) 
{
	this.employeeAddress = employeeAddress;
}
public Employee(int employeeId, String employeeName, String employeCity, String employeeAddress) 
{
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.employeCity = employeCity;
	this.employeeAddress = employeeAddress;
}
public Employee()
{
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString()
{
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeCity=" + employeCity
			+ ", employeeAddress=" + employeeAddress + "]";
}
 
}
