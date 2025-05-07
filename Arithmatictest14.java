package java_classobjectprograms_te;

import java.util.Scanner;

public class Arithmatictest14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmaticoperations14 obj=new Arithmaticoperations14();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value one:");
		int valueone=sc.nextInt();
		System.out.println("enter value two:");
		int valuetwo=sc.nextInt();
		
		System.out.println("a+b= "+obj.add(valueone,valuetwo));
		
		System.out.println("a-b= "+obj.sub(valueone,valuetwo));

		System.out.println("a*b= "+obj.mul(valueone,valuetwo));

		System.out.println("a/b= "+obj.div(valueone,valuetwo));
	}

}
