package loop;

public class PrintTriangleNumbers {

	public static void main(String[] agr) {
		int index = 1;
		for (int row = 0; row < 10; row++) {	
			for (int col = 0; col <= row; col++) {
				System.out.print(index++);
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
}
