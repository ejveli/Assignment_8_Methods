package Assignment_8_Methods;

import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {

		plus();

	}

	public static void plus() {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first number:");
		int num1 = scan.nextInt();

		System.out.println("Enter second number:");
		int num2 = scan.nextInt();

		int sum = 0;

		sum = num1 + num2;

		System.out.println("result:" + sum);
	}

}
