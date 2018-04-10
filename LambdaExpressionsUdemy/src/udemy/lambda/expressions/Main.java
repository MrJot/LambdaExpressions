package udemy.lambda.expressions;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
	
//		//new Thread(new codeToRun()).start();
//		
//		new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("Another print of Runnable");
//				
//			}
//		}).start();
//		
//		
//
//	}
		
//		new Thread(()-> {
//			System.out.println("Lamba prints from Runnable");
//			System.out.println("Line Two");
//			System.out.println("Line Three");
//		}).start();
		
	
		
		
//		//()-> System.out.println("Lamba prints from Runnable")
//		
//		Employee john = new Employee("John Doe", 30);
//		Employee tim = new Employee("Tim Doe", 45);
//		Employee jack = new Employee("JAck Doe", 22);
//		Employee snow = new Employee("Snow Doe", 55);
//		
//		List <Employee> employees = new ArrayList<>();
//		employees.add(john);
//		employees.add(tim);
//		employees.add(jack);
//		employees.add(snow);
//		
////		Collections.sort(employees, new Comparator<Employee>() {
////
////			@Override
////			public int compare(Employee employee1, Employee employee2) {
////				return employee1.getName().compareTo(employee2.getName());
////			}
////		});
//		
////		Collections.sort(employees,(Employee emp1, Employee emp2)-> emp1.getName().compareTo(emp2.getName()));
//		
//		//Compiler will know what the type is, therefore we can remove it from code
//		
//		Collections.sort(employees,(emp1, emp2)-> emp1.getName().compareTo(emp2.getName()));
//		
//		for (Employee employee:employees) {
//			System.out.println(employee.getName());
//		}
//		
////		byte[] byteValue = doImportantStuff(new doOperationsOnString() {
////			
////			@Override
////			public byte[] getByteCode(String word) {
////				return word.getBytes();
////			}
////		}, "Korniszon");
////		
////		System.out.println(Arrays.toString(byteValue));
//		
////		doOperationsOnString op = (word)->word.getBytes();
////		
////		byte[] byteValue=doImportantStuff(op, "Korniszon");
////		
////		System.out.println(Arrays.toString(doImportantStuff(op, "Korniszon")));
////		

		
		
		
		
}
	
	public static byte[] doImportantStuff(doOperationsOnString stuff, String word) {
		return stuff.getByteCode(word);
	}

//class codeToRun implements Runnable{
//
//	@Override
//	public void run() {
//		System.out.println("Printing from the Runnable");
//		
//	}
//	
//	
//}
}

class Employee{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	

	
	
	
}
