package Assignment_8_Methods;

import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {

		cube();

	}

	public static void cube() {

		Scanner scan = new Scanner(System.in);

		System.out.print("input:");
		int number = scan.nextInt();

		int cube = number*number*number;

		System.out.println("cube:" + cube);
	}

}