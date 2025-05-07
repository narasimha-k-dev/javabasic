package java_programs_te;

import java.util.Scanner;

public class Switch26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the month number: ");
        int i=sc.nextInt();
        switch(i) {
        case 1: 
        	System.out.println("january and it is winter");
        	break;
        case 2:
        	System.out.println("february and it is winter");
        	break;
        case 3:
        	System.out.println("march and it is winter");
        	break;
        case 4:
        	System.out.println("april and it is spring");
        	break;
        case 5:
        	System.out.println("may and it is spring");
        	break;
        case 6:
        	System.out.println("june and it is spring");
        	break;
        case 7:
        	System.out.println("july and it is summer");
        	break;
        case 8:
        	System.out.println("august and it is summer");
        	break;
        case 9:
        	System.out.println("september and it is summer");
        	break;
        case 10:
        	System.out.println("october and it is autumn");
        	break;
        case 11:
        	System.out.println("november and it is autumn");
        	break;
        case 12:
        	System.out.println("december and it is autumn");
        	break;
        default:
        	System.out.println("enter number between 1-12");

        
        }
        sc.close();
        }
        
	}


