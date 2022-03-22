package com.worldline.myproject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
public class Student {

String fname;
String lname;
int age;



public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(String fname, String lname, int age) {
	super();
	this.fname = fname;
	this.lname = lname;
	this.age = age;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Student [fname=" + fname + ", lname=" + lname + ", age=" + age + "]";
}


}
