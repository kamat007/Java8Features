package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.stream.model.Employee;

public class StreamAPI {

	public static void main(String[] args) {
		
		/*
		 * Stream API - collection Process
		 * Collection / group of objects
		 * works also on Arrays
		 */
		
		// predicate: It takes Predicate reference as an argument.
		// Predicate is a functional interface. So, you can also pass lambda expression here.
		// It returns a new stream.
		
		// In Java 8, stream().map() lets you convert an object to something else. 
		
		// create a list and filter all even numbers without using Stream
//		List<Integer> list1 = new ArrayList<Integer>();
//		list1.add(2);
//		list1.add(3);
//		list1.add(4);
//		list1.add(5);
//		list1.add(8);
//		list1.add(9);
//		list1.add(12);
//		
//		List<Integer> listEven = new ArrayList<>();
//		for(Integer i : list1) {
//			if(i%2==0) {
//				listEven.add(i);
//			}
//		}
//		
//		System.out.println("List1: " + list1);
//		System.out.println("Even List: " + listEven);
//		
//		// Using Stream API
//		Stream<Integer> stream = list1.stream();
//		List<Integer> streamList = stream.filter(i->i%2==0).collect(Collectors.toList());
//		System.out.println("List using Stream: " + streamList);
//		
//		List<Integer> streamList1 = list1.stream().filter(i->i%2==0).collect(Collectors.toList());
//		System.out.println("Using Stream in one Line: " + streamList1);
//		
//		// greater than 3
//		List<Integer> streamList2 = list1.stream().filter(i->i>3).collect(Collectors.toList());
//		System.out.println("Greater than 3: " + streamList2);
//		
//		// 1. blank
//		Stream<Object> emptyStream = Stream.empty();
//		System.out.println("Empty Stream: " + emptyStream);
//		
//		// 2. array, object, collection
//		String names[] = {"Uttam", "Rishi", "Ritik", "Kartik"};
//		Stream<String> stream1 = Stream.of(names);
//		stream1.forEach(e->{
//			System.out.println(e);
//		});
//		
//		// 3. Builder Pattern
//		Stream<Object> streamBuilder = Stream.builder().build();
//		System.out.println("Stream Builder: " + streamBuilder);
//		
//		// 4.  Stream on Arrays
//		IntStream intStream = Arrays.stream(new int[] {2, 4, 65, 3, 564});
//		intStream.forEach(e->{
//			System.out.println(e);
//		});
//		
//		// stream on List, Set
//		List<Integer> list2 = new ArrayList<>();
//		list2.add(12);
//		list2.add(34);
//		list2.add(23);
//		list2.add(78);
//		
//		Stream<Integer> stream2 = list2.stream();
//		stream2.forEach(e->{
//			System.out.println(e);
//		});
		
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(101, "Raju", 121));
		emp.add(new Employee(102, "Shyam", 122));
		emp.add(new Employee(103, "Baburao ganpatrao apte", 123));
		emp.add(new Employee(104, "Totla seth", 124));
		emp.add(new Employee(105, "khadak singh", 125));
		emp.add(new Employee(106, "anuradha", 126));
		emp.add(new Employee(107, "deviprasad", 127));
		
		HashMap<Employee, String> empHash = new HashMap<>();
		
	//	System.out.println(emp.get(1));
		
		for (int i=0; i<emp.size(); i++) {
			empHash.put(emp.get(i), "Emp " + i);
		}
		System.out.println(empHash.get(4));
		
//		Map<Integer, String> map = new HashMap<>();
//		map = emp.stream().collect(Collectors.toMap(Employee::getId, Employee::getName));
//		map.entrySet().forEach(map1 -> {
//			System.out.println(map1.getKey() + " " + map1.getValue());
//		});
	}
}
