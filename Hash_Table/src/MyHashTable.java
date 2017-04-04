import java.util.ArrayList;

public class MyHashTable {
	private ArrayList<EmployeeInfo>[] buckets;

	public MyHashTable(int numOfBuckets) {
		buckets = new ArrayList[numOfBuckets];

		for (int i = 0; i < numOfBuckets; i++) {
			buckets[i] = new ArrayList<EmployeeInfo>();
		}
	}

	public int calcBucket(int num) {
		return num % buckets.length;
	}

	 public boolean addEmployee(EmployeeInfo theEmployee) {

	 }

	public int searchEmployee(int employeeNumber) {

	}

	public EmployeeInfo removeEmployee(int employeeNumber) {
return ;
	}

	public void displayContents() {

	}

}
