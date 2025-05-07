package java_classobjectprograms_te;

import java.util.Scanner;

public class Arithmaticatest13 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmaticoperations13 obj=new Arithmaticoperations13();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a:");
		int a=sc.nextInt();
		System.out.println("enter b:");
		int b=sc.nextInt();
		int r1=obj.add(a,b);
		int r2=obj.sub(a, b);
		int r3=obj.mul(a, b);
		double r4=obj.div(a, b);
		
		System.out.println("a+b= "+r1);
		
		System.out.println("a-b= "+r2);

		System.out.println("a*b= "+r3);

		System.out.println("a/b= "+r4);

		
       
	}

}
