package com.wipro.student.exception;

public class StudentLastNameMaxLimitException extends Exception{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return("Student Last Name Maximum Limit Exceeded.");
	}

	
}
