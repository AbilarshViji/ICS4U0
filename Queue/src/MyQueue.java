public class MyQueue {
	StudentInfo head;
	int numInList;

	void enqueue(StudentInfo itemToAdd) {
		StudentInfo tempStudent;
		if (numInList == 0) {
			head = itemToAdd;
			numInList++;
		} else {
			tempStudent = head;
			while (true) {
				if (tempStudent.getNext() == null) {
					tempStudent.setNext(itemToAdd);
					break;
				} else {
					tempStudent = tempStudent.getNext();
				}
			}
			numInList++;
		}
	}

	StudentInfo dequeue() {
		final StudentInfo tempStudent;
		if (numInList == 0) {
			System.out.println("No items in queue");
			return null;
		}
		tempStudent = head;
		head = tempStudent.getNext();
		tempStudent.setNext(null);
		numInList--;
		return tempStudent;
	}

	void displayQueue() {
		StudentInfo tempStudent;
		if (numInList == 0) {
			System.out.println("No items in queue");
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
