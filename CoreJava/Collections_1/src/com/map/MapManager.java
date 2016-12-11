package com.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;



public class MapManager {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(12,"xyz");
		map.put(13,"pqr");
		map.put(14,"ctr");
		map.put(14,"ctr2");
		map.put(null,"ctr2");
		//System.out.println(map);
		
		Map lmap = new LinkedHashMap();
		lmap.put(12,"xyz");
		lmap.put(13,"pqr");
		lmap.put(14,"ctr");
		lmap.put(14,"ctr2");
		lmap.put(null,"ctr2");
		//System.out.println(lmap);
		
		Map tmap = new TreeMap();
		
		tmap.put(13,"pqr");
		tmap.put(14,"ctr");
		tmap.put(14,"ctr2");
		tmap.put(12,"xyz");
		//tmap.put(null,"ctr2");
		
		
		//System.out.println(tmap);
		
		
		
		Student s1 = new Student(20, "abc");
		Student s2 = new Student(16, "xyz");
		Student s3 = new Student(27, "pqr");
		Student s4 = new Student(27, "pqr");
		
		Map tmap2 = new HashMap();
		tmap2.put(s1, "S1 student");
		tmap2.put(s2, "S2 student");
		tmap2.put(s3, "S3 student");
		tmap2.put(s4, "S4 student");
		
		System.out.println(tmap2);
		
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
