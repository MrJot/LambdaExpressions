package com.udemy.interfaces.predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Main {


		public static void main(String[] args) {
			
			Employee john = new Employee("John Doe", 23);
			Employee tim = new Employee("Tim Doe", 15);
			Employee jack = new Employee("JAck Doe", 33);
			Employee snow = new Employee("Snow Doe", 20);
			Employee phil = new Employee("Phil Doe", 50);
			Employee luke = new Employee("luke Doe", 15);
			Employee tom = new Employee("tom Doe", 77);
			
			
			ArrayList <Employee> employees = new ArrayList<Employee>();
			
			addEmpToArrayList(employees, john,tim,jack,snow,phil,luke,tom);
			
			Function<Employee,String> getLastName = emp->{
				return emp.getName().substring(emp.getName().indexOf(" ")+1);
			};
			
//			Function<Employee, String> getLastName = new Function<Employee, String>() {
//
//				@Override
//				public String apply(Employee t) {
//					return t.getName().substring(t.getName().indexOf(" ")+1);
//				}
//			};
			

			employees.forEach(emp->{
				System.out.println("EMPLOYEE LAST NAME: "+getLastName.apply(emp));
			});
			

			employees.forEach(emp->{
				System.out.println(emp.getName());
				System.out.println(emp.getAge());
			});
			
			printEmployeesByAge(employees, "Age below 30", emp->emp.getAge()<30);
			printEmployeesByAge(employees, "Age above 30", emp->emp.getAge()>30);
			
			//PREDICATE USING ANONYMOUS CLASS
			printEmployeesByAge(employees, "=========CUSTOM MESSAGE", new Predicate<Employee>(
					) {
						@Override
						public boolean test(Employee t) {
							return t.getAge()<25;
						}
			});
			
			
			
			//
			
			IntPredicate intp = i->i<15;
			
			System.out.println("IntPredicate test: "+intp.test(10));
			
		
		}


		
		
//USING LAMBDA EXPRESSION
		
		public static void printEmployeesByAge(List<Employee> employees,String message, Predicate<Employee> ageCondition ) {
			System.out.println("Print Employyes by AGE");
			System.out.println("***************************");
			employees.forEach(emp->{
				if(ageCondition.test(emp)) {
					System.out.println(message+"--->"+emp.getName());
				}
			});
			
		}
		
	
//CLASSICAL LOOP
		
//		public static void printEmployeesByAge(List<Employee> employees,String message, Predicate<Employee> ageCondition ) {
//			System.out.println("Print Employyes by AGE");
//			System.out.println("***************************");
//			for(Employee emp:employees) {
//				if(ageCondition.test(emp)) {
//					System.out.println(message+"--->"+emp.getName());
//				}
//			}
//			
//		}
		
		public static ArrayList<Employee> addEmpToArrayList(ArrayList<Employee> empList, Employee...emps){
			for(Employee smallEmp:emps) {
				empList.add(smallEmp);
			}
			return empList;
		}
	

}
