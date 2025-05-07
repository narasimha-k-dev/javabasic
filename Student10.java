package java_classobjectprograms_te;

public class Student10 {
	 static String universityName;

	   
	    static void displayUniversityName() {
	        System.out.println("University Name: " + universityName);
	    }

	    public static void main(String[] args) {
	    	Student10 student=new Student10();
	        
	        System.out.println("Before assigning:");
	        student.displayUniversityName();  

	       
	        student.universityName = "JNTU Kakinada";

	        
	        System.out.println("After assigning:");
	        student.displayUniversityName(); 
	    }
}
