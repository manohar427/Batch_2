package com.ser;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Ser_Demo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
      /*  Student std = new Student(12,"Abc","abc@gmail.com");
        
        //1.
        FileOutputStream fo = new FileOutputStream("student.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fo);
        
        oos.writeObject(std);
        oos.close();*/
		
		FileInputStream fi = new FileInputStream("student.txt");
		ObjectInputStream oi = new ObjectInputStream(fi);
		Student std = (Student)oi.readObject();
		oi.close();
		System.out.println(std);
	}

}
class Student implements Serializable
{
	int age;
	String name;
	String email;
	public Student(int age, String name, String email) {
		this.age = age;
		this.name = name;
		this.email = email;
	}
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", email=" + email
				+ "]";
	}
}