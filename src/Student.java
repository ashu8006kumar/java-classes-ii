
public class Student {
	static int counter=0;
	
	
	int rollNumber;
	String name;
	
	public Student() {
		counter=counter+1;
	} 
	
	void printData() {
		System.out.println("Name-" + name);
		System.out.println("Roll Number-" + rollNumber);
		System.out.println("_____________");
	}
}
