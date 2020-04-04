package com.wipro.student.exception;

public class StudentInvalidYearOfBirthException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5293416698142896025L;

	@Override
	public String toString() {
		return("Please Input Valid Year Of Birth.");
	}

}
