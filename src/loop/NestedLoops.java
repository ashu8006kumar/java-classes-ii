package loop;

public class NestedLoops {
	public static void main(String[] agr) {
		for (int i = 0; i < 5; i++) {
			for (char j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
