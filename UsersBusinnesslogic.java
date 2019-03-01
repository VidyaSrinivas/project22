package employeeproject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsersBusinnesslogic implements UserBusiness {

	@Override
	public boolean registerUser(Users u) {
	if(	validateUser(u))
		System.out.println("user registred to successfully");
	else
		System.out.println("user registred to successfully");
		return false;
	}

	boolean validateUser(Users u) {
		
		return false;
	}

	@Override
	public boolean updateUser() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Users[] SearchBySkills() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean AuthenticateUser(String emailid) {
		Pattern P1 = Pattern.compile("(^[a-z1-9]*)\\ @([a-z]*)\\.([a-zA-Z]*)");
		Matcher m1 =P1.matcher(emailid);
			if(m1.find()) { 
				return true;
			}
			else
		return false;
	}

	@Override
	public void ListEmployees(Users u) {
	System.out.println("Emp Id:"+u.getEmpId());
	System.out.println("Emp Name:"+u.getName());
	System.out.println("Emp email"+u.getEmailid());
	}

	
	

}
