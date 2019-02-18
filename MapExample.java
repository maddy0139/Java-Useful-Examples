import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {

	public static void main(String args[])
	{
		String str1 = "abc";
		String str2 = "xyz";
		String str3 = str1+str2;
		String str4 = "abcxyz";
		
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		
		
		Map<String, List<Employee>> map = new HashMap();
		List<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee(1, "Mahendra"));
		employees.add(new Employee(2, "Abhinav"));
		employees.add(new Employee(3, "Lakshay"));
		employees.add(new Employee(4, "Satya"));
		
		map.put("1", employees);
		
		map.forEach((k,v)->{
			System.out.println(k);
			List<Employee> emp = v;
			//emp.remove(0);
			map.get(k).forEach(values->{
				System.out.println(values.getName());
			});
			map.get(k).remove(0);
			map.get(k).forEach(values->{
				System.out.println(values.getName());
			});
		});
		
		
	}
}
