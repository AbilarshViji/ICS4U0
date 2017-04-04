
public class MyBinaryTree {
	StudentInfo root; //the root of the tree
	int numItems = 0; //the number of items in the tree

	StudentInfo getRoot() { //returns root
		return root;
	}

	void addToTree(StudentInfo itemToAdd, StudentInfo targetRoot) { //adds items to tree
		if (numItems == 0) { //if the tree is empty, set the item as the root
			root = itemToAdd;
			numItems++;
		} else { //Recursively traverses through tree to add item
			//if (targetRoot != null) {
				if (itemToAdd.getStudentNumber() > targetRoot.getStudentNumber()) { //checks if object should be put on left or right
					if (targetRoot.getRight() == null) { //sets object to left of root
						targetRoot.setRight(itemToAdd);
						numItems++;
					} else { //continues to traverse tree
						addToTree(itemToAdd, targetRoot.getRight());
					}
				} else {
					if (targetRoot.getLeft() == null) {
						targetRoot.setLeft(itemToAdd);
						numItems++;
					} else {
						addToTree(itemToAdd, targetRoot.getLeft());
					}
			//	}
			}
		}
	}

	void traverseInorder(StudentInfo targetRoot) { //traverses and prints tree in order
		if (targetRoot != null) {
			if (targetRoot.getLeft() != null) {
				traverseInorder(targetRoot.getLeft());
			}
			System.out.println(
					targetRoot.getStudentNumber() + " " + targetRoot.getFirstName() + " " + targetRoot.getLastName());
			if (targetRoot.getRight() != null) {
				traverseInorder(targetRoot.getRight());
			}
		}
	}

	void traversePreorder(StudentInfo targetRoot) { //traverses and prints tree preorder
		if (targetRoot != null) {
			System.out.println(
					targetRoot.getStudentNumber() + " " + targetRoot.getFirstName() + " " + targetRoot.getLastName());
			if (targetRoot.getLeft() != null) {
				traversePreorder(targetRoot.getLeft());
			}
			if (targetRoot.getRight() != null) {
				traversePreorder(targetRoot.getRight());
			}
		}
	}

	void traversePostorder(StudentInfo targetRoot) { //traverses and prints tree postorder
		if (targetRoot != null) {
			if (targetRoot.getLeft() != null) {
				traversePostorder(targetRoot.getLeft());
			}
			if (targetRoot.getRight() != null) {
				traversePostorder(targetRoot.getRight());
			}
			System.out.println(
					targetRoot.getStudentNumber() + " " + targetRoot.getFirstName() + " " + targetRoot.getLastName());
		}
	}
}
