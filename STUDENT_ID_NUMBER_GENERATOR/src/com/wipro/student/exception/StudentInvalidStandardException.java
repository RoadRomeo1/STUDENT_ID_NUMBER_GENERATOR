package com.wipro.student.exception;

public class StudentInvalidStandardException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		 return ("Please Input Valid Standard.");
	}

}
