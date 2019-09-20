package sum;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,fact=0;
		Scanner s=new Scanner(System.in);
		do {
		   System.out.println("Enter the no ");
		a=s.nextInt();
		}while(a<0);
       for(int i=1;i<=a;i++) {
    	   fact=fact+i;
    	   
       }
       
       System.out.println("The sum is " +fact);
		
        
        
        s.close();
	}
}

