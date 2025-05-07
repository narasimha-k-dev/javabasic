package java_classobjectprograms_te;

public class Student1 {
	
	int studentid;
	char gender;
	String name,dateofbirth,adress,grade,schoolname;
	
	void display() {
		System.out.println("student name is: "+name);
		System.out.println("student id is: "+studentid);
		System.out.println("student gender is: "+gender);
		System.out.println("student date of birth is: "+dateofbirth);
		System.out.println("student adress is: "+adress);
		System.out.println("student grade is: "+grade);
		System.out.println("student schoolname is: "+schoolname);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Student1 obj=new Student1();
         obj.studentid=12345;
         obj.name="ramu";
         obj.gender='M';
         obj.dateofbirth="12-12-2004";
         obj.adress="arundalpet,guntur";
         obj.grade="A";
         obj.schoolname="oxford";
         obj.display();
         
	}

}
