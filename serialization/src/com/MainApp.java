package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainApp {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
			Student s1 =new Student(151,"raj",989898);
			Student s2 =new Student(152,"rajs",989898);
			Student s3 =new Student(153,"raji",989898);
			Student s4 =new Student(154,"raju",989898);
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			System.out.println(s4);
			
			FileOutputStream fs = new FileOutputStream("hello.txt");
			ObjectOutputStream ous = new ObjectOutputStream(fs);
				ous.writeObject(s1);
				ous.writeObject(s2);
				ous.writeObject(s3);
				ous.writeObject(s4);
				ous.close();
				
				System.out.println("Written to file");
				System.out.println("Fetching data from file");
				
				try (ObjectInputStream ois = new ObjectInputStream (new FileInputStream("hello.txt"))) {
					while(true) {
					Student s = (Student) ois.readObject();

					
					System.out.println("Marks="+s.marks);
					System.out.println("name="+s.name);
					System.out.println("mobile no="+s.mobno);
					}
				}
				
			}
}

