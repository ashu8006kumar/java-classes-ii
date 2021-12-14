
public class Test {

	public static void main(String[] arg) {
		Student arha = new Student();
		arha.name = "Arha";
		arha.rollNumber = 21;
		arha.printData();
		System.out.println("counter Arha-"+arha.counter);

		Student sam = new Student();
		sam.name = "Sam";
		sam.rollNumber = 1;
		sam.printData();

		Student ram = new Student();
		ram.name = "Ram";
		ram.rollNumber = 13;
		ram.printData();
		
		System.out.println(arha.rollNumber); 
		System.out.println("counter Arha-"+arha.counter);
	}
}
