public class TestProgram {

	public static void main(String[] args) {
		MyLL theLL = new MyLL();
		StudentInfo someStudent = new StudentInfo();
		someStudent = new StudentInfo();
		someStudent.setFirstName("A");
		someStudent.setLastName("B");
		someStudent.setStudentNumber(111111);
		theLL.addToTail(someStudent);

		someStudent = new StudentInfo();
		someStudent.setFirstName("C");
		someStudent.setLastName("D");
		someStudent.setStudentNumber(222222);
	//	theLL.removeFromHead();

		someStudent = new StudentInfo();
		someStudent.setFirstName("Egg");
		someStudent.setLastName("White");
		someStudent.setStudentNumber(333333);
		theLL.addToHead(someStudent);

		someStudent = new StudentInfo();
		someStudent.setFirstName("Potato");
		someStudent.setLastName("Head");
		someStudent.setStudentNumber(444444);
		theLL.addToTail(someStudent);

		someStudent = new StudentInfo();
		someStudent.setFirstName("Lemon");
		someStudent.setLastName("Fresh");
		someStudent.setStudentNumber(555555);
		theLL.addToHead(someStudent);

		theLL.removeFromTail();

	//	theLL.removeFromHead();
		
		theLL.displayList();
	}
}
