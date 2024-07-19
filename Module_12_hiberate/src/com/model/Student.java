package com.model;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="Student")
@Cacheable
@Cache(usage= CacheConcurrencyStrategy.READ_ONLY)
public class Student implements Serializable{

	@Id
	private int rollno;
	private String studentname;
	private String gender;
	private int age;
	
	public Student() {
		System.out.println("Student created");
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", studentname=" + studentname + ", gender=" + gender + ", age=" + age
				+ "]";
	}

	
}
