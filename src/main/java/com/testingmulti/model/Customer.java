package com.testingmulti.model;

import java.io.Serializable;

public class Customer implements Serializable {


    private static final long serialVersionUID = 1L;
    private String name;
    private Long age;

    public Customer(String name, Long age) {
        this.name = name;
        this.age = age;
    }

    public Customer() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public Customer setName(String name) {
        this.name = name;
        return this;
    }

    public Long getAge() {
        return age;
    }

    public Customer setAge(Long age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*	public Customer(){
    }

	public Customer(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "{" + name  + "}";
	}*/
}
