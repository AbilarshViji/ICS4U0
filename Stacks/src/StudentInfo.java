
public class StudentInfo {
	private int studentNumber; //stores student number
	private String firstName; //stores first name
	private String lastName; //stores last name
	private StudentInfo next; //stores next pointer
	
	public int getStudentNumber() { //returns student number
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) { //set student number
		this.studentNumber = studentNumber;
	}
	public String getFirstName() { //return first name
		return firstName;
	}
	public void setFirstName(String firstName) { //set first name
		this.firstName = firstName;
	}
	public String getLastName() { //return last name
		return lastName;
	}
	public void setLastName(String lastName) { //set last name
		this.lastName = lastName;
	}
	public StudentInfo getNext() { //return next value
		return next;
	}
	public void setNext(StudentInfo next) { //set next value
		this.next = next;
	}
}
