package employeeproject;
public interface UserBusiness {
	boolean registerUser(Users u);
	boolean updateUser();
	Users[] SearchBySkills();
	boolean AuthenticateUser(String emailid);
	
	void ListEmployees(Users u);

}

