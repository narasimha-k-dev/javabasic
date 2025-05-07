package java_programs_te;

import java.util.Scanner;

public class NestedTerminary26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        String s=(i==0)?"it is zero":(i>0)?"positive" + ((i%2==0)?" and even":"and odd" ):"and negative"+ ((i%2==0)?"and even":"and odd" );
        		System.out.println(s);
	}

}
