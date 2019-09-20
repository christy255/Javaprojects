package armstrong;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,sum=0;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
        b=a;
        
        do {
        	int c=b%10;
     int mul=((c*c)*c);
      sum=sum+mul;
      b=b/10;
     // System.out.println(mul);
        }while(b>0);
        if(sum==a) {
          System.out.println("The no is Armstrong");
        }
        else {
        	   System.out.println("The no is not Armstrong");
        }
        s.close();
	}

}
