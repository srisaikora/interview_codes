package com.designpattern;

import java.util.ArrayList;
import java.util.function.Predicate;

class Stud{
	public Stud(int age, String name) {
		this.age = age;
		this.name = name; 
	}
	Integer age;
	String name;
}

public class PredicateExample {
	static Predicate<Stud> ageFilter = s -> s.age>30;
	public static void main(String[] args) {
		ArrayList<Stud> empList = new ArrayList<Stud>();
		empList.add(new Stud(10,"abc"));
		empList.add(new Stud(10,"sai"));
		empList.add(new Stud(60,"sri"));
		empList.add(new Stud(40,"kora"));
		empList.add(new Stud(30,"gompa"));
		empList.add(new Stud(20,"cd"));

		empList.stream().filter(ageFilter).forEach(x->System.out.println(x.name));
	}
}
