package com.jdk.enumdemo;

 enum GenderType {
		MALE("male"),FEMALE("female");
		
		String n;
		GenderType(String name){
			n=name;
		}
		public String toString() {
			return n;
		}
}
enum Calendar
{
	JAN(30),FEB(27),MAR(31);
	int d;
	 private Calendar(int day){
		 d=day;
	 }
	public int days() {
		return d;
	}
}