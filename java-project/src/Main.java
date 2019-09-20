import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main
{
		String name;
		String address;
		String contactNumber;
		String email;
		String proofType;
		String proofID;
		static String i;
		static int regID=0;
		
			public  Main(String name,String address,String contactNumber,String email,String proofType,String proofID)
			{
					this.name=name;
					this.address=address;
					this.contactNumber=contactNumber;
					this.email=email;
					this.proofType=proofType;
					this.proofID=proofID;
			}
			
			public static void main(String[] args)throws IOException
			{
				// TODO Auto-generated method stub
					String name;
					String address;
					String contactNumber;
					String email;
					String proofType;
					String proofID;
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
					do {
					System.out.println("Enter your Name");
						name = br.readLine();
						System.out.println("Enter your Address");
						address = br.readLine();
						System.out.println("Enter your Contact Number");
						contactNumber = br.readLine();
						System.out.println("Enter your email");
						email = br.readLine();
						System.out.println("Enter your Proof Type");
						proofType = br.readLine();
						System.out.println("Enter your Id");
						proofID = br.readLine();
						Room r=new Room();
		                r.booking();
						Customer customer=new Customer(name,address,contactNumber,email,proofType,proofID);
						customer.Register();
						System.out.println("do you want to continue?yes/no");
						i=br.readLine();
					}while(i.equals("yes"));
	}
}
