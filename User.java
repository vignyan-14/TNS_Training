package com.c2tc.inheritance;

public class User {

	int uid;
	String name;
	String email;
	
	public User(int uid,String name,String email) {
		this.uid=uid;
		this.name=name;
		this.email=email;
	}
	public String toString() {
        return "uid: "+ uid +"Name: " + name + " Email: " + email ;
    }
}

