package com.jsp.service;

import java.util.List;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentService {

	StudentDao studentDao = new StudentDao();

	// Save Student
	public Student saveStudent(Student student) {
		return studentDao.saveStudent(student);
	}

	// Get By Id Student
	public Student getByIdStudent(int id) {
		return studentDao.getByIdStudent(id);
	}

	// Update Student
	public Student updateStudent(Student student, int id) {
		Student student2 = studentDao.getByIdStudent(id);

		if (student.getName() != null)
			student2.setName(student.getName());

		if (student.getEmail() != null)
			student2.setEmail(student.getEmail());

		if (student.getLoc() != null)
			student2.setLoc(student.getLoc());

		if (student2 != null) {
			return studentDao.updateStudent(student2);
		}
		return null;

	}

	// Delete Student
	public Student deleteStudent(int id) {
		Student student = studentDao.getByIdStudent(id);

		if (student != null) {
			return studentDao.deleteStudent(student);
		}
		return null;
	}

	// Get All Students
	public List<Student> getAllStudents() {
		return studentDao.getAllStudents();
	}

}
