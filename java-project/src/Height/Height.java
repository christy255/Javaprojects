package Height;
import java.util.Scanner;
public class Height {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
        Scanner s=new Scanner(System.in);
        int arrsize=5;
        float arr[]=new float[arrsize];
        System.out.println("enter the no of students");
        arrsize=s.nextInt();
        System.out.println("enter the heihts of students");
        for( i=0;i<arrsize;i++) {
        	arr[i]=s.nextFloat();
        }
        for( i=0;i<arrsize;i++) {
        	for(j=i;j<arrsize;j++) {
        		
        	if(arr[i]>arr[j]) {
        	float	temp=arr[i];
        		arr[i]=arr[j];
        		arr[j]=temp;
        	}	
        }
        }
        System.out.println("the height in order");
        for(i=0;i<arrsize;i++) {
        	System.out.println(arr[i]);	
        }
        s.close();
	}

}
