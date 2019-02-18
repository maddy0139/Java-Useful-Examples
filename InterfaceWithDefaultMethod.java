
interface JavaEight {

	//first default method
	default void defaultMethod() {
		System.out.println("default method");
	}
	//second default method
	default void anotherDefaultMethod() {
		System.out.println("another default method");
	}
	
	public static void staticMethod() {
		System.out.println("static method");
	}
	
	public static void anotherStaticMethod() {
		System.out.println("another static method");
	}
}

class JavaEightImpl implements JavaEight{

	public JavaEightImpl() {
	}
	//this class also can have implementation of default method
  /*public void defaultMethod()
	{
		System.out.println("Implementation of default method");
	}*/
	
}

public class InterfaceWithDefaultMethod {

	public static void main(String[] args) {
		
		//creating instance of JavaEightImpl class
		JavaEightImpl impl = new JavaEightImpl();
		impl.defaultMethod();
		impl.anotherDefaultMethod();
		
		//calling static method directly without instance 
		JavaEight.staticMethod();
		JavaEight.anotherStaticMethod();

	}

}
