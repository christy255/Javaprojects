package resume;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Resume {
         String name,degree,branch;
        String contact,age;
        Resume(String name,String age,String degree,String branch,String contact){
        	this.name=name;
        	this.age=age;
        	this.degree=degree;
        	this.branch=branch;
        	this.contact=contact;
         }
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		 String name,degree,branch;
		  String age;
		 String contact;
BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter your Name");
name=br.readLine();
System.out.println("Enter Your Age");
age=br.readLine();
int a=Integer.parseInt(age);
System.out.println("Enter Your Degree");
degree=br.readLine();
System.out.println("Enter Your Branch");
branch=br.readLine();
System.out.println("Enter Your ContactNumber");
contact=br.readLine();
int c=Integer.parseInt(contact);
System.out.println("Name \t:"+name);
System.out.println("Age \t:"+a);
System.out.println("Degree \t:"+degree);
System.out.println("Branch \t:"+branch);
System.out.println("ContactNo :"+c);
	}

}
