package java_classobjectprograms_te;

public class Sum8 {
     void caluculatesum() {
    	 int sum;
    	 System.out.println("if we print local variable without intializing it will throw an error");
    	 sum=20+30;
    	 
    	 System.out.println("sum is "+sum);
     } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum8 obj=new Sum8();
		obj.caluculatesum();

	}

}
