
public class MyStack {
	int numInList;
	StudentInfo top;

	void push(StudentInfo itemToAdd) {
		numInList++;
		itemToAdd.setNext(top);
		top = itemToAdd;
	}

	boolean empty() {
		if (numInList == 0) {
			return false;
		} else {
			return true;
		}
	}

	StudentInfo peek() {
		System.out.println(top.getFirstName());
		return top;
	}

	StudentInfo pop() {
		StudentInfo tempStudent;
		if (numInList == 0) {
			System.out.println("No items in stack");
			return null;
		}
		tempStudent = top;
		top = tempStudent.getNext();
		tempStudent.setNext(null);
		numInList--;
		System.out.println(tempStudent.getFirstName());
		return tempStudent;
	}

	void displayStack() {
		StudentInfo tempStudent;
		if (numInList == 0) {
			System.out.println("No items in stack");
		} else {
			tempStudent = top;
			for (int i = 0; i < numInList; i++) {
				// System.out.println(numInList);
				System.out.print("First Name: ");
				System.out.println(tempStudent.getFirstName());
				tempStudent = tempStudent.getNext();
			}
		}
	}
}
