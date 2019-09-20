package perfect;

import java.util.Scanner;

public class Perfect {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,sum=0;
		Scanner s=new Scanner(System.in);
		
		   System.out.println("Enter the no ");
		a=s.nextInt();
		int n=a;
		System.out.println("the divisors of the no are");
       for(int i=1;i<=a/2;i++) {
    	  if(a%i==0) {
    	   System.out.println(i);
    	  sum=sum+i;
    	  }
       }
       
       System.out.println("The sum of the divisors are " +sum);
		if(sum==n)
			System.out.println("it is a perfect no");
		else
			System.out.println("it is not a perfect no");
        
        
        s.close();
	}
}
