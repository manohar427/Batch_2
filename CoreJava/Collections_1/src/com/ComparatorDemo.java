package com;

import java.util.*;

public class ComparatorDemo {
	public static void main(String[] args) {

		Student s1 = new Student("Pqr",10);
		Student s2 = new Student("Abc",12);
		Student s3 = new Student("Klm",4);
		Student s4 = new Student("Xyz",17);
		Student s5 = new Student("Rty",16);
		
		List list = new ArrayList();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		Collections.sort(list,new Student_Age());
		System.out.println(list);
		Collections.sort(list,new Student_Name());
		System.out.println(list);
	}
}

class Student implements Comparable{
	String name;
	int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	public int compareTo(Object paramT) {
		Student s = (Student)paramT;
		return this.age-s.age;
	}
}
class Student_Age implements Comparator
{
	public int compare(Object arg0, Object arg1) {
		Student s1 = (Student)arg0;
		Student s2 = (Student)arg1;
		return s1.age-s2.age;
	}
}

class Student_Name implements Comparator
{
	public int compare(Object arg0, Object arg1) {
		Student s1 = (Student)arg0;
		Student s2 = (Student)arg1;
		return s1.name.compareTo(s2.name);//100-103
	}
}