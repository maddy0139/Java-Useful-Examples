import java.util.Objects;

class ObjectClass implements Cloneable{
	private int id;
	private String name;
	
	public ObjectClass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjectClass other = (ObjectClass) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ObjectClass [id=" + id + ", name=" + name + "]";
	}
	
	@Override
    protected void finalize()
    {
        System.out.println("finalize method called");
    }
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
}
public class ObjectClassMethods {

	
	public static void main(String[] args) {
		
		ObjectClass object1 = new ObjectClass(1,"Test");
		ObjectClass object2 = new ObjectClass(2, "Test");
		
		//toString() method of Object Class
		System.out.println(object1.toString());
		
		//hasCode() method of Object class
		System.out.println(object1.hashCode());
		
		//getClass() is also method of Object class so it is by default provided
		System.out.println(object1.getClass());
		
		//equals() method of Object class 
		System.out.println(object1.equals(object2));
		
		try 
		{
			//clone() method of Object class
			ObjectClass object3 = (ObjectClass)object1.clone();
			System.out.println(object3.toString());
		} 
		catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
