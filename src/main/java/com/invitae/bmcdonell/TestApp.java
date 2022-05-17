package com.invitae.bmcdonell;

//import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestApp {

	public static void main(String[] args) {
		System.out.println((new TestApp()).getMessage());
	}
	
	public String getMessage() {
		return "Hello, github actions.";
	}
}
