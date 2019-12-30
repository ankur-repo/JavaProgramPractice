package com.fis.cloning;

public class Demo implements Cloneable {

	int a;
	int b;
	Person person;

	public Demo(int a, int b, Person person) {
		this.a = a;
		this.b = b;
		this.person = person;
	}

	public Object clone() throws CloneNotSupportedException {
		Demo d = (Demo) super.clone();
		d.person = new Person();
		return d;

	}

	public static void main(String args[]) throws CloneNotSupportedException {
		Person p = new Person();
		p.setX(100);
		p.setY(300);
		Demo demo = new Demo(10, 20, p);
		Demo demo1 = (Demo) demo.clone();
		demo1.person.setX(500);

		System.out.println("demo value::" + demo.a + "   " + demo.b + "::" + demo.person.x + "::" + demo.person.y);
		System.out.println("demo1 value::" + demo1.a + "   " + demo1.b + "::" + demo1.person.x + "::" + demo1.person.y);
	}
}
