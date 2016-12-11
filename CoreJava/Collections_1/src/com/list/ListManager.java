package com.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ListManager {

	public static void main(String[] args) {
         
		ArrayList aList = new ArrayList();
		aList.add(10);//0
		aList.add(145);//1
		aList.add(145);//2
		aList.add("Xyz");//3
		aList.add("A");//4
		
		//32
		
		//1.
		System.out.println("elements:"+aList);
		//2.
		Iterator itera = aList.iterator();
		while(itera.hasNext()){
			System.out.println(itera.next());
		}
		System.out.println("Lenght:"+aList.size());
		//3.
		for(int i=0;i<aList.size();i++){
			System.out.println(aList.get(i));
		}
	}

}
