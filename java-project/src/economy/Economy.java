package economy;
import java.io.IOException;
import java.util.Scanner;

public class Economy {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int i;
        Scanner s=new Scanner(System.in);
        int arrsize=5,c=0;
        float avg=0;
       float arr[]=new float[arrsize];
        System.out.println("enter the no of bowlers");
        arrsize=s.nextInt();
        System.out.println("enter the no of runs conceded");
        for( i=0;i<arrsize;i++) {
        	arr[i]=s.nextInt();
        }
        float arr1[]=new float[arrsize];
        System.out.println("enter the bowls balled");
        for( i=0;i<arrsize;i++) {
        	arr1[i]=s.nextInt();
        }
        float arr2[]=new float[arrsize];
        System.out.println("the economy is");
        for( i=0;i<arrsize;i++) {
        	arr2[i]=arr[i]/(arr1[i]/6);
        }
        for(i=0;i<arrsize;i++) {
        System.out.println(arr2[i]);
        avg=avg+arr2[i];
        }
        float ec=avg/arrsize;
        System.out.println("the average of team is:"+ec);
        for(i=0;i<arrsize;i++) {
        if(arr2[i]<ec)
        	c++;
        }
        System.out.println("the no of player eligible is:"+c);
        s.close();
	}
}
