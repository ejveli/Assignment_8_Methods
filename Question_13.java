package Assignment_8_Methods;

public class Question_13 {

	public static void main(String[] args) {

		System.out.println(waterTax(55));

	}

	public static double waterTax(double units) {

		double bill = 0.0;

		if (units <= 50) {
			bill = units * 0.60;
		} else if (units > 50) {
			bill = units * 0.90;
			if (units > 100 && units <= 150) {
				bill += 50;
			}
			if (units > 150) {
				bill += 100;
			}
		}

		return bill;

	}
}