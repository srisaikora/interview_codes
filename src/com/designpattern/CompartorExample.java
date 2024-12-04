package com.designpattern;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

// Comparable uses compareTo method where compartor uses compare method
//Comparable is an interface which effect main class but compartor will not effect main class
//Comparable is applicable for single sorting compartor we can use for multiple sorting
class Student implements Comparable<Student> {
	public Student(int age, String name) {
		this.age = age;
		this.name = name; 
	}
	Integer age;
	String name;
	@Override
	public int compareTo(Student o) {
		if(this.age == o.age) {
			return this.name.compareTo(o.name);
		} else if(this.age>o.age) {
			return 1;
		} else {
			return -1;
		}
	}
	
}

public class CompartorExample {
	public static void main(String args[]) {
	Comparator<Student> ageCompartor = new Comparator<Student>() {
		@Override
		public int compare(Student a, Student b) {
			if(a.age == b.age) {
				return a.name.compareTo(b.name);
			}
			else if(a.age>b.age) {
				return 1;
			} else {
				return -1;
			}
		}
	};
	// Comparotor with lambda expressions
	Comparator<Student> ageCompartorlmdExp = (s1,s2) -> {
		if(s1.age == s2.age) {
			return s1.name.compareTo(s2.name);
		} else if(s1.age>s2.age) {
			return 1;
		} else {
			return -1;
		}
	};
	Comparator<Student> nameCompartor = new Comparator<Student>() {
		@Override
		public int compare(Student a, Student b) {
			return a.name.compareTo(b.name);
		}
	};
	// Comparator with lambda expressions
	Comparator<Student> nameCompartorLamdaexp = (a1,a2)-> {
		return a1.name.compareTo(a2.name);
	};
	
	ArrayList<Student> empList = new ArrayList<Student>();
	empList.add(new Student(10,"abc"));
	empList.add(new Student(10,"sai"));
	empList.add(new Student(60,"sri"));
	empList.add(new Student(40,"kora"));
	empList.add(new Student(30,"gompa"));
	empList.add(new Student(20,"cd"));
	//Collections.sort(empList,ageCompartor);
	empList.stream().sorted(nameCompartorLamdaexp).forEach(emp->System.out.println("age:"+emp.age + " name:"+emp.name));
	}
}
