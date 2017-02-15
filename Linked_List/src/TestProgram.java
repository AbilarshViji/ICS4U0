public class TestProgram {

	public static void main(String[] args) {
		MyLL theLL = new MyLL();
		StudentInfo someStudent = new StudentInfo();
		someStudent.firstName = "Bugs";
		someStudent.lastName = "Bunny";
		someStudent.studentNumber = 562374;
		someStudent.next = null;
		theLL.addToTail(someStudent);
		someStudent = new StudentInfo();
		someStudent.firstName = "Lola";
		someStudent.next = null;
		theLL.addToTail(someStudent);

	}

}
