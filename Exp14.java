package java_programs_te;

import java.util.Scanner;

public class Exp14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
         int x=sc.nextInt();
         int y=sc.nextInt();
         int out=(x>y)==(x!=y)||++x- --y*(x+y)==0?x:y;
         System.out.println(out);
	}

}
