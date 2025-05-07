package java_programs_te;

import java.util.Scanner;

public class Terminary28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks");
         int marks=sc.nextInt();
         String s=(marks>=90)?"A GRADE":(marks>=80)?"B GRADE":(marks>=70)?"C GRADE":(marks>=60)?"D GRADE":" F GRADE";
         System.out.println("the student grade is "+s);
	}
	

}
