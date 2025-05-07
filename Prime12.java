package java_classobjectprograms_te;

public class Prime12 {
	static boolean isprime(int n) {
	   int c=2;
	   if(n==0)
		   return false;
	   if(n==1)
		   return false;
	   
	   for(int i=0;i<=n/2;i++){
		   if(n%c==0)
			   return false;
	   }
	   return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           boolean res1=isprime(10);
           boolean res2=isprime(7);
           System.out.println("result1 is :"+res1);
           System.out.println("result 2 is :"+res2);
           
	}

}
