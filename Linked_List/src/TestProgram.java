import hsa.Console;
public class TestProgram {

	public static void main(String[] args) {
		Console c = new Console();
		MyLL theLL = new MyLL();
		StudentInfo someStudent = new StudentInfo();
		someStudent.firstName = "Bugs";
		someStudent.next = null;
		theLL.addToTail(someStudent);
		someStudent = new StudentInfo();
		someStudent.firstName = "Lola";
		someStudent.next = null;
		theLL.addToTail(someStudent);

	}

}
