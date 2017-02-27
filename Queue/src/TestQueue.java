
public class TestQueue {

	public static void main(String[] args) {
		MyQueue theQueue = new MyQueue();
		StudentInfo someStudent = new StudentInfo();

		someStudent.setFirstName("A");
		someStudent.setLastName("B");
		someStudent.setStudentNumber(111111);
		someStudent.setNext(null);
		theQueue.enqueue(someStudent);

		someStudent = new StudentInfo();
		someStudent.setFirstName("C");
		someStudent.setLastName("D");
		someStudent.setStudentNumber(222222);
		someStudent.setNext(null);
		theQueue.enqueue(someStudent);

		someStudent = new StudentInfo();
		someStudent.setFirstName("Egg");
		someStudent.setLastName("White");
		someStudent.setStudentNumber(333333);
		someStudent.setNext(null);
		theQueue.enqueue(someStudent);

		someStudent = new StudentInfo();
		someStudent.setFirstName("Potato");
		someStudent.setLastName("Head");
		someStudent.setStudentNumber(444444);
		someStudent.setNext(null);
		theQueue.enqueue(someStudent);

		theQueue.dequeue();

		someStudent = new StudentInfo();
		someStudent.setFirstName("Lemon");
		someStudent.setLastName("Fresh");
		someStudent.setStudentNumber(555555);
		someStudent.setNext(null);
		theQueue.enqueue(someStudent);

		theQueue.displayQueue();

	}

}
