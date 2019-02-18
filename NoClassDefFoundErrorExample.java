class Greetings 
{
    void greeting()
    {
        System.out.println("hello!");
    }
}
public class NoClassDefFoundErrorExample {

	//compile the class it will generate two .class file
	//now remove Greetings.class file and run the program
	//it will give NoClassdefFoundError
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greetings greetings = new Greetings();
		greetings.greeting();
	}
}
