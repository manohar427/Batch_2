package com.jdk;

public class BoxingDemo {

	public static void main(String[] args) {
       int age = 10;
       double a =12;
       Double d = a;
       Integer in = new Integer(age);//JDK 1.4
       System.out.println("Age:"+age);
       System.out.println("Age Integer:"+in);
       
       Integer intGe =age;//Boxing
       
       int myAge = intGe;//Un boxing
	}

}
