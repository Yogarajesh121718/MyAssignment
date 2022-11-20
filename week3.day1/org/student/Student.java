package org.student;

import org.college.*;
import org.department.*;

public class Student extends College {

	public void studentName() 
	{
		System.out.println("Student Name : Yogarajesh");

	}

	public void studentDept() {
		System.out.println("Student Dept : CSE");

	}

	public void studentId() {
		System.out.println("Student ID : 50464");

	}

	public static void main(String[] args) {
		 
		Student st = new Student();
				
		st.studentDept();
		st.collegeCode();
		st.collegeName();
		st.collegeRank();
		st.deptName();
		st.studentId();
		st.studentName();

	}
}
