package Assignment_8_Methods;

import java.util.Scanner;

public class Question_9 {

	public static void main(String[] args) {

		int x=11;
		int max=5;
		
		System.out.println(max(x,max));
		
	}

	public static int max(int num1,int num2) {

		if(num1>num2) {
			return num2;
		}else return num1;

	}

}
