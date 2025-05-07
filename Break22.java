package java_programs_te;

import java.util.Scanner;

public class Break22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc =new Scanner(System.in);
         int i;
         while(true) {
        	 System.out.println("enter number :");
        	 i=sc.nextInt();
        	 if(i<0) {
        		 System.out.println("the entered number is negative,The loop is breaking");
        		 break;
        	 }
         }
         sc.close();
	}

}
