public class Customer
{
		String name;
		String address;
		String contactNumber;
	    String email;
		String proofType;
		String proofID;
		static int regID=0;
		        public  Customer(String name,String address,String contactNumber,String email,String proofType,String proofID)
		        {
					this.name=name;
					this.address=address;
					this.contactNumber=contactNumber;
					this.email=email;
					this.proofType=proofType;
					this.proofID=proofID;
				}
			
				public void Register()
				{
					System.out.println("your details are");
					System.out.println("Name:"+name);	
					System.out.println("Address:"+address);
					System.out.println("Contact No:"+contactNumber);
					System.out.println("Email:"+email);
					System.out.println("Proof Type:"+proofType);
					System.out.println("ProofID:"+proofID);
					System.out.println("Thanks for registering, your id is:  "+ ++regID);
					
				}
}
