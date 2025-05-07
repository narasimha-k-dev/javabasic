package java_programs_te;

import java.util.Scanner;

public class DoWhile24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int password=123;
		int i=0;
		boolean flag=true;
		Scanner sc=new Scanner(System.in);
		
		do{
			System.out.println("please, enter the password, attempt no("+(i+1)+")");
			int temp=sc.nextInt();
			if(temp==password) {
				System.out.println("ACCES GRANTED");
				flag=false;
				break;
			}
			i++;
		}while(i<3) ;
		
		if(flag)
			System.out.println("sorry,number of attemps are over");
		sc.close();

	}
	

}
