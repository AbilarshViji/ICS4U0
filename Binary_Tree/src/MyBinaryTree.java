
public class MyBinaryTree {
	StudentInfo root;
	int numItems = 0;

	StudentInfo getRoot() {
		return root;
	}

	void addToTree(StudentInfo itemToAdd, StudentInfo targetRoot) {
		if (numItems == 0) {
			targetRoot = itemToAdd;
			numItems++;
		} else {
			if (itemToAdd.getStudentNumber() > targetRoot.getStudentNumber()) {
				if (targetRoot == null) {
					targetRoot = targetRoot.getRight();
					numItems++;
				} else {
					addToTree(itemToAdd, targetRoot.getRight());
				}
			} else {
				targetRoot = targetRoot.getLeft();
				addToTree(itemToAdd, targetRoot);
			}
		}
	}

	void traverseInorder(StudentInfo targetRoot) {
		if (targetRoot != null) {
			if (targetRoot.getLeft() != null) {
				traverseInorder(targetRoot.getLeft());
			}
			System.out.println(
					(targetRoot.getStudentNumber() + " " + targetRoot.getFirstName() + " " + targetRoot.getLastName()));
			if (targetRoot.getRight() != null) {
				traverseInorder(targetRoot.getRight());
			}
		}
	}

	void traversePreorder(StudentInfo targetRoot) {
		if (targetRoot != null) {
			System.out.println(
					(targetRoot.getStudentNumber() + " " + targetRoot.getFirstName() + " " + targetRoot.getLastName()));
			if (targetRoot.getLeft() != null) {
				traversePreorder(targetRoot.getLeft());
			}
			if (targetRoot.getRight() != null) {
				traversePreorder(targetRoot.getRight());
			}
		}
	}

	void traversePostorder(StudentInfo targetRoot) {
		if (root == null) {
			System.out.println("");
			return;
		}
		traverseInorder(root.getLeft());
		traverseInorder(root.getRight());
		System.out.print((root.getStudentNumber() + ", "));

	}
}
