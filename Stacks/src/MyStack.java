
public class MyStack {
	int numInList; //stores the number of objects within the stack
	StudentInfo top; //stores the top of the stack

	void push(StudentInfo itemToAdd) { //adds item to the top of stack
		numInList++;
		itemToAdd.setNext(top);
		top = itemToAdd;
	}

	boolean empty() { //returns a boolean on if the stack is empty or not
		if (numInList == 0) {
			return false;
		} else {
			return true;
		}
	}

	StudentInfo peek() { //returns the object at the top of the stack
		return top;
	}

	StudentInfo pop() { //removes and returns the data stored at the top
		StudentInfo tempStudent;
		if (numInList == 0) { //if the stack is empty, return null
			return null;
		}
		tempStudent = top;				
		top = tempStudent.getNext(); 
		tempStudent.setNext(null);
		numInList--;
		return tempStudent;
	}

	void displayStack() { //displays the first names in the list
		StudentInfo tempStudent;
		if (numInList == 0) { //if the stack is empty, state that it is
			print("No items in stack");
		} else { //else prints all the first names in the stack
			tempStudent = top;
			for (int i = 0; i < numInList; i++) { //loops through all the objects in the stack and prints
				print("First Name: " + tempStudent.getFirstName());
				tempStudent = tempStudent.getNext(); //goes to next object
			}
		}
		print("");
	}

	public void print(String data) { //prints data on a new line
		System.out.println(data);
	}
}
