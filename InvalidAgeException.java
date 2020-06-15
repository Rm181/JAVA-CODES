package com.app;

public class InvalidAgeException extends Exception {

	String msg;

	public InvalidAgeException() {  //constructor 
		msg = "Invalid Age";  //it gives exception
	}

	public InvalidAgeException(String msg) {  //parametarized exception
		this.msg = msg;     // same msg
	}

	@Override
	public String getMessage() { //function overriden to return msg
		return msg;               
	}

}
