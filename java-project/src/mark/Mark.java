package mark;

import java.util.Scanner;

public class Mark {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
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
        	for(j=i;j<arrsize;j++) {
        		
        	if(arr[i]<arr[j]) {
        	int	temp=arr[i];
        		arr[i]=arr[j];
        		arr[j]=temp;
        	}	
        }
        }
        System.out.println("the priority of mark ");
        for(i=0;i<arrsize;i++) {
        	System.out.println(arr[i]);	
        }
        s.close();
	}

}


