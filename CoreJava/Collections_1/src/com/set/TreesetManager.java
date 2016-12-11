package com.set;

import java.util.Set;
import java.util.TreeSet;

public class TreesetManager {

	
	public static void main(String[] args) {

		Set tset = new TreeSet();
		
		Student s1 = new Student(20, "abc");
		Student s2 = new Student(16, "xyz");
		Student s3 = new Student(27, "pqr");
		
		tset.add(s1);
		tset.add(s2);
		tset.add(s3);
		System.out.println(tset);
	}

}
class Student implements Comparable
{
	int age;
	String name;
	
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public int compareTo(Object paramT) {
		Student s = (Student)paramT;
		return -(this.age-s.age);
	}
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
}