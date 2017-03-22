public class TestBinaryTree {
	public static void main(String[] args) {
		MyBinaryTree students = new MyBinaryTree();
		
		StudentInfo vithuran = new StudentInfo(123456, "Vithuran", "Sadagopan");
		StudentInfo mathuran = new StudentInfo(234567, "Mathuran", "Sadagopan");
		StudentInfo richard = new StudentInfo(345678, "Richard", "Huang");
		StudentInfo bilaal = new StudentInfo(456789, "Bilaal", "Hussein");
		StudentInfo raj = new StudentInfo(567890, "Raj", "Reddy");
		StudentInfo abilarsh = new StudentInfo(678901, "Abilarsh", "Viji");
		StudentInfo murali = new StudentInfo(789012, "Murali", "Andoor");
		
		students.addToTree(murali, students.getRoot());
		students.addToTree(mathuran, students.getRoot());
		students.addToTree(bilaal, students.getRoot());
		students.addToTree(richard, students.getRoot());
		students.addToTree(raj, students.getRoot());
		students.addToTree(vithuran, students.getRoot());
		students.addToTree(abilarsh, students.getRoot());
		
		students.traverseInorder(students.getRoot());
		students.traversePreorder(students.getRoot());
		students.traversePostorder(students.getRoot());
	}
}