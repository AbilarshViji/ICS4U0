
public class StudentInfo {
	private int studentNumber;
	private String firstName;
	private String lastName;
	private StudentInfo next;
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public StudentInfo getNext() {
		return next;
	}
	public void setNext(StudentInfo next) {
		this.next = next;
	}
}
