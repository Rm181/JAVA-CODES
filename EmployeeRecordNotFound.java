package com.classEx;

public class EmployeeRecordNotFound extends Exception {

	String message;

	public EmployeeRecordNotFound() {
		message = "Record Not Present";
	}

	public EmployeeRecordNotFound(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}

}
