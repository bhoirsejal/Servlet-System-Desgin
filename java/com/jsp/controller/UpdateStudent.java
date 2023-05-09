package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

@WebServlet("/update")
public class UpdateStudent extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String s_id = req.getParameter("id");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String loc = req.getParameter("loc");

		int id = Integer.parseInt(s_id);

		Student student = new Student();
		student.setName(name);
		student.setEmail(email);
		student.setLoc(loc);

		StudentService studentService = new StudentService();
		Student student2 = studentService.updateStudent(student, id);

		RequestDispatcher requestDispatcher = req.getRequestDispatcher("home.jsp");
		requestDispatcher.forward(req, resp);

	}

}
