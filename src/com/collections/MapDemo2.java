package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.oops.encapsulation.Employee;

public class MapDemo2 {

	public static void main(String[] args) {
		//Map<Employee, String> map=new HashMap<>();
		Map<String, Employee> map=new HashMap<>();
		map.put("A", new Employee("Chandan", "Kumar", 20, 5000));
		map.put("B", new Employee("Suma", "Kumari", 20, 5000));
		map.put("C", new Employee("Vineeth", "Kumar", 20, 5000));
		map.put("D", new Employee("Sowmaya", "Kumari", 20, 5000));
		
		Set<String> keys=map.keySet();
		for(String key: keys) {
			System.out.println(key+"\t"+ map.get(key));
		}
				/*A	Employee [firstName=Chandan, lastName=Kumar, age=20, salary=5000.0]
				B	Employee [firstName=Suma, lastName=Kumari, age=20, salary=5000.0]
				C	Employee [firstName=Vineeth, lastName=Kumar, age=20, salary=5000.0]
				D	Employee [firstName=Sowmaya, lastName=Kumari, age=20, salary=5000.0]
				*/
		
		Map<Employee, String> map2=new HashMap<>();
		Employee e1 = new Employee("Chandan", "Kumar", 20, 5000);
		Employee e2 = new Employee("Suma", "Kumari", 20, 5000);
		Employee e3 = new Employee("Vineeth", "Kumar", 20, 5000);
		Employee e4 = new Employee("Sowmya", "Kumari", 20, 5000);
		
		map2.put(e1, "A");
		map2.put(e2, "B");
		map2.put(e3, "C");
		map2.put(e4, "D");
		map2.put(e4, "E");
		
		System.out.println(map2.get(e4));//E
		
		Set<Employee> keys2=map2.keySet();
		for(Employee key: keys2) {
			System.out.println(key+"\t"+ map2.get(key));
		}
		
		
	}

}
