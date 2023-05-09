package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jsp.service.StudentService;

@WebServlet("/delete")
public class DeleteStudent extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String s_id = req.getParameter("id");
		int id = Integer.parseInt(s_id);

		StudentService studentService = new StudentService();
		studentService.deleteStudent(id);

		PrintWriter printWriter = resp.getWriter();
		printWriter.write("<html><head><body><h1>Student Record Deleted</h1></body></head></html>");

	}

}
