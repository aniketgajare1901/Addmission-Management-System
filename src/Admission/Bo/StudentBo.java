package Admission.Bo;

public class StudentBo {
	private int id;
	private String fname;
	private String lname;
	private String email;
	private String phone;
	private String gender;
	private String DOB;
	private String address;
	private String city;
	private String pin;
	private String state;
	private String country;
	private String hobbies;
	private String qulification;
	private String course;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	public String getQulification() {
		return qulification;
	}
	public void setQulification(String qulification) {
		this.qulification = qulification;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "StudentBo [ fname=" + fname + ", lname=" + lname + ", email=" + email + ", phone=" + phone
				+ ", gender=" + gender + ", DOB=" + DOB + ", address=" + address + ", city=" + city + ", pin=" + pin
				+ ", state=" + state + ", country=" + country + ", hobbies=" + hobbies + ", qulification="
				+ qulification + ", course=" + course + "]";
	}
	public StudentBo(int id, String fname, String lname, String email, String phone, String gender, String dOB,
			String address, String city, String pin, String state, String country, String hobbies, String qulification,
			String course) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
		DOB = dOB;
		this.address = address;
		this.city = city;
		this.pin = pin;
		this.state = state;
		this.country = country;
		this.hobbies = hobbies;
		this.qulification = qulification;
		this.course = course;
	}
	public StudentBo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
