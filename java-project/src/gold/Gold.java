package gold;

import java.util.Scanner;

public class Gold {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,sum;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter gold in kg");
		a=s.nextInt();
		sum=a;
        while(a>0) {
        	a=a/5;
        sum=sum+a;
        }
       
          System.out.println("Number of Sculptors can be made is "+sum);
       
        s.close();
	}
}
