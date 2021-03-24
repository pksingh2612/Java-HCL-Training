package com.Week3_Day2;

public class EmployeeLogic {
	public double calculateYearlySalary(Employee emp) {
		double ysalary=0;
		ysalary=emp.getSalary()*12;
		return ysalary;
	}
	public double calculateAppraisal(Employee emp) {
		double appraisal=0;
		if(emp.getSalary()<10000) {
			appraisal=500;
		}else
		{
			appraisal=1000;
		}
		return emp.getSalary()+appraisal;
	}
}
