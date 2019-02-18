import java.util.Scanner;

class CustomException extends NumberFormatException{

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public CustomException(String message) {
		super(message);
		this.message = message;
	}
	
}

public class CustomExceptionExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		int number;
		try {
			number = parseInt(num);
			System.out.println(number/0);
		}
		catch (CustomException e) {
			System.out.println(e.getMessage());
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Arithmetic Exception");
		}
		
	}

	public static int parseInt(String number) throws NumberFormatException{
		try {
			return Integer.parseInt(number);
		}
		catch(NumberFormatException ex)
		{
			throw new CustomException("Wrong Input Exception");
		}
	}
}



