package Assignment_8_Methods;

import java.util.Scanner;

public class Question_6 {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		System.out.print("enter number: ");
		int num = inp.nextInt();

		next3(num);

	}

	public static int next3 (int num) {

		for (int i = num + 1; i <= num + 3; i++) {
			System.out.print(i + " ");

		}

		return num;
	}

}
