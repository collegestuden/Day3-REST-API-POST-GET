package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Familys")
public class Day3Entity {
	@Id

	@Column(name="age")
	private int age;
	@Column(name="relation")
	private String relation;
	@Column(name="name")
	private String name;
	
	
	
	
	
	public Day3Entity (int age, String relation,String name) {
		super();
		this.age = age;
		this.relation = relation;
		this.name = name;
		
	}
	public Day3Entity() {
		
	}
	
	public int getage(){
		return age;
	}
	public void setid(int age) {
		this.age = age;
	}
	public String getrelation() {
		return relation;
	}
	public void setrelation(String relation) {
		this.relation = relation;
	}
	public String getname() {
		return name ;
	}
	public void setname(String name) {
		this.name= name;
	}
	public String toString() {
		return "age="+age+"relation="+relation+"name="+name;
	}
}