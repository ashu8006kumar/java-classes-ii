
public class IfElse {
	public static void main(String arg[]) {
//		System.out.println("Out for walk ");
//		boolean hasWallet = false;
//		if (hasWallet) {
//			System.out.println("Enjoy your food.");
//		}
//		System.out.println("Back to home ");

//		System.out.println("Out for walk ");
//		int money = 1000;
//		if (money >= 500) {
//			System.out.println("Enjoy your starbuck.");
//		} else {
//			System.out.println("Enjoy normal coffee.");
//		}
//		System.out.println("Back to home ");

		System.out.println("Out for drive ");
		int roadNumber = 1;
		if (roadNumber == 3) {
			System.out.println("goto left");
		} else if (roadNumber == 10) {
			System.out.println("goto right");
		} else if (roadNumber == 11) {
			System.out.println("goto right then take first left");
		} else {
			System.out.println("We don't have any idea ");
		}
		System.out.println("Reached at final point");
		char oprator='+';
		switch (oprator) {
		case '-': 
			System.out.println("its a subtraction");
			break;
		case '+':
			System.out.println("goto right");
			break;
		default:
			System.out.println("We don't have any idea ");
			break;
		}
		
	}

}
