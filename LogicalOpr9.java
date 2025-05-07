package java_programs_te;

public class LogicalOpr9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c=18;
		if(a>b && b>c)
			System.out.println("a is largest");
		if(c>b && b>a)
			System.out.println("c is largest");
		if(b>a && b>c)
			System.out.println("b is largest");
		
		if(a>b && b>c)
			System.out.println("a is largest");
           boolean d=true;
           System.out.println("toggle d :"+!d);
	}

}
