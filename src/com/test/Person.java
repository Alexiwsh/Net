package com.test;
import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = 3482314192692351792L;
	private String name;
	private int age;
	Person(String n, int a){
		name = n;
		age = a;
	}
	@Override
	public String toString(){
		return name + " with age " + age;
	}

}
