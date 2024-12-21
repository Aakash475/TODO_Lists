package com.nit.hk.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.nit.hk.dao.UserDao;
import com.nit.hk.model.User;

@WebServlet("/register")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserDao userDao;

	public void init() {
		userDao = new UserDao();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		register(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("register/register.jsp");
	}

	private void register(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String fullName = request.getParameter("fullName");
		String email = request.getParameter("email");
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		User employee = new User();
		employee.setFullName(fullName);
		employee.setEmail(email);
		employee.setUsername(username);
		employee.setPassword(password);

		try {
			int result = userDao.registerEmployee(employee);
			if(result == 1) {
				request.setAttribute("NOTIFICATION", "User Registered Successfully!");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher("register/register.jsp");
		dispatcher.forward(request, response);
	}

}
