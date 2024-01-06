package com.raj.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.raj.dao.EmployeeDao;
import com.raj.entity.Employee;
import com.raj.util.HibernateUtil;

@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String department = req.getParameter("department");
		String password = req.getParameter("password");
		
		System.out.println(req.getParameter("condition"));
		
		Employee employee = new Employee(name,email,department,password);
		EmployeeDao empDao = new EmployeeDao(HibernateUtil.getSessionFactory());
		boolean f =empDao.saveEmployee(employee);
		HttpSession session = req.getSession();
		if(f) {
			session.setAttribute("msg", "You Have Register Successfully!");
			System.out.println("You Have Register Successfully!");
		}else {
			session.setAttribute("msg", "Something went wrong on server!");
			System.out.println("Something went wrong on server!");
		}
		resp.sendRedirect("index.jsp");
	}
	
	

}
