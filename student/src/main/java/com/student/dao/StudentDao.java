package com.student.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.student.model.Student;

@Repository
public class StudentDao {

	@Autowired
	SessionFactory sf;
	
	
	public List<Student> showAllStudent() {
		Session s=sf.openSession();
		
		Criteria c=s.createCriteria(Student.class);
		List<Student> studList=c.list();
		s.close();
		
		return studList;
	}


	public Student insertStudent(Student st) {
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		s.save(st);
		tr.commit();
		s.close();
		return st;
	}


	public Student updateStudent(Student st) {
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		s.update(st);
		tr.commit();
		s.close();
		return st;
	}


	public Student deleteStudent(int sid) {
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		Student st=s.get(Student.class,sid);
	
		s.delete(st);
		tr.commit();
		s.close();
		return st;
	}


	public Student getStudent(int sid) {
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		Student st=s.get(Student.class,sid);
		
		tr.commit();
		s.close();
		return st;

	}

}
