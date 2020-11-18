package Assignment_8_Methods;

public class Question_10 {

	public static void main(String[] args) {

		int x = 11;

		System.out.println(isEven(x));

	}

	public static boolean isEven(int num1) {

		boolean flag = true;

		if (num1 % 2 != 0 || num1 == 0) {

			flag = false;

		}
		return flag;
	}
}