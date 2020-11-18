package Assignment_8_Methods;

public class Question_12 {

	public static void main(String[] args) {

		System.out.println(hamletQuote(false, false));

	}

	public static boolean hamletQuote(boolean toBe, boolean notToBe) {

		boolean a = false;

		if (toBe || notToBe) {
			a = true;
		}

		return a;

	}
}