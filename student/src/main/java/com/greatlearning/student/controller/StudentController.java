package com.greatlearning.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.student.dto.StudentDto;
import com.greatlearning.student.entity.Student;
import com.greatlearning.student.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;

	@GetMapping("/printAll")
	public List<Student> printAll() {
		return studentService.printAll();
	}

	@PostMapping("/addStudent")
	public String addStudent(StudentDto studentDto) {
		return studentService.addStudent(studentDto);
	}

	@PutMapping("/update")
	public String update(Student student) {
		return studentService.update(student);
	}

	@DeleteMapping("/delete")
	public String delete(int studentId) {
		return studentService.delete(studentId);
	}

}
