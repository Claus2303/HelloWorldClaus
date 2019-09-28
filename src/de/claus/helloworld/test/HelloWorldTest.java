package de.claus.helloworld.test;

public class HelloWorldTest {

	public int add(int a, int b) {
		int result = a+b;
		return result;
	}
	
	public int delete(int a, int b) {
		int result = 0;
		
		if(a<b) {
			result = b-a;
		}
		else {
			result = a-b;
		}
		return result;
	}
	
}
