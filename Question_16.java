package Assignment_8_Methods;

public class Question_16 {

	public static void main(String[] args) {

		System.out.println(simpleRoomBook(false,2,1,2018));
	}

	public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year)
	  {
	   if (month == 7 && (day > 1 && day < 8)) {
				if (isAvailable = false) {
					return true;

				} else if (isAvailable = true) {

					return false;
				}

			}
			if(year!=2018) {
			  
				return false;
			}

			return isAvailable;
		}
	}
