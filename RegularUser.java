package com.c2tc.inheritance;

import java.time.LocalDate;

public class RegularUser extends User {

	int activeDaysInWeek;
	public RegularUser(int uid, String name, String email,int activeDaysInWeek) {
		super(uid, name, email);
		
		// TODO Auto-generated constructor stub
		this.activeDaysInWeek=activeDaysInWeek;
	}
	@Override
	public String toString() {
        return super.toString() +" Active days :"+activeDaysInWeek;
    }
}
