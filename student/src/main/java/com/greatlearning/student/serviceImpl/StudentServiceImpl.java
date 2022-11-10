package com.greatlearning.student.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.student.dto.StudentDto;
import com.greatlearning.student.entity.Student;
import com.greatlearning.student.repository.StudentRepository;
import com.greatlearning.student.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> printAll() {
		return studentRepository.findAll();
	}

	@Override
	public String update(Student student) {
		// TODO Auto-generated method stub
		if (studentRepository.existsById(student.getStudentId())) {
			studentRepository.saveAndFlush(student);
			return "Data Updated successfully";
		} else
			return "Please enter the correct data to update";

	}

	@Override
	public String delete(int studentId) {
		if (studentRepository.existsById(studentId)) {
			studentRepository.deleteById(studentId);
			return "Data deleted successfully";
		} else
			return "Please enter the correct data to delete";
	}

	@Override
	public String addStudent(StudentDto studentDto) {
		if (studentDto != null) {
			Student student = new Student(studentDto.getName(), studentDto.getDepartment(), studentDto.getCountry());
			student.setStudentId(0);
			studentRepository.saveAndFlush(student);
			return "Data Added successfully";
		} else
			return "Please enter the correct data to delete";
	}

}
