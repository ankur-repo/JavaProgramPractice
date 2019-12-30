package com.fis.generaljava;

import java.util.Objects;

public class Student {
	
	private int id;
	private String name;
	private String  passport;
	
	public Student(int id, String name, String passport) {
		this.id = id;
		this.name = name;
		this.passport = passport;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, passport);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if(!(obj instanceof Student))
			return false;
		Student st = (Student) obj;
		return st.id == id && st.name.equals(name) && st.passport.equals(passport);
	}
	
	

}
