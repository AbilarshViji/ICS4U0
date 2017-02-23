public class MyLL {
	StudentInfo head;
	StudentInfo tail;
	int numInList;

	void addToHead(StudentInfo itemToAdd) {
		numInList++;
		itemToAdd.setNext(head);
		head = itemToAdd;
		if (numInList == 1) {
			tail = head;
		}
	}

	void addToTail(StudentInfo itemToAdd) {
		if (numInList == 0) {
			tail = itemToAdd;
			head = tail;
			numInList++;
		} else {
			tail.setNext(itemToAdd);
			tail = itemToAdd;
			numInList++;
		}
	}

	StudentInfo removeFromTail() {
		StudentInfo tempStudent;
		final StudentInfo tempStudentReturn;
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
			while (tempStudent.getNext() != tail) {
				tempStudent = tempStudent.getNext();
			}
		}
		tail = tempStudent;
		tempStudentReturn = tempStudent.getNext();

		tempStudent.setNext(null);
		return tempStudentReturn;
	}

	StudentInfo removeFromHead() {
		final StudentInfo tempStudent;
		if (numInList == 0) {
			System.out.println("No items in linked list");
			return null;
		}
		tempStudent = head;
		head = tempStudent.getNext();
		tempStudent.setNext(null);
		numInList--;
		return tempStudent;
	}

	void displayList() {
		StudentInfo tempStudent;
		if (numInList == 0) {
			System.out.println("No items in linked list");
		} else {
			tempStudent = head;
			for (int i = 0; i < numInList; i++) {
				// System.out.println(numInList);
				System.out.println(tempStudent.getFirstName());
				tempStudent = tempStudent.getNext();
			}
		}
	}
}