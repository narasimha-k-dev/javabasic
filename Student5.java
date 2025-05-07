package java_classobjectprograms_te;

public class Student5 {
	int id,age;
	String name,g,dof,grade;
    void assigning(int id,int age,String g,String dof,String name,String grade) {
    	this.id=id;
    	this.age=age;
    	this.g=g;
    	this.dof=dof;
    	this.name=name;
    	this.grade=grade;
    }
    void display() {
    	System.out.println("student name is: "+name);
    	System.out.println("student id is: "+id);
    	System.out.println("student age is: "+age);
    	System.out.println("student gender is: "+g);
    	System.out.println("student dateofbith is: "+dof);
    	System.out.println("student grade is: "+grade);
    	System.out.println();
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student5 obj=new Student5();
		obj.assigning(2, 13, "M", "12-12-2011", "amon", "A");
		obj.display();

	}

}
