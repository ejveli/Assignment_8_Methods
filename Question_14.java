package Assignment_8_Methods;

public class Question_14 {

	public static void main(String[] args) {

		boolean a = false;
		boolean b = false;
		boolean c = true;

		System.out.println(threeLocks(a, b, c));
	}

	public static boolean threeLocks(boolean x, boolean y, boolean z) {

		if ((x && y) || z) {
			return true;
		} else
			return false;

	}

}
