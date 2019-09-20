package tollgate;

import java.util.Scanner;

public class Tollgate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,c=0,v=0;
        Scanner s=new Scanner(System.in);
        int arrsize=5;
       int arr[]=new int[arrsize];
        System.out.println("enter the no of vehicles");
        arrsize=s.nextInt();
        System.out.println("fair collected");
        for( i=0;i<arrsize;i++) {
        	arr[i]=s.nextInt();
        }
        for( i=0;i<arrsize;i++) {
        	if(arr[i]<50 && arr[i]>0)	
        		c++;
        	if(arr[i]>50)
        		v++;
        }
        
        System.out.println("no of light vehicles is "+c+"no of heavy vehicle is"+v);
        s.close();
	}
}

