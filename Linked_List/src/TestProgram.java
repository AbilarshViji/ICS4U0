public class TestProgram {

	public static void main(String[] args) {
		MyLL theLL = new MyLL();
		StudentInfo someStudent = new StudentInfo();
		someStudent.setFirstName("Bugs");
		someStudent.setLastName("Bunny");
		someStudent.setStudentNumber(562374);
		someStudent.setNext(null);
		theLL.addToTail(someStudent);
		someStudent = new StudentInfo();
		someStudent.setFirstName("Lola");
		someStudent.setNext(null);
		theLL.addToHead(someStudent);
		theLL.displayList();
	}
}
