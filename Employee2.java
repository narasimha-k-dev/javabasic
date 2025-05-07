package java_classobjectprograms_te;

import java.util.Scanner;

public class Employee2 {
	int employeeid,salary;
	String name,gender,dof,adress,dept,jobtittle;
	
	
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
		Employee2 obj=new Employee2();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter employee id: ");
		obj.employeeid=sc.nextInt();
	
		System.out.println("enter employee salary: ");
		obj.salary=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("enter employee name: ");
		obj.name=sc.nextLine();
		
		System.out.println("enter employee gender: ");
		obj.gender=sc.nextLine();
		
		System.out.println("enter employee dof: ");
		obj.dof=sc.nextLine();
		
		System.out.println("enter employee adress: ");
		obj.adress=sc.nextLine();
		
		System.out.println("enter employee dept: ");
		obj.dept=sc.nextLine();
		
		System.out.println("enter employee jobtittle: ");
		obj.jobtittle=sc.nextLine();
		obj.display();
        
	}

}
