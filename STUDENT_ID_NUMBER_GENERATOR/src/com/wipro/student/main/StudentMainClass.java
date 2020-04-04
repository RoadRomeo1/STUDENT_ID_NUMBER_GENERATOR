package com.wipro.student.main;

import java.util.Scanner;
import com.wipro.student.basic.Student;
import com.wipro.student.service.StudentIDGenerator;


public class StudentMainClass {
public static void main(String[] args) throws Exception {
	
	Scanner sc=new Scanner(System.in);
	
	Student student=new Student();
	
	System.out.println("Welcome....");
	
	System.out.println("Please Enter your First Name....");
	student.setFirstName(sc.nextLine());	
	
	System.out.println("Please Enter your Last Name....");
	student.setLastName(sc.nextLine());
	
	System.out.println("Please Enter your Standard....");
	String t=sc.nextLine();
	student.setStandard(Integer.valueOf(t));
	
	System.out.println("Please Enter your Gender....");
	student.setGender(sc.nextLine());
	
	System.out.println("Please Enter your Year of Birth....");
	student.setYearOfBirth(sc.nextInt());
	
	System.out.println("Welcome aboard your iD is: "+StudentIDGenerator.generateStudentID(student));
	sc.close();
	}
}
