package Assignment_8_Methods;

public class Question_15 {
	
	public static void main(String[] args) {
		
		System.out.println(validateTask(true,2,1));
	}

	 public static boolean validateTask(boolean notEmpty,int taskId,int currentId)
		{
			if (notEmpty == true || notEmpty == false) {
				if (currentId == taskId - 1) {
					if (notEmpty == true) {
						return true;
					}
				}
			}
			return false;
		}
	}

