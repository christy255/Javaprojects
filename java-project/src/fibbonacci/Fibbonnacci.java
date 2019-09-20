package fibbonacci;

import java.util.Scanner;

public class Fibbonnacci {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,c=2,a=0,b=1,f;
		
		Scanner s=new Scanner(System.in);
		   System.out.println("Enter the no ");
		n=s.nextInt();
		System.out.print("The fibbonacci series is "+a+" " +b);
      do{
    	   f=a+b;
    	 a=b;
    	  b=f;
    	  
    	    System.out.print(" "+f);  
    	    c++;
       }while(c!=n);
       
   
        
        
        s.close();
	}

	}

