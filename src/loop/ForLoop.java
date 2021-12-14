package loop;

public class ForLoop {

	public static void main(String[] agr) {
		for (int i = 0; i < 20; i++) { // i=i+1

			if (i == 7 || i==10) {
				continue;
			}

			if (i == 12) {
				break;
			}

			System.out.println(i);
		}
	}
}
