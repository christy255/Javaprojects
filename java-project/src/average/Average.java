package average;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,sum=0;
        Scanner s=new Scanner(System.in);
        int arrsize=5;
       int arr[]=new int[arrsize];
        System.out.println("enter the no of students");
        arrsize=s.nextInt();
        System.out.println("enter the marks of students");
        for( i=0;i<arrsize;i++) {
        	arr[i]=s.nextInt();
        }
        for( i=0;i<arrsize;i++) {
        	
        		 sum=sum+arr[i];
        		
        }
       int avg= sum / arrsize;
        System.out.println("the average is "+avg);
        s.close();
	}
}
