package java_classobjectprograms_te;

public class Student3 {
	int id,age;
	String name,g,dof;
    void assigning(int id,int age,String g,String dof,String name) {
    	this.id=id;
    	this.age=age;
    	this.g=g;
    	this.dof=dof;
    	this.name=name;
    }
    void display() {
    	System.out.println("student name is: "+name);
    	System.out.println("student id is: "+id);
    	System.out.println("student age is: "+age);
    	System.out.println("student gender is: "+g);
    	System.out.println("student dateofbith is: "+dof);
    	System.out.println();
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student3 s1=new Student3();
		Student3 s2=new Student3();
		Student3 s3=new Student3();
		s1.assigning(1111, 20, "M", "12-12-2020","aravind");
		s2.assigning(1001, 23, "f", "12-12-2020","jhansi");
		s3.assigning(9912, 19, "M", "12-12-2020","ramu");
		s1.display();
		s2.display();
		s3.display();


	}

}
