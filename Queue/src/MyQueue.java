public class MyQueue {
	StudentInfo front;
	int numInList;

	void enqueue(StudentInfo itemToAdd) {
		StudentInfo tempStudent;
		if (numInList == 0) {
			front = itemToAdd;
			numInList++;
		} else {
			tempStudent = front;
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
			print("No items in queue");
			return null;
		}
		tempStudent = front;
		front = tempStudent.getNext();
		tempStudent.setNext(null);
		numInList--;
		return tempStudent;
	}

	StudentInfo peek() {
		return front;
	}

	void displayQueue() {
		StudentInfo tempStudent;
		if (numInList == 0) {
			System.out.println("No items in queue");
		} else {
			tempStudent = front;
			for (int i = 0; i < numInList; i++) {
				// System.out.println(numInList);
				print(tempStudent.getFirstName());
				tempStudent = tempStudent.getNext();
			}
		}
	}

	public void print(String data) {
		System.out.println(data);
	}
}
