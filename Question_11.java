package Assignment_8_Methods;

import java.util.Scanner;

public class Question_11 {

	public static void main(String[] args) {

		System.out.println(c_profits(20, 5));

	}

	public static String c_profits(int buyPrice, int sellPrice) {

		String a;

		if (buyPrice < sellPrice) {
			a = "profit";
		} else if (buyPrice > sellPrice) {
			a = "loss";
		} else {
			a = "no loss";
		}
		
		return a;

	}

}
