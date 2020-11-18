package Assignment_8_Methods;

import java.util.Scanner;

public class Question_8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		fib(num);
	}

	public static void fib(int num) {
		int num1 = 0;
		int num2 = 1;
		int sum = 0;

		for (int i = 1; i <= num; i++) {

			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}
		System.out.print(num1);

	}

}
