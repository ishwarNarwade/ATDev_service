package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dao.StudentDao;
import com.student.model.Student;

@Service
public class StudentService {

	
	@Autowired
	StudentDao sd;
	
	public List<Student> showAllStudent() {
		return sd.showAllStudent();
	}
	

	public Student insertStudent(Student st) {
		return sd.insertStudent(st);
	}


	public Student updateStudent(Student st) {
		
		return sd.updateStudent(st);
	}


	public Student deleteteStudent(int sid) {
		return sd.deleteStudent(sid);
	}


	public Student getStudent(int sid) {
		return sd.getStudent(sid);
	}

}
