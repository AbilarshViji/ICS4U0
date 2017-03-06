
public class TestStack {

	public static void main(String[] args) {  //pushes, pops, and displays the stack after each step
		MyStack theStack = new MyStack();
		StudentInfo someStudent = new StudentInfo();
		
		theStack.pop(); //pop from null stack
		theStack.displayStack();
		
		someStudent.setFirstName("A");
		someStudent.setLastName("B");
		someStudent.setStudentNumber(111111);
		someStudent.setNext(null);
		theStack.push(someStudent); //push an object to the stack
		theStack.displayStack();

		someStudent = new StudentInfo();
		someStudent.setFirstName("C");
		someStudent.setLastName("D");
		someStudent.setStudentNumber(222222);
		someStudent.setNext(null);
		theStack.push(someStudent); //push an object to the stack
		theStack.displayStack();

		someStudent = new StudentInfo();
		someStudent.setFirstName("Egg");
		someStudent.setLastName("White");
		someStudent.setStudentNumber(333333);
		someStudent.setNext(null);
		theStack.push(someStudent); //push an object to the stack
		theStack.displayStack();

		someStudent = new StudentInfo();
		someStudent.setFirstName("Potato");
		someStudent.setLastName("Head");
		someStudent.setStudentNumber(444444);
		someStudent.setNext(null);
		theStack.push(someStudent); //push an object to the stack
		theStack.displayStack();

		theStack.pop(); //pop top object from stack
		theStack.displayStack();

		someStudent = new StudentInfo();
		someStudent.setFirstName("Lemon");
		someStudent.setLastName("Fresh");
		someStudent.setStudentNumber(555555);
		someStudent.setNext(null);
		theStack.push(someStudent); //push an object to the stack
		theStack.displayStack();

		theStack.pop(); //pop top object from stack
		theStack.displayStack();
	}

}
