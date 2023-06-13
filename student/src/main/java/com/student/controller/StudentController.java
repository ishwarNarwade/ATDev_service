package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.Student;
import com.student.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService ss;
	
	
	//-->>getall student
	@GetMapping("showAllStudent")
	public List<Student> showAllStudent()
	{
		return ss.showAllStudent();
	}
	
	//-->>insert student
	@PostMapping("insertStudent")
	public Student insertStudent( @RequestBody Student st)
	{
		return ss.insertStudent(st);
	}
	
	//-->>update student
	@PutMapping("updateStudent")
	public Student updateStudent( @RequestBody Student st)
	{
		return ss.updateStudent(st);
	}
	
	
	//-->>delete student
	@DeleteMapping("deleteStudent/{sid}")
	public Student deleteStudent( @PathVariable int sid)
	{
		return ss.deleteteStudent(sid);
	}
		
	
	//-->>get  student by sid
	@GetMapping("getStudent/{sid}")
	public Student getStudent( @PathVariable int sid)
	{
		return ss.getStudent(sid);
	}

	

}
