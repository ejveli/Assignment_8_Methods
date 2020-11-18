package Assignment_8_Methods;

import java.util.Scanner;

public class Question_7 {

	public static void main(String[] args) {

		Scanner c = new Scanner(System.in);
		int num = c.nextInt();
		
		int num2,a,b=0 ;
		num2=num;

		do {
			
			a = num2 % 10;
			num2 = num2 / 10;
			b=b*10+a;
			
			
		}while(num2!=0);
		
		if(num==b) {
			System.out.println(true);
			
		}else {
		
		System.out.println(false);
		}
	}
}
