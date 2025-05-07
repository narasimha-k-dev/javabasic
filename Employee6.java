package java_classobjectprograms_te;

import java.util.Scanner;

public class Employee6 {
	int employeeid,salary;
	String name,gender,dof,adress,dept,jobtittle;
	
	void setvalues(int employeeid,int salary,String name,String gender,String dof,String adress,String dept,String jobtittile ) {
		this.employeeid=employeeid;
		this.salary=salary;
		this.dof=dof;
		this.adress=adress;
		this.dept=dept;
		this.jobtittle=jobtittle;
		
		
	}
	
	void display() {
		System.out.println("employee name is: "+name);
		System.out.println("employee id is: "+employeeid);
		System.out.println("employee date of birth is: "+dof);
		System.out.println("employee gender is: "+gender);
		System.out.println("employee adress is: "+adress);
		System.out.println("employee department is: "+dept);
		System.out.println("employee job tittle is: "+jobtittle);
		System.out.println("employee salary is: "+salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee6 obj=new Employee6();
		
		obj.setvalues(3333, 30000, "silesh", "M", "30-12-2005", "gtr,AP", "it", "developer");
		
		obj.display();
        
	}

}
