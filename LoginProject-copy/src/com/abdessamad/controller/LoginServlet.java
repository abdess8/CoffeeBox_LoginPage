package com.abdessamad.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.abdessamad.dao.UserDao;
import com.abdessamad.entity.UserBean;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, java.io.IOException {
		try {
			UserBean user = new UserBean();
			user.setUserName(request.getParameter("username"));
			user.setPassword(request.getParameter("password"));
			user = UserDao.login(user);
			if (user.isValid()) {
				HttpSession session = request.getSession(true);
				session.setAttribute("currentSessionUser", user);
				response.sendRedirect("success.jsp"); // logged-in page
			} else {
				response.sendRedirect("error.jsp"); // error page
			}
			
		} catch (Throwable theException) {
			System.out.println(theException);
		}
	}
}