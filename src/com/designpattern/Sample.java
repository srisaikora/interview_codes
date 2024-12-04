package com.designpattern;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.phone.OS;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;

class Employee {
	public String name;
	public int salary;
	public Employee(String name,int salary) {
		this.name = name;
		this.salary = salary;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		return 100*name.length() + this.salary;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(name, other.name) && salary == other.salary;
	}
	
}


public class Sample {
	
	public static void main(String[] args) {
		Employee e1 = new Employee("sai",1000);
		HashMap<Employee,Integer> e1map = new HashMap<Employee,Integer>();
		e1map.put(e1, 100);
		e1.setName("sai kora");
		System.out.println(e1map.get(e1));
		
		String name = "srisaikora";
		
		HashMap<Character,Long> freq = name.chars().mapToObj(ch->(char) ch).collect(Collectors.groupingBy(e->e,LinkedHashMap::new,Collectors.counting()));
		System.out.println(freq);
	}
	
    public static String twoStrings(String s1, String s2) {
    	String output;
    	char[] s1List = s1.toCharArray();
    	ArrayList<Character> s1CharList = new ArrayList<Character>();
    	for(char s1Val:s1List) {
    		s1CharList.add(s1Val);
    	}
        for(char s2Val:s2.toCharArray()) {
            if(s1CharList.contains(s2Val)) {
                output = "YES";
                return output;
            }
        }
        output = "NO";
        return output;
    }

}


