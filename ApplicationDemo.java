package employeeproject;
import java.util.Scanner;

public class ApplicationDemo {
	public static void main(String[] args) {
	Users u =new Users();
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Name");
	String name=sc.next();
	u.setName(name);
	
	System.out.println("Enter the email id ");
	String emailid= sc.next();
	u.setEmailid(emailid);
	
	boolean valid=AuthenticateUser(emailid);
    if(!valid) {
	System.out.println("Email Id is invalid");
	System.out.println("enter Email Id:");
	u.setEmailid(emailid);
	}
	
	
	UsersBusinnesslogic  ub=new UsersBusinnesslogic();
	ub.registerUser(u);
	ub.ListEmployees(u);
	ub.validateUser(u);

	}

	private static boolean AuthenticateUser(String emailid) {
		// TODO Auto-generated method stub
		return false;
	}

}
