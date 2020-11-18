package Assignment_8_Methods;

import java.util.Scanner;

public class Question_5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter number:");
		int number = scan.nextInt();

		sign(number);

	}

	public static void sign(int number) {

		if(number>0) {
			System.out.println(1);
		}else if(number<0) {
			System.out.println(-1);
		}else {
			System.out.println(0);
		}
		
	}
}
