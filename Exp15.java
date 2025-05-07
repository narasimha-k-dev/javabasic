package java_programs_te;

import java.util.Scanner;

public class Exp15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int p=sc.nextInt();
		int q=sc.nextInt();
		int output=((p<=q)&&(p>=q)||p++ - q-- *(p/q)>=(p%q)?p:q)+(++p*--q);
		
        System.out.println(output);
	}

}
