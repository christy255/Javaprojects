package retest;

import java.util.Scanner;

public class Retest {
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
        	
        		 if(arr[i]<50)
        			 sum++;    		
        }
       int avg= sum / arrsize;
        System.out.println("no of students appearing retst is "+avg);
        s.close();
	}
}
