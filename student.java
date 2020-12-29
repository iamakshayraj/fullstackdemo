package com;

public class student {

		private int rollno;
		private int marks;
		private int phoneno;
		private String name;
		private String collegename;
		
		public int getrollno() {
			return rollno;
		}
		public void setrollno(int rollno) {
			this.rollno=rollno;
		
		}
		public int getMarks() {
			return marks;
		}
		public void setMarks(int marks) {
			this.marks = marks;
		}
		public int getPhoneno() {
			return phoneno;
		}
		public void setPhoneno(int phoneno) {
			this.phoneno = phoneno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCollegename() {
			return collegename;
		}
		public void setCollegename(String collegename) {
			this.collegename = collegename;
		}
		@Override
		public String toString() {
			return "student [rollno=" + rollno + ", marks=" + marks + ", phoneno=" + phoneno + ", name=" + name
					+ ", collegename=" + collegename + "]";
	     }
		
}