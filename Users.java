package employeeproject;
//pojo class

public class Users {
	private int empId;
	private String name;
	private String qualification;
	private String emailid;
	private String contactnumber;
	private String address;
	private int dateofbirth;
	private String status;
	private  String typeofuser;
	private String ibu;
	
	//private Skills s;
	
	
	// Employee id 
	static int id=100;
	public Users() {
		this.empId=id++;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	//name of the employee
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	// email Id of employee
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	// contact number of employee
	public String getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}
	//address
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	//date of birth
	public int getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(int dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	// Status
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	//type of user
	public String getTypeofuser() {
		return typeofuser;
	}
	public void setTypeofuser(String typeofuser) {
		this.typeofuser = typeofuser;
	}
	public String getIbu() {
		return ibu;
	}
	public void setIbu(String ibu) {
		this.ibu = ibu;
	}
	

}

