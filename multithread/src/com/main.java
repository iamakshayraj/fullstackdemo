package com;

class A extends Thread{
	public void run()
	{
		for(int i=0;i<5;i++)
			System.out.println("I="+i);
	}
}
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = new A();
		Thread t1 =  new Thread(a1);
		t1.start();
	
		for(int j=0;j<5;j++)
			System.out.println("j value is "+j);
		

	}

}
