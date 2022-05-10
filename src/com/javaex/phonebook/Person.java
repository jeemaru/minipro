package com.javaex.phonebook;

public class Person {

	public String name;
	public String hp;
	public String of;
	
	
	public Person() {
		super();
	}


	public Person(String name, String hp, String of) {
		super();
		this.name = name;
		this.hp = hp;
		this.of = of;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getHp() {
		return hp;
	}


	public void setHp(String hp) {
		this.hp = hp;
	}


	public String getOf() {
		return of;
	}


	public void setOf(String of) {
		this.of = of;
	}


	@Override
	public String toString() {
		return  name + "  " + hp + "   " + of;
	}
	
	
	
	
}
