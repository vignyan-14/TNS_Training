package com.c2tc.inheritance;

public class InheritanceMain {
public static void main(String[] args) {
	RegularUser ru = new RegularUser(111,"sai","sai@gmail.com",5);
	
	if(ru instanceof User) {
		System.out.println("Regular User : "+ru);
	}
}
}
