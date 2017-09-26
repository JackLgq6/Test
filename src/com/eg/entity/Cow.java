package com.eg.entity;

import com.eg.base.Animal;

public class Cow extends Animal {

	private String sex;
	private int age;

	public Cow() {
		super();
	}

	public Cow(String sex, int age) {
		super();
		this.sex = sex;
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void fertility() {

	}

	@Override
	public void sell() {

	}

}
