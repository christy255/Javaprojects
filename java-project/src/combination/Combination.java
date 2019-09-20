package combination;

import java.util.Scanner;

public class Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,fact=1;
		Scanner s=new Scanner(System.in);
		   System.out.println("Enter the no of alphabets in your name");
		a=s.nextInt();
       for(int i=1;i<=a;i++) {
    	   fact=fact*i;
    	   
       }
       
       System.out.println("The no of combinations are " +fact);  
        
        
        s.close();
	}

	}

