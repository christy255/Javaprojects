package foul;

import java.util.Scanner;

public class Foul {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,temp=0;
        Scanner s=new Scanner(System.in);
        int arrsize=5;
       int arr[]=new int[arrsize];
        System.out.println("enter the no of players");
        arrsize=s.nextInt();
        System.out.println("enter the no of fouls by players");
        for( i=0;i<arrsize;i++) {
        	arr[i]=s.nextInt();
        }
       temp=arr[0];
        for( i=1;i<arrsize;i++) {
        		if(temp>arr[i])
        			temp=arr[i];
        	}	
	 for( i=0;i<arrsize;i++) {
 		if(temp==arr[i])
        	System.out.println("the eligible player is "+i+"("+temp+")");
	 }
        s.close();
	}
}
