package com.jsp.student.demo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class Home extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String save = req.getParameter("save");
		String update = req.getParameter("update");
		String delete = req.getParameter("delete");
		String getById = req.getParameter("getById");
		String viewAll = req.getParameter("viewAll");

		if (save != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("save.jsp");
			requestDispatcher.forward(req, resp);
		} else if (update != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("update.jsp");
			requestDispatcher.forward(req, resp);
		} else if (delete != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("delete.jsp");
			requestDispatcher.forward(req, resp);
		} else if (getById != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("getById.jsp");
			requestDispatcher.forward(req, resp);
		} else if (viewAll != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("viewAll.jsp");
			requestDispatcher.forward(req, resp);
		} else {
			return;
		}
	}

}
