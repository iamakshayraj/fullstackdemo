package com;

import java.io.Serializable;

public class Student implements Serializable {
	int marks;
	String name;
	int mobno;
	
	Student(int x, String y, int z)
	{
		marks=x;
		name=y;
		mobno=z;
	}

	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + ", mobno=" + mobno + "]";
	}
	
}
