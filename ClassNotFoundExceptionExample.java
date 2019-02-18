
public class ClassNotFoundExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("Home");
		}
		catch(ClassNotFoundException ex)
		{
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}

}
