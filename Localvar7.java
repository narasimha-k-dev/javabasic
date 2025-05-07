package java_classobjectprograms_te;

public class Localvar7 {
	
	void calulatearea() {
		int length=10;
		int breadth=20;
		int res=length*breadth;
		System.out.println("area of rectangle is :"+res);
	}
    void displaylength() {
    	System.out.println("we cannot acces the length varible because the scope of that varible is whithin calculatearea() method caused due to it is declared in that method");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Localvar7 obj=new Localvar7();
		obj.calulatearea();
		obj.displaylength();

	}

}
