import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Room {
String ac,cot,cable,wifi,laundry,fine;
static int roomno=0;
public void booking() throws IOException
{
     /* public void room(String ac,String cot,String cable,String wifi,String laundry)
         {
	 this.ac=ac;
	 this.cot=cot;
	 this.cable=cable;
	 this.wifi=wifi;
	 this.laundry=laundry;
         }
	public static void main(String[] args)throws IOException {*/
		// TODO Auto-generated method stub
String ac;
String cot;
String cable;
String wifi;
String laundry;
String fine;
int a,b,c,d,e;
int sum;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
do {
System.out.println("Booking"+"\n"+"please choose the services required");
System.out.println("AC(yes/no)");
ac=br.readLine();
System.out.println("single/double(s/d)");
cot=br.readLine();
System.out.println("with Cable/without Cable(yes/no)");
cable=br.readLine();
System.out.println("with wifi/without wifi(yes/no)");
wifi=br.readLine();
System.out.println("laundry/nolaundry(yes/no)");
laundry=br.readLine();
if (ac.equals("yes"))
	a=1000;

else 
	a=750;

if(cot.equals("d"))
	b=350;
else
	b=0;
if(cable.equals("s"))
	c=50;
else
	c=0;
if(wifi.equals("yes"))
	d=200;
else
	d=0;
if(laundry.equals("yes"))
	e=100;
else
	e=0;
sum=a+b+c+d+e;
System.out.println("The total Charge is"+sum);
System.out.println("services are available for");
if (ac.equals("yes"))
	System.out.println("AC room");

else 
	System.out.println("non ac room");

if(cot.equals("d"))
	System.out.println("doble cot");
else
	System.out.println("single cot");
if(cable.equals("yes"))
	System.out.println("cable Enabled");
else
	System.out.println("no cable");
if(wifi.equals("yes"))
	System.out.println("with wifi");
else
	System.out.println("without wifi");
if(laundry.equals("yes"))
	System.out.println("laundry enabled");
else
	System.out.println("no laundry enabled");
System.out.println("Is it is ok for you?yes/no");
fine=br.readLine();
	}while(fine.equals("no"));
System.out.println("Thank you for booking ,your room no.is "+ ++roomno);
	}
}