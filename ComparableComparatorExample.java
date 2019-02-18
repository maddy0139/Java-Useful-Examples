
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class User implements Comparable<User>{

	private int id;
	private String name;
	private double salary;
	
	public User(int id, String name, double salary) {
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

	@Override
	public int compareTo(User object) {
		// TODO Auto-generated method stub
		return this.getId()-object.getId();
	}
	
}
public class ComparableComparatorExample {

	public static void main(String args[]) {
		List<User> userList = new ArrayList();
		
		userList.add(new User(3, "Mahendra", 500000));
		userList.add(new User(1, "Abhinav", 500000));
		userList.add(new User(2, "Satya", 500000));
		
		userList.forEach(item->{
			System.out.println(item.getId());
		});
		
		Collections.sort(userList);
		userList.forEach(item->{
			System.out.println(item.getId());
		});
		
		Comparator<User> nameComparator = Comparator.comparing(User::getName);
		Collections.sort(userList, nameComparator);
		
		/*
		 Comparator<User> nameComparator = new Comparator<User>(){
		 
		 	@Override
		 	public int compare(User u1,User u2)
		 	{
		 		return u1.getName().compareTo(u2.getName());
		 	}
		 }
		 
		 nameComparator = (u1,u2) -> u1.getName().compareTo(u2.getName());
		 * */
		
		userList.forEach(item->{
			System.out.println(item.getName());
		});
		
		
	}
	
}
