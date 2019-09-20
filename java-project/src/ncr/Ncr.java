package ncr;

import java.util.Scanner;

public class Ncr {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,r,fact=1,fact1=1,fact2=1,ncr;
		Scanner s=new Scanner(System.in);
		   System.out.println("Enter the value of n");
		n=s.nextInt();
		  System.out.println("Enter the value of n");
			r=s.nextInt();
       for(int i=1;i<=n;i++) {
    	   fact=fact*i;
    	   
       }
       for(int i=1;i<=r;i++) {
    	   fact1=fact1*i;
    	   
       }
       for(int i=1;i<=n-r;i++) {
    	   fact2=fact2*i;
    	   
       }
       ncr=(fact/(fact1*fact2));
       System.out.println("NCR factor for given no is"+ncr);
       s.close();
	}
}
