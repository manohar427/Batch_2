package com.jdk.enumdemo;

public class EnumsDemo {


	public static void main(String[] args) {
getPersonDetails(12, "Abc", GenderType.FEMALE,Calendar.FEB);
	}

	public static void getPersonDetails(int age ,String name,GenderType gender,Calendar cal){
		System.out.println("Age:"+age+",Name:"+name+",gend:"+gender+",Cal days:"+cal.days());
	}
}
