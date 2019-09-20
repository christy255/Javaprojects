package leapyear;
import java.util.*;
public class Leap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the  year");
		year=s.nextInt();
		int flag=0;
		if(year%4==0)
		{
			if(year%400==0 && year%100==0)
				flag=1;	
		}
		if(flag==1)
			System.out.println("the year is leap year");
		else
			System.out.println("It is not a leap year");
		s.close();
	}
}
