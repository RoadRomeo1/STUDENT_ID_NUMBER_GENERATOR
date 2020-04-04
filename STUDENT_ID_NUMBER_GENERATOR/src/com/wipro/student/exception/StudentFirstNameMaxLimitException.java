package com.wipro.student.exception;

public class StudentFirstNameMaxLimitException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
         		
		return("Student First Name Maximum Limit Exceeded.");
	}
	
	

}
