package org.jsp.onetomanypro1_uni.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

 
import org.jsp.onetomanypro1_uni.dto.Course;
import org.jsp.onetomanypro1_uni.dto.Student;

public class Student_Course_Dao {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	private EntityManager manager = factory.createEntityManager();
	private EntityTransaction transaction = manager.getTransaction();

	public void saveStudentCourse(Student student) {
		transaction.begin();
		manager.persist(student);
		transaction.commit();
	}

	public void UpdateCourse(int id, List<Course> courses) {
		Student courseStudent = manager.find(Student.class, id);

		if (courseStudent != null) {
			List<Course> courses2 = courseStudent.getCourses();
			transaction.begin();
			courses2.addAll(courses);
			courseStudent.setCourses(courses2);
			manager.merge(courseStudent);
			transaction.commit();
		} else {
			System.out.println(id + " not found Enroll Please");
		}
	}

	public void updateStudent(Student student) {
		transaction.begin();
		manager.merge(student);
		transaction.commit();

	}

	public void FindStudent(int id) {
		Student student = manager.find(Student.class, id);
		if (student != null) {
			System.out.println(student);
		}

		else {
			System.out.println(id + " not found ");
		}
	}

	public void deleteDetails(int id) {
		Student student = manager.find(Student.class, id);
		if (student != null) {
			manager.remove(student);
			System.out.println("Done");
		} else {
			System.out.println(id + " not found");
		}

	}

	public void findAll() {
		Query query = manager.createQuery("select f from Flipkart f");
		List<Student> list = query.getResultList();
		System.out.println(list);

	}

}
