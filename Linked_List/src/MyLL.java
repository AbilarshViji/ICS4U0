
public class MyLL {
	StudentInfo head;
	StudentInfo tail;
	int numInList;

	void addToHead(StudentInfo itemToAdd) {
		numInList++;
		itemToAdd.next = head;
		head = itemToAdd;
	}

	void addToTail(StudentInfo itemToAdd) {
		numInList++;
		if (numInList == 0) {
			tail = itemToAdd;
		} else {
			tail.next = itemToAdd;
			tail = itemToAdd;
		}
	}

	StudentInfo removeFromTail() {
		StudentInfo tempStudent;
		StudentInfo tempStudentReturn;
		if (numInList == 0) {
			System.out.println("No items in linked list");
			return null;
		} else if (numInList == 1) {
			numInList--;
			tempStudent = head;
			head = null;
			tail = null;
			return tempStudent;
		} else {// 2+ students in linked list
			numInList--;
			tempStudent = head;
			while (tempStudent.next != tail)
				tempStudent = tempStudent.next;
		}
		tail = tempStudent;
		tempStudentReturn = tempStudent.next;

		tempStudent.next = null;
		return tempStudentReturn;
	}

	StudentInfo removeFromHead() {
		StudentInfo tempStudent;
		StudentInfo tempStudentReturn;
		if (numInList == 0) {
			System.out.println("No items in linked list");
			return null;
		}
		
	}
	
	void displayList() {

	}
}
