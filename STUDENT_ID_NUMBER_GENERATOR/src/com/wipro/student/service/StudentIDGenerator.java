package com.wipro.student.service;

import java.util.Calendar;
import java.util.Random;

import com.wipro.student.basic.Student;
import com.wipro.student.exception.StudentFirstNameMaxLimitException;
import com.wipro.student.exception.StudentInvalidGenderException;
import com.wipro.student.exception.StudentInvalidStandardException;
import com.wipro.student.exception.StudentInvalidYearOfBirthException;
import com.wipro.student.exception.StudentLastNameMaxLimitException;

public class StudentIDGenerator {

	public static boolean validateStudentDetails(Student studentObject) throws Exception {
		boolean status=false;
	    int Currentyear = Calendar.getInstance().get(Calendar.YEAR);  	// calculates current year
		int counter=0;
		/*
		 * String gender1="male"; String gender2="female";
		 */
		
		if(studentObject.getFirstName().length()>20) {
			StudentFirstNameMaxLimitException ex1=new StudentFirstNameMaxLimitException();
			counter++;
			throw ex1;
		}
		
		else if(studentObject.getLastName().length()>25) {
			StudentLastNameMaxLimitException ex2=new StudentLastNameMaxLimitException();
			counter++;
			throw ex2;
		}
		
		else if((studentObject.getStandard()<=0)||(studentObject.getStandard()>=11)) {
			StudentInvalidStandardException ex3=new StudentInvalidStandardException();
			counter++;
			throw ex3;
		}
		
		
		else if((!(studentObject.getGender().toLowerCase().equalsIgnoreCase("male")))&&(!(studentObject.getGender().toLowerCase().equalsIgnoreCase("female")))){
			StudentInvalidGenderException ex4=new StudentInvalidGenderException();
			counter++;
			throw ex4;
		}
		
		else if((Currentyear-studentObject.getYearOfBirth())<3) {
			StudentInvalidYearOfBirthException ex5=new StudentInvalidYearOfBirthException();
			counter++;
			throw ex5;
		}
		
		if(counter==0) {
			status=true;
		}
		
		return status;
	}
	
	
	public static String generateStudentID(Student student) throws Exception {
	
		String ID="";
		
		boolean status=validateStudentDetails(student);

        if(status==false) {
        	System.out.println("Student ID Not Generated. Please Enter Proper Details.");
        }
        else if(status==true) {
          ID=student.getFirstName().charAt(0)+""+student.getFirstName().charAt(1);
          ID=ID+""+student.getLastName().charAt(0);
          ID=ID+""+student.getGender().charAt(0);
          ID=ID+""+student.getYearOfBirth()%100;
          ID=ID+""+Random();
        		  
        }
        
		
		return ID;
	}
	
	
	public static String Random(){
		String randomNum="",randomNum2="";
	    
		Random r1=new Random();  
		randomNum = String.format("%04d", r1.nextInt(10000));		   
		/*
		 * System.out.println(randomNum);
		 */
		randomNum2=randomNum.charAt(1)+""+randomNum.charAt(3);     		 
		return randomNum2;
	}
	
}
