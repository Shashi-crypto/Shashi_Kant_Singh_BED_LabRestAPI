package com.greatlearning.student.service;

import java.util.List;

import com.greatlearning.student.dto.StudentDto;
import com.greatlearning.student.entity.Student;

public interface StudentService {

	List<Student> printAll();

	String update(Student student);

	String delete(int studentId);

	String addStudent(StudentDto studentDto);

}