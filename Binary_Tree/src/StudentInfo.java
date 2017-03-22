public class StudentInfo {
	private int studentNumber;
	private String firstName;
	private String lastName;
	private StudentInfo left;
	private StudentInfo right;

	public StudentInfo(int studentNumber, String firstName, String lastName) {
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.left = null;
		this.right = null;
	}

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

	public StudentInfo getLeft() {
		return left;
	}

	public void setLeft(StudentInfo left) {
		this.left = left;
	}

	public StudentInfo getRight() {
		return right;
	}

	public void setRight(StudentInfo right) {
		this.right = right;
	}
}
