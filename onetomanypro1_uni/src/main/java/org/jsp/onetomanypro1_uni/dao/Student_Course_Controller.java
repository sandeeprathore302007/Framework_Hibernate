package org.jsp.onetomanypro1_uni.dao;

import java.util.ArrayList;
import java.util.List;

import org.jsp.onetomanypro1_uni.dto.Course;
import org.jsp.onetomanypro1_uni.dto.Student;

public class Student_Course_Controller {
	
	public static void main(String[] args) {
		
		Student student   = new Student();
		
		student.setId(101);
		student.setName("Darshan");
		student.setAddress("Mumbai");
		student.setMno("5464444356");
		
		
		Course course = new Course() ;
		
		course.setCid(1);
		course.setCname("development");
		course.setTname("NageshSir");
		course.setSchedule("12:00");
		
		
Course course2 = new Course() ;
		
		course2.setCid(2);
		course2.setCname("sqL");
		course2.setTname("Vinay sir");
		course2.setSchedule("02:00");
		
		
Course course3 = new Course() ;
		
		course3.setCid(3);
		course3.setCname("J2EE");
		course3.setTname("bikas");
		course3.setSchedule("06:00");
		
		List<Course> list = new ArrayList<Course>();
		list.add(course);
		list.add(course2);
		list.add(course3);
		
	student.setCourses(list);
	
	Student_Course_Dao dao = new Student_Course_Dao();
	
	dao.saveStudentCourse(student);
	
	
		
	}

}
