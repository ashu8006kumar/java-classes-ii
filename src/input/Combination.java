package input;

import java.util.Scanner;

import conditional.Calculator;

public class Combination {
	public static void main(String[] agr) {
		Scanner scanner = new Scanner(System.in);
		boolean hasNext = true;
		while (hasNext) {
			Calculator add = new Calculator();

			System.out.print("Add number 1: ");
			add.numberOne = scanner.nextInt();

			System.out.print("Add number 2: ");
			add.numberTwo = scanner.nextInt();

			System.out.print("Add Opration: ");
			add.opration = scanner.next();
			add.calculate();
			System.out.println("If you want to continue press (1)");
			hasNext = scanner.nextInt() == 1;
		}
//		System.out.println("add values");
//		Calculator sub = new Calculator();
//		sub.numberOne = scanner.nextInt();
//		sub.numberTwo = scanner.nextInt();
//		sub.opration = scanner.next();
		scanner.close();
	}
}
