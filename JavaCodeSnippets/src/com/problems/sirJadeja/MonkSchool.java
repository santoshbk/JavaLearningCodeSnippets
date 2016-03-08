package com.problems.sirJadeja;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MonkSchool {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		long M = in.nextLong();
		Set<Student> students = new TreeSet<>();
		Set<Teacher> teachers = new HashSet<>();
		for (int i = 0; i < N; i++) {
			teachers.add(new Teacher(in.nextLine()));
		}
		for (int i = 0; i < M; i++) {
			String teach = in.next("[a-z]");
			String stud = in.next("[a-z]");
			int age = in.nextInt();
			Teacher teacher = new Teacher(teach);
			Student s = new Student(stud, age, teacher);
			students.add(s);
		}
	}
}

class Teacher
{
	String name;
	Set<Student> students;
	public Teacher(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(null!=obj)
			return false;
		if(!(obj instanceof Teacher)){
			return false;
		}
		Teacher t = (Teacher) obj;
		if(this.name!=t.name){
			return false;
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		return 13+(13*name.hashCode());
	}
}
class Student implements Comparable<Student>
{
	String name;
	int age;
	Teacher teacher;
	public Student(String name,int age, Teacher teacher)
	{
		this.name = name;
		this.age = age;
		this.teacher = teacher;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public int compareTo(Student o) {
		return this.age - o.getAge();
	}
}
