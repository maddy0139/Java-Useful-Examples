import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class HashSetUser {

	private int id;
	private String name;
	private double salary;
	
	public HashSetUser(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	//if commented equals and hascode methods hashset will have duplicate values
	//as hashset can not check duplicates for objects
	@Override
	public boolean equals(Object o) {
		if(this == o)
			return true;
		if(o == null || getClass() != o.getClass())
			return false;
		HashSetUser user = (HashSetUser) o;
		return id == user.id;
	}
	
	//in hashCode method we are checking with id so if id is different then object will be different
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

	
}
public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<HashSetUser> userSet = new HashSet<>();
		userSet.add(new HashSetUser(3, "Mahendra", 500000));
		userSet.add(new HashSetUser(1, "Satya", 500000));
		userSet.add(new HashSetUser(2, "Abhinav", 500000));
		userSet.add(new HashSetUser(3, "Mahendra", 500000));
		
		userSet.forEach(user ->{
			System.out.println(user);
		});
	}

}
